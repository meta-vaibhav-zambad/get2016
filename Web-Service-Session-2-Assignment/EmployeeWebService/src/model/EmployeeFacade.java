package model;

import java.util.List;

import daoLayer.EmployeeDAO;
import daoLayer.ConnectionFactory;

public class EmployeeFacade {

	public List<Employee> selectAllEmployees(){

		ConnectionFactory connectionFactory = null;

		List<Employee> employeeList = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			EmployeeDAO employeedao = new EmployeeDAO(connectionFactory.getConnection());

			employeeList = employeedao.selectAllEmployee();
		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		return employeeList;
	}

	public boolean addEmployees(Employee employee){

		ConnectionFactory connectionFactory = null;
		boolean result = false;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			EmployeeDAO employeedao = new EmployeeDAO(connectionFactory.getConnection());

			if(employeedao.addEmployee(employee)){

				result = true;
			}
		}catch(Exception ex){

			ex.printStackTrace();
		}

		return result;
	}

	public List<Employee> selectEmployeeBasedOnId(String employeeID){

		ConnectionFactory connectionFactory = null;

		List<Employee> employeeList = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			EmployeeDAO employeedao = new EmployeeDAO(connectionFactory.getConnection());

			employeeList = employeedao.selectEmployeeBasedOnID(employeeID);
		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		return employeeList;
	}
	
	public List<Employee> selectEmployeeBasedOnName(String employeeName){

		ConnectionFactory connectionFactory = null;

		List<Employee> employeeList = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			EmployeeDAO employeedao = new EmployeeDAO(connectionFactory.getConnection());

			employeeList = employeedao.selectEmployeeBasedOnName(employeeName);
		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		return employeeList;
	}
	
	public boolean deleteEmployeeBasedOnId(String employeeID){
		
		ConnectionFactory connectionFactory = null;
		boolean result = false;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			EmployeeDAO employeedao = new EmployeeDAO(connectionFactory.getConnection());

			if(employeedao.deleteEmployee(employeeID)){

				result = true;
			}
			
		}catch(Exception ex){

			ex.printStackTrace();
		}

		return result;
	}
}