/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// class to define all console based operations
public class ConsoleOperations {
	
	// object to read input
	private BufferedReader bufferedReader;
	
	public ConsoleOperations(){
		
		// initialized object
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	/**
	 * 
	 * @param message
	 * @return positive integer
	 */
	public int getPositiveInteger(String message){
		
		int inputNumber = 0;
		
		try{
			
			System.out.println(message);
			
			inputNumber = Integer.parseInt(bufferedReader.readLine());
			
			if(inputNumber <= 0){
				
				inputNumber = getPositiveInteger(message);
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ ex.getMessage());
			
			inputNumber = getPositiveInteger(message);
		}
		
		return inputNumber;
		
	}
	
	/**
	 * 
	 * @param message
	 * @return string
	 */
	public String getString(String message){
		
		String inputString="";
		
		try{
			
			System.out.println(message);
			
			inputString = bufferedReader.readLine();
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}
		
		return inputString;
		
	}
	
	/**
	 * 
	 * @return string
	 */
	public String getString(){
		
		String inputString="";
		
		try{
			
			inputString = bufferedReader.readLine();
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return inputString;
	}
}
