package restServer;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.istack.internal.NotNull;

import model.Employee;
import model.EmployeeFacade;

@Path("/EmployeeService")
public class EmployeeService {

	@GET
	@Path("/getAllEmployees")
	@Produces("application/json")
	public String getAllEmployees(){

		String employees = null;
		List<Employee> employeeList = null;
		EmployeeFacade facade = null;
		try{
			facade = new EmployeeFacade();
			employeeList = facade.selectAllEmployees();
			employees = DataTransformer.convertToJson(employeeList);
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return employees;
	}

	
	@POST
	@Path("/addEmployee")
	@Produces(MediaType.TEXT_PLAIN)
	public String addEmployee(@Valid @NotNull String employeeID , @Valid @NotNull String employeeName , @Valid @NotNull int employeeAge){

		Employee employee = new Employee();
		employee.setId(employeeID);
		employee.setName(employeeName);
		employee.setAge(employeeAge);
		/*Employee employee = new Employee();
		employee.setId("E332");
		employee.setName("ABC");
		employee.setAge(23);*/
		String result = "Employee Not Added.Something went wrong";
		EmployeeFacade facade = null;
		try{
			facade = new EmployeeFacade();
			if(facade.addEmployees(employee)){

				result = "Employee Added Successfully";
			}
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return result;
	}

	@POST
	@Path("/getEmployeeById")
	@Produces("application/json")
	public String getEmployeeById(String ID){

		String employees = null;
		List<Employee> employeeList = null;
		EmployeeFacade facade = null;
		try{
			facade = new EmployeeFacade();
			employeeList = facade.selectEmployeeBasedOnId(ID);
			employees = DataTransformer.convertToJson(employeeList);
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return employees;
	}
	
	
	@POST
	@Path("/getEmployeeByName")
	@Produces("application/json")
	public String getEmployeeByName(String employeeName){

		String employees = null;
		List<Employee> employeeList = null;
		EmployeeFacade facade = null;
		try{
			
			facade = new EmployeeFacade();
			employeeList = facade.selectEmployeeBasedOnName(employeeName);
			employees = DataTransformer.convertToJson(employeeList);
			
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return employees;
	}
	
	@POST
	@Path("/deleteEmployee")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmployee(String employeeID){

		String result = "Employee Not Deleted.Something went wrong";
		EmployeeFacade facade = null;
		try{
			facade = new EmployeeFacade();
			if(facade.deleteEmployeeBasedOnId(employeeID)){

				result = "Employee Deleted Successfully";
			}
		}catch(Exception ex){

			ex.printStackTrace();
		}
		return result;
	}
}