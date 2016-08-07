package assignment_1;

public class Employee implements Comparable<Employee>  {

	private String employeeID , employeeName , employeeAddress;

	public Employee(String employeeId , String employeeName , String employeeAddress){

		this.employeeID = employeeId;

		this.employeeName = employeeName;

		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeID(){

		return this.employeeID;
	}

	public String getEmployeeName(){

		return this.employeeName;
	}

	public String getEmployeeAddress(){

		return this.employeeAddress;
	}

	public String toString(){

		return "Employee ID: "+this.employeeID + " Employee Name: "+this.employeeName
				+" Employee Address: "+this.employeeAddress;
	}

	@Override
	public int compareTo(Employee other) {
		
		int compareValue = this.employeeID.compareTo(other.employeeID);
		
		return compareValue;
	}

}