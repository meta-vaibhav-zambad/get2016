/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 * 
 * Aim : To compute the remainder of x divided by y recursively
 *
 */

// package name reflects the assignment number with question number
package assignment_1_Qu_a;


//required imports for inbuild function to take input
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Remainder {
	
	
	/**
	 * @param args
	 * 
	 * main method to manually test the program
	 */
	
	public static void main(String[] args) {
		
		// object of Remainder class 
		
		Remainder reminder = new Remainder();
		
		// printing the value of remainder 
		
		System.out.println("Remainder is : "+reminder.computeRemainder(reminder.readDividend(), 
									reminder.readDivisor()));
		
	}
	
	
	/**
	 * @param dividend (integer)
	 * @param divisor (integer)
	 * 
	 * This method takes two inputs dividend and divisor 
	 * and compute the remainder recursively and return it
	 *  
	 */
	
	public int computeRemainder(int dividend , int divisor){
		
		
		
		// base condition to stop the recursion and return the result
				
		if(dividend == 0 || dividend < divisor){
			return dividend;
		}
		
		/* computing the new dividend (that is the remainder) when the given dividend is divided by the
		 * given divisor 
		*/
		
		dividend -= (dividend / divisor)*divisor;
		
		//calling the same method again to follow recursion
		
		return computeRemainder(dividend, divisor); 
		
	}
	
	/**
	 * 
	 * @return dividend (integer)
	 * 
	 * This method takes no parameters.  
	 * It reads the dividend given by the user and 
	 * return it so that the dividend can be used 
	 * whenever required.
	 */
	
	private int readDividend(){
		
		// Condition to take input	
		while(true){
			
			// applied try and catch for exceptions
			try{
				
				// printing the message
				System.out.println("Please Enter valid value of dividend");
				
				// storing the value of dividend in variable through Buffered Reader class
				
				int dividend = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking whether the user has given the valid value or not and handling it
				
				while(dividend < 0 ){
					System.out.println("Please Enter valid value of dividend");
					
					dividend = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid value of dividend
				
				return dividend;
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
		
	}
	
	/**
	 * 
	 * @return divisor(integer)
	 * 
	 * This method takes no inputs.  
	 * It reads the divisor given by the user and 
	 * return it so that the divisor can be used 
	 * whenever required 
	 */
	
	private int readDivisor(){
		
		// condition to take input
		while(true){
			
			// applied try and catch for exceptions
			try{
				
				// printing the message
				System.out.println("Please Enter valid value of divisor");
				
				// storing the valid value of divisor in variable through Buffered Reader class
				
				int divisor = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking whether the user has given valid value or not and handling it.
				while(divisor <= 0){
					
					System.out.println("Please Enter valid value of divisor");
					
					divisor = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid value of divisor
				return divisor;
				
			}catch(Exception ex){
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}

}