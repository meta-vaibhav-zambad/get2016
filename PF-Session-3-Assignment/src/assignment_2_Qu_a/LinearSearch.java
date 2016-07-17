/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 * 
 * Aim : To search for a given value x in an array using Linear Search strategy
 *
 */

// package name reflects the assignment number and question number
package assignment_2_Qu_a;

// required imports to use inbuilt function to take user input
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LinearSearch {
	

	/**
	 * @param args
	 * 
	 * main method to manually test the program
	 */
	public static void main(String[] args) {
		
		// object of Linear Search class created
		LinearSearch linearSearch = new LinearSearch();
		
		// number of elements in an array is stored in variable
		int countOfArray = linearSearch.readArrayCount();
		
		// array is initialized with elements
		int[] array = linearSearch.readArray(countOfArray);
		
		// number to search for is stored in variable
		int numberToFind = linearSearch.readNumberToFind();
		
		// result is stored after calling searchElement method
		int result = linearSearch.searchElement(array,0,countOfArray - 1,numberToFind);
		
		// checking if the number to search for is same as result  
		if(result == numberToFind){
			
			// if the number is same then it is printed with the message
			System.out.println("Number Found: "+result);
		}
			
			// else if the number is not found then message is displayed for the same
			else if(result == -1){
				
				System.out.println("Number not found");
		
			}

	}
	
	/**
	 * 
	 * @param array (integer array)
	 * @param start (integer)
	 * @param end (integer)
	 * @param numberToFind (integer) 
	 * @return numberToFind (integer) - if number is found
	 * @return -1 (integer) - if the number is not found
	 * 
	 *  Linear Search is applied in this method to search for the number. 
	 *  Here the value at start index is compared with the number to search for.
	 *  If both are same then the number to search for is returned which is one of the base condition
	 *  Else the value of start index is incremented by one and again the above thing is repeated
	 *  But if the value of start index becomes greater than the end index then the array is 
	 *  completely traversed and number not found which is also the base condition 
	 *  in this case -1 is returned
	 *   
	 */
	public int searchElement(int[] array,int start,int end,int numberToFind){
		
		// base condition 1 to check if the array is completely traversed ; returns -1 if true
 		if(start > end){
			
			return -1;
		}
 			// base condition 2 to check if the number is found ; returns the number
			else if(array[start] == numberToFind){
			
				return numberToFind;
			}
 				
 				// else the same method is called again by incrementing the start index
				else return searchElement(array,start+1,end,numberToFind);
		
	}
	
	/**
	 * 
	 * @return number of elements in array (integer)
	 * 
	 * this method takes user input for the number of elements in array.
	 * Exception handling is done. It also checks for valid input. If the input is valid then it 
	 * is returned else the print message is displayed again to take valid input 
	 */
	private int readArrayCount(){
		
		// message for user to enter the count
		System.out.println("Please enter the valid count of number of element in array");
		
		// condition for input
		while(true){
			
			// applied try and catch to handle exceptions
			try{
				
				// user input for number of elements in array is stored in variable using BufferedReader class
				int countOfArray = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// checking for valid input and handling it
				while(countOfArray <= 0){
					
					System.out.println("Please enter the valid count of number of elements in array");
					
					countOfArray = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid input
				return countOfArray;
				
			}catch(Exception ex){
				
				System.out.println(ex.getMessage());
			}
		}
	}
	
	/**
	 * 
	 * @param countOfArray (integer)
	 * @return array (integer)
	 * 
	 * this method takes user input for the elements in array . 
	 * Exception handling is done.
	 */
	private int[] readArray(int countOfArray){
		
		
		while(true){
			
			// applied try and catch for exception handling
			try{
				
				// array is initialized with the count of elements in array  
				int[] array = new int[countOfArray];
				
				// elements in array are taken from user and stored using BufferedReader class 
				for(int i=0;i<countOfArray;++i){
					
					System.out.println("Please enter "+(i+1)+" th number in array");
					
					array[i] = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// array is returned
				return array;
				
			}catch(Exception ex){
				
				System.out.println(ex.getMessage());
			}
		}
	}
	
	
	/**
	 * 
	 * @return number to find (integer)
	 * 
	 * this method takes user input for the number to be searched in the array
	 * Exception Handling is done . 
	 */
	private int readNumberToFind(){
		
		// message for user 
		System.out.println("Please enter the number to find in array");
		
		
		while(true){
			
			// applied try and catch for exception handing 
			try{
				
				// number to search for is taken from user through BufferedReader class
				int numberToFind = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				// returned the number to search for
				return numberToFind;
				
			}catch(Exception ex){
				
				System.out.println(ex.getMessage());
			}
			
		}
	}
}