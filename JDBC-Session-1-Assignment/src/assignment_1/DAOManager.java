/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Write a program to fetch all the books published by author, given the name of the author. 
 *		Return the books data (List of Titles).
*/
package assignment_1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// singleton class for DAO Manager 
// this class establishes connection through properties class
public class DAOManager {

	private Connection connection;

	private Properties properties;

	/**
	 * Empty Constructor for class
	 */
	private DAOManager(){

		connection = null;

		properties = null;
	}
	
	/**
	 * This method sets the property object
	 * 
	 * @return properties object
	 */
	public Properties loadPropertiesFile(){


		InputStream inputStream =  null;

		try{

			properties = new Properties();

			inputStream = new FileInputStream("jdbc.properties");

			properties.load(inputStream);

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getLocalizedMessage());

			ex.printStackTrace();

		}finally{

			try{

				inputStream.close();

			}catch(Exception ex){

				ex.printStackTrace();
			}
		}

		return properties;
	}

	/**
	 * This method establishes connection through property object
	 * 
	 * @return Connection
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Connection getConnection() throws SQLException, ClassNotFoundException {


		properties = loadPropertiesFile();

		String driverClass = properties.getProperty("DB_DRIVER_CLASS");
		String url = properties.getProperty("DB_URL");
		String username = properties.getProperty("DB_USERNAME");
		String password = properties.getProperty("DB_PASSWORD");

		// register driver
		Class.forName(driverClass);

		// get connection
		connection = DriverManager.getConnection(url, username, password);

		return connection;

	}

	/**
	 * This method opens the connection
	 * 
	 * @return true if connection is opened else false
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean openConnection() throws SQLException, ClassNotFoundException{

		boolean result = false;

		if(this.connection == null || this.connection.isClosed()){

			this.connection = getConnection();

			result = true;

		}

		return result;
	}

	/**
	 * This method closes the connection
	 * 
	 * @return true if connection is closed else false
	 * @throws SQLException
	 */
	public boolean closeConnection() throws SQLException{

		boolean result = false;

		if(this.connection != null && !this.connection.isClosed()){

			this.connection.close();

			result = true;

		}

		return result;

	}

	/**
	 * 
	 * @return instance of DAO Manager
	 */
	public static DAOManager getInstance(){

		return DAOManagerSingleton.INSTANCE.get();
	}

	/**
	 * This class sets the new instance of DAO Manager 
	 * which is Thread Local that is in 
	 * case of Multithreading also only
	 * one connection can be established at a time
	 * 
	 * Anonymous inner singleton class 
	 *
	 */
	private static class DAOManagerSingleton{

		// Thread local Dao Manager instance
		public static final ThreadLocal<DAOManager> INSTANCE ;

		static{

			ThreadLocal<DAOManager> daoManager;

			try{
				
				// initializing daoManager object
				daoManager = new ThreadLocal<DAOManager>(){

					@Override
					protected DAOManager initialValue(){

						try{
							return new DAOManager();

						}catch(Exception ex){

							return null;
						}
					}
				};

			}catch(Exception ex){

				daoManager = null;
			}

			// set instance to daoManager
			INSTANCE = daoManager;
		}
	}
}