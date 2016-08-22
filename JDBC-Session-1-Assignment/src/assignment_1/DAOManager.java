package assignment_1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAOManager {

	private Connection connection;

	private Properties properties;

	private DAOManager(){

		connection = null;

		properties = null;
	}

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

	public Connection getConnection() throws SQLException, ClassNotFoundException {

		properties = loadPropertiesFile();

		String driverClass = properties.getProperty("DB_DRIVER_CLASS");
		String url = properties.getProperty("DB_URL");
		String username = properties.getProperty("DB_USERNAME");
		String password = properties.getProperty("DB_PASSWORD");

		Class.forName(driverClass);

		connection = DriverManager.getConnection(url, username, password);

		return connection;

	}

	public void openConnection() throws SQLException, ClassNotFoundException{

		if(this.connection == null || this.connection.isClosed()){

			this.connection = getConnection();
		}
	}

	public void closeConnection() throws SQLException{

		if(this.connection != null && !this.connection.isClosed()){

			this.connection.close();
		}
	}
	
	public static DAOManager getInstance(){
		
		return DAOManagerSingleton.INSTANCE.get();
	}

	private static class DAOManagerSingleton{

		public static final ThreadLocal<DAOManager> INSTANCE ;

		static{

			ThreadLocal<DAOManager> daoManager;

			try{

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
			
			INSTANCE = daoManager;
		}
	}
}