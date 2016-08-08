/**
 * @author vaibhav zambad
 * 
 * Date : 04 August 2016
 * 
 * Aim :  To Write a program to perform sorting on employee based on ID,Name and avoid any duplicate entries 
 * 			based on ID
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// main class to define operations on employee
public class Operations  {

	// buffered reader object for input stream
	BufferedReader bufferedReader = null;

	/**
	 * Constructor to initialize buffered reader object
	 */
	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	}

	// entry method of program
	public static void main(String[] args) {

		boolean flagForNotToEndProgram = true;

		while(flagForNotToEndProgram){
			
			// operations class object
			Operations operations = new Operations();

			try{

				// variable for user choice
				int userChoice = 0;

				// variable for user permission to continue or not
				char userPermission = '\0';

				// list of employees
				List<Employee> employeeList = new ArrayList<Employee>();

				// set of employee ID
				Set<String> employeeIDSet = new HashSet<String>();

				do{

					//print message
					System.out.println("1. Add Employee");

					System.out.println("2. Sort Employees based on ID");

					System.out.println("3. Sort Employees based on name");

					userChoice = operations.getUserIntegerInput("Please enter valid choice");

					switch(userChoice){

					// add employee
					case 1:

						operations.addEmployees(employeeList,operations,employeeIDSet);

						break;

						// sort employee based on ID
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

						// sort employees based on Name
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

					// get user permission to continue or not
					userPermission = operations.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission == 'Y');

				System.out.println("Program Ended");

				// flag to end program is false
				flagForNotToEndProgram = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");

			}finally{

				try{

					// close input stream
					operations.bufferedReader.close();

				}catch(Exception ex){

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
	}

	/**
	 * This method adds employees to list
	 * 
	 * @param employeeList
	 * @param operations
	 * @param employeeIDSet
	 */
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

	}


	/**
	 * 
	 * @param message
	 * @return user input (Integer)
	 */
	public int getUserIntegerInput(String message){

		// variable for user input
		int userInput = 0;

		while(true){

			try{

				System.out.println(message);

				// taking user input
				userInput = Integer.parseInt(bufferedReader.readLine());

				while(userInput <= 0){

					System.out.println(message);

					// taking user input
					userInput = Integer.parseInt(bufferedReader.readLine());
				}

				return userInput;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}
	}

	/**
	 * 
	 * @param message
	 * @return user input (string)
	 */
	public String getUserStringInput(String message){			
		// variable for user input
		String userInput = "";

		while(true){

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

				while(userInput.length() == 0){

					System.out.println(message);

					// taking user input
					userInput = bufferedReader.readLine();

				}

				return userInput;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}
	}
}