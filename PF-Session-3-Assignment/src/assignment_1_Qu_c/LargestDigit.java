/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 * 
 * Aim : to find the largest digit in the given number recursively
 *
 */

// package name reflects the assignment number and question number
package assignment_1_Qu_c;

// required imports to use inbuilt function for taking input values from user
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LargestDigit {
	
	
	/**
	 * @param args
	 * 
	 * main method to manually test the program
	 */
	public static void main(String[] args) {
		
		// object of LargsetDigit class
		LargestDigit largestDigit = new LargestDigit();
		
		
		// calling the function to compute the largest digit  
		// printing the largest digit 
		System.out.println("Largest digit in given number is : "+ 
							largestDigit.computeLargestDigit(largestDigit.readNumber(),0));
		
		

	}
	
	/**
	 * 
	 * @param number (integer)
	 * @param maxDigit (integer)
	 * @return largest digit in number (integer)
	 * 
	 * this method computes the largest digit in 
	 * number recursively by storing the last digit of number 
	 * and comparing it with maxDigit. If the maxDigit is less than digit then 
	 * the digit is stored into maxDigit.
	 * then the number is divided by 10 to get the next digit from last
	 * if number becomes zero then the recursion stops
	 */
	
	public int computeLargestDigit(int number,int maxDigit){
		
		if(number == 0){
			
			return maxDigit;
		}
		
		int digit = number % 10;
		
		if(digit > maxDigit){
			
			maxDigit = digit;
		}
		
		return computeLargestDigit(number / 10,maxDigit);
	}
	
	/**
	 * 
	 * @return number (integer)
	 * 
	 * this method takes input from user for number and store it in a variable
	 * Exception Handling is done. It also checks for valid input. If the input is valid then it 
	 * is returned else the print message is displayed again to take valid input
	 *  
	 */
	private int readNumber(){
		
		// condition for input
		while(true){
			
			// applied try and catch for exceptions
			try{
				
				// printing the message
				System.out.println("Please enter valid value of number");
				
				// taking input from user through Buffered Reader class
				int number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking for valid input and handling it
				while(number < 0){
					
					System.out.println("Please enter valid value of number");
					
					number = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid input
				return number;
				
			}catch(Exception ex){
				
				System.out.println(ex.getMessage());
			}
		}
	}
}