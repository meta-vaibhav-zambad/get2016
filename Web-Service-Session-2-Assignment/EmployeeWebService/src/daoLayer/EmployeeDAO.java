package daoLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

/**
 * @author admin
 *
 */
public class EmployeeDAO {

	private Connection connection;

	public EmployeeDAO(Connection connection){

		this.connection = connection;
	}

	public boolean addEmployee(Employee employee){

		String sqlQuery = "INSERT INTO employeeinfo (ID,EmployeeName,EmployeeAge) "
				+ "Values (? , ? , ? );";

		boolean flag = false;
		PreparedStatement prepareStatement = null;
		try{

			if(this.connection != null){
				prepareStatement = this.connection.prepareStatement(sqlQuery);
			}
			if(prepareStatement != null){

				prepareStatement.setString(1, employee.getId());
				prepareStatement.setString(2, employee.getName());
				prepareStatement.setInt(3, employee.getAge());

				prepareStatement.executeUpdate();

				flag = true;
			}

		}catch(Exception ex){
			ex.printStackTrace();
		}

		return flag;
	}

	public List<Employee> selectEmployeeBasedOnID(String employeeID){

		String sqlQuery = "SELECT ID,EmployeeName,EmployeeAge FROM employeeinfo "
				+ "WHERE ID = ?;";

		PreparedStatement prepareStatement = null;

		List<Employee> listOfEmployee = null;

		try{

			listOfEmployee = new ArrayList<Employee>();

			if(this.connection != null){

				prepareStatement = this.connection.prepareStatement(sqlQuery);

			}
			if(prepareStatement != null){

				prepareStatement.setString(1, employeeID);

				ResultSet resultSet = prepareStatement.executeQuery();

				if(resultSet != null){


					while(resultSet.next()){

						Employee employee = new Employee();
						employee.setId(resultSet.getString(1));
						employee.setName(resultSet.getString(2));
						employee.setAge(resultSet.getInt(3));
						listOfEmployee.add(employee);
					}

				} 
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}

		return listOfEmployee;

	}

	public List<Employee> selectEmployeeBasedOnName(String employeeName){

		String sqlQuery = "SELECT ID,EmployeeName,EmployeeAge FROM employeeinfo "
				+ "WHERE EmployeeName = ?;";

		PreparedStatement prepareStatement = null;

		List<Employee> listOfEmployee = null;

		try{

			listOfEmployee = new ArrayList<Employee>();

			if(this.connection != null){

				prepareStatement = this.connection.prepareStatement(sqlQuery);

			}
			if(prepareStatement != null){

				prepareStatement.setString(1, employeeName);

				ResultSet resultSet = prepareStatement.executeQuery();

				if(resultSet != null){

					while(resultSet.next()){

						Employee employee = new Employee();
						employee.setId(resultSet.getString(1));
						employee.setName(resultSet.getString(2));
						employee.setAge(resultSet.getInt(3));
						listOfEmployee.add(employee);
					}

				} 
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}

		return listOfEmployee;

	}

	public List<Employee> selectAllEmployee(){

		String sqlQuery = "SELECT ID,EmployeeName,EmployeeAge FROM employeeinfo;";

		PreparedStatement prepareStatement = null;

		List<Employee> listOfEmployee = null;

		try{

			listOfEmployee = new ArrayList<Employee>();

			if(this.connection != null){

				prepareStatement = this.connection.prepareStatement(sqlQuery);

			}
			if(prepareStatement != null){

				ResultSet resultSet = prepareStatement.executeQuery();

				if(resultSet != null){    

					while(resultSet.next()){

						Employee employee = new Employee();
						employee.setId(resultSet.getString(1));
						employee.setName(resultSet.getString(2));
						employee.setAge(resultSet.getInt(3));
						listOfEmployee.add(employee);
					}

				} 
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}

		return listOfEmployee;

	}

	public boolean deleteEmployee(String employeeID){

		String sqlQuery = "DELETE FROM employeeinfo WHERE ID = ?;";

		boolean flag = false;

		PreparedStatement prepareStatement = null;
		try{

			if(this.connection != null){
				prepareStatement = this.connection.prepareStatement(sqlQuery);
			}
			if(prepareStatement != null){

				prepareStatement.setString(1, employeeID);

				prepareStatement.executeUpdate();

				flag = true;
			}

		}catch(Exception ex){
			ex.printStackTrace();
		}

		return flag;
	}
}