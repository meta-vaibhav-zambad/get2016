/**
 * @author vaibhav zambad
 * 
 * Date : 04 August 2016
 * 
 * Aim :  To Write a program to perform sorting on employee based on ID,Name and avoid any duplicate entries 
 * 			based on ID
*/
package assignment_1;

// class to define employee. It implements comparable interface
public class Employee implements Comparable<Employee>  {

	// variables to define an employee
	private String employeeID , employeeName , employeeAddress;

	/**
	 * Parameterized constructor to initialize employee
	 * @param employeeId
	 * @param employeeName
	 * @param employeeAddress
	 */
	public Employee(String employeeId , String employeeName , String employeeAddress){

		this.employeeID = employeeId;

		this.employeeName = employeeName;

		this.employeeAddress = employeeAddress;
	}

	/**
	 * @return employee id
	 */
	public String getEmployeeID(){

		return this.employeeID;
	}
	
	/**
	 * @return employee name
	 */
	public String getEmployeeName(){

		return this.employeeName;
	}	

	/**
	 * @return employee address
	 */
	public String getEmployeeAddress(){

		return this.employeeAddress;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){

		return "Employee ID: "+this.employeeID + " Employee Name: "+this.employeeName
				+" Employee Address: "+this.employeeAddress;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee other) {
		
		int compareValue = this.employeeID.compareTo(other.employeeID);
		
		return compareValue;
	}

}