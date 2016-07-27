/**
 * @author vaibhav zambad
 * 
 * Date : 25 July 2016
 * 
 * Aim :  to define , scope and design a solution for a Social Network
 *
 */
package assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleOperations {

	// object to read input
	private BufferedReader bufferedReader;

	public ConsoleOperations(){

		// initialized object
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
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
			
			getString(message);

		}

		return inputString;

	}
}