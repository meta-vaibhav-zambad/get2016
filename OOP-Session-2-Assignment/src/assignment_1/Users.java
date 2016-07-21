/**
 * 
 */
package assignment_1;

import java.io.PrintWriter;

/**
 * @author vaibhav
 *
 */
public class Users {
	
	ConsoleOperations consoleOperations = new ConsoleOperations();
	
	FileOperations fileOperations = new FileOperations();
	
	private int numberOfUsers;
	
	public void setUsers(){
		
		try{
			
			this.numberOfUsers = consoleOperations.getPositiveInteger("Please enter valid number of users");
			
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ ex.getMessage());
		}
	}
	
	public int getUsers(){
		
		return numberOfUsers;
	}
	
}
