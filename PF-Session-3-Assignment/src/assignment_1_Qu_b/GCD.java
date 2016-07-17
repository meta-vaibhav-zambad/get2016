/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 * 
 * Aim : To compute the GCD of two numbers recursively
 *
 */

// package name reflects the assignment number and question number
package assignment_1_Qu_b;

// required imports to use inbuilt function for taking input from users
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {

	/**
	 * @param args
	 * 
	 * main method to manually test the program
	 */
	
	public static void main(String[] args) {
		
		// object of GCD class 
		
		GCD gcd = new GCD();
		
		// printing the GCD of two numbers
		
		System.out.println("GCD is: "+ gcd.computeGCD(gcd.readFirstNumber(), gcd.readSecondNumber()));

	}
	
	/**
	 * @param firstNumber (integer)
	 * @param secondNumber (integer)
	 * @return gcd (integer)
	 * 
	 * this method compute the GCD of two numbers recursively
	 * 
	 */
	
	public int computeGCD(int firstNumber , int secondNumber){
		
		// base condition to stop the recursive calls which also returns the result
		if(secondNumber == 0){
			
			return firstNumber;
		}
		
		// recursively calling the same method again to compute GCD
		return computeGCD(secondNumber , firstNumber % secondNumber);
		
	}
	
	
	/**
	 * @return firstNumber (integer)
	 * 
	 * this method does not take any parameters
	 * it is created to take the user input for first number to 
	 * compute GCD 
	 */
	private int readFirstNumber(){
		
		
		// condition to take input
		while(true){
			
			
			//printing the message
			System.out.println("Please enter valid value of first number");
			
			//applied try and catch to handle exceptions
			try{
				
				// storing user input in variable through Buffered Reader class
				int firstNumber = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking whether the user input is valid or not and handling it
				while(firstNumber <= 0){
					
					System.out.println("Please enter valid value of first number");
					
					firstNumber = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
					
				}
				
				// returning the valid value of first number
				return firstNumber;
				
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
	}
	
	
	/**
	 * @return secondNumber (integer)
	 * 
	 * this method does not take any parameters
	 * it is created to take the user input for second number to 
	 * compute GCD 
	 */
	private int readSecondNumber(){
		
		
		// condition to take input
		while(true){
			
			//printing the message
			System.out.println("Please enter valid value of second number");
			
			// applied try and catch to handle exceptions
			try{
				
				// storing user input in variable through Buffered Reader class
				int secondNumber = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking whether the user input is valid or not and handling it
				while(secondNumber <= 0){
					
					System.out.println("Please enter valid value of second number");
					
					secondNumber = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid user input
				return secondNumber;
				
			}catch(Exception ex){
				
				System.out.println(ex.getMessage());
			}
			
		}	
	}
}