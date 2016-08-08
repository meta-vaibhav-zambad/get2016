/**
 * @author vaibhav zambad
 * 
 * Date : 04 August 2016
 * 
 * Aim :  To Write a program to perform sorting on employee based on ID,Name and avoid any duplicate entries 
 * 			based on ID
*/
package assignment_1;

import java.util.Comparator;

// class to define the comparator based on employee name
public class EmployeeNameComparator implements Comparator<Employee> {

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Employee firstEmployee , Employee secondEmployee) {

		int compareValue = firstEmployee.getEmployeeName().compareTo(secondEmployee.getEmployeeName());

		return compareValue;
	}

}
