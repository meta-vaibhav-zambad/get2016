package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operations  {

	BufferedReader bufferedReader = null;

	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	}

	public static void main(String[] args) {

		Operations operations = new Operations();

		try{

			int userChoice = 0;

			char userPermission = '\0';

			List<Employee> employeeList = new ArrayList<Employee>();
			
			Set<String> employeeIDSet = new HashSet<String>();

			do{

				System.out.println("1. Add Employee");

				System.out.println("2. Sort Employees based on ID");

				System.out.println("3. Sort Employees based on name");

				userChoice = operations.getUserIntegerInput("Please enter valid choice");

				switch(userChoice){

				case 1:

					operations.addEmployees(employeeList,operations,employeeIDSet);

					break;

				case 2:

					if(employeeList.size() == 0){

						System.out.println("No Employee To Show");
					}

					else{

						Collections.sort(employeeList);

						for (Employee employee : employeeList) {

							System.out.println("Employee ID: "+employee.getEmployeeID() + 
									" Employee Name: "+employee.getEmployeeName() 
									+ " Employee Address: "+employee.getEmployeeAddress());
						}
					}
					break;

				case 3:

					if(employeeList.size() == 0){

						System.out.println("No Employee To Show");
					}

					Collections.sort(employeeList, new EmployeeNameComparator());

					for (Employee employee : employeeList) {

						System.out.println("Employee Name: "+employee.getEmployeeName()
						+" Employee ID: "+employee.getEmployeeID()
						+ " Employee Address: "+employee.getEmployeeAddress());
					}

					break;

				default:

					System.out.println("Please enter a valid choice");

				}

				userPermission = operations.getUserStringInput("Press y or Y to continue").charAt(0);

			}while(userPermission == 'y' || userPermission == 'Y');
			
			System.out.println("Program Ended");

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");
			
			Operations.main(null);

		}finally{

			try{

				operations.bufferedReader.close();

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}


	}

	public void addEmployees(List<Employee> employeeList , Operations operations ,Set<String> employeeIDSet){

		String employeeID="", employeeName = "" , employeeAddress = "";

		employeeID = operations.getUserStringInput("Please enter Employee ID");

		employeeName = operations.getUserStringInput("Please enter Employee Name");

		employeeAddress = operations.getUserStringInput("Please enter employee Address");

		Employee employee = new Employee(employeeID, employeeName, employeeAddress);
		
		if(! employeeIDSet.contains(employee.getEmployeeID())){
			
			employeeIDSet.add(employeeID);
			
			employeeList.add(employee);
		}
		
		else {
			
			System.out.println("Employee ID already exists.Please select another one");
			
			addEmployees(employeeList, operations , employeeIDSet);
		}

		//return employeeList;

	}


	public int getUserIntegerInput(String message){

		// variable for user input
		int userInput = 0;

		try{

			System.out.println(message);

			// taking user input
			userInput = Integer.parseInt(bufferedReader.readLine());

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserIntegerInput(message);

		}

		return userInput;
	}

	public String getUserStringInput(String message){			
		// variable for user input
		String userInput = "";

		try{

			System.out.println(message);

			// taking user input
			userInput = bufferedReader.readLine();
			
			if(userInput.length() == 0){
				
				System.out.println(message);
				
				getUserStringInput(message);
				
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserStringInput(message);

		}

		return userInput;
	}
}
