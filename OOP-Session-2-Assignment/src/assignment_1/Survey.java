/**
 * 
 */
package assignment_1;

/**
 * @author vaibhav
 *
 */
public class Survey {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users user = new Users();
		
		user.setUsers();
		
		UserInterface display = new UserInterface();
		
		for(int i=0;i < user.getUsers() ;++i){
			
			System.out.println("Welcome User "+(i+1)+" Please enter your inputs");
			
			display.display();
			
			
		}
	}
}