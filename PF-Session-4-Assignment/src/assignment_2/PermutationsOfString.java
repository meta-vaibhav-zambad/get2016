/**
 * 
 */
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author vaibhav
 *
 */
public class PermutationsOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*public List<String> generatePermutations(String input,List<String> result){
		
		
		
	}*/
	private String readString(){
		
		while(true){
			
			try{
				System.out.println("Please enter a valid string as input");
				
				String inputString = new BufferedReader(new InputStreamReader(System.in)).readLine();
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}
}