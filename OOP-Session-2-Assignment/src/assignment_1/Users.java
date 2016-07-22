/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

//define number of users
public class Users {
	
	ConsoleOperations consoleOperations = new ConsoleOperations();
	
	private int numberOfUsers;
	
	/**
	 * to set number of users 
	 */
	public void setNumberOfUsers(){
		
		try{
			
			this.numberOfUsers = consoleOperations.getPositiveInteger("Please enter valid number of users");
			
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ ex.getMessage());
		}
	}
	/**
	 * 
	 * @return number of users
	 */
	public int getNumberOfUsers(){
		
		return numberOfUsers;
	}	
}