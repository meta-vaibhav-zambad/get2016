package assignment_1;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {


	@Override
	public int compare(Employee firstEmployee , Employee secondEmployee) {

		int compareValue = firstEmployee.getEmployeeName().compareTo(secondEmployee.getEmployeeName());

		return compareValue;
	}

}
