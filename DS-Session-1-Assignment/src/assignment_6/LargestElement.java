/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : to display third largest element in an array 
 * with using only single loop and without sorting.
*/

package assignment_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LargestElement {

	// entry point of program
	public static void main(String[] args) {
				
		// object of BinarySearch 
		LargestElement largestElement = new LargestElement();
				
		// variable to store the number of elements in array
		int arrayCount = largestElement.readArrayCount();
				
		// array is initialized with the elements
		int[] array = largestElement.readArray(arrayCount);
		
		System.out.println("third largest element is: "+largestElement.findThirdLargestElement(array));
		
		

	}
	
	/**
	 * @param array
	 * @return the third largest element of array
	 * 
	 * this method returns the third largest element of array
	 */
	public int findThirdLargestElement(int[] array){
		
		// variables 
		int thirdLargestElement = 0,secondLargestElement = 0 , firstLargestElement = 0 , loopVariable = 0;
		
		try{
			
			while(loopVariable < array.length ){
				
				// if the element is greater than firstLargest then start the loop again
				// set firstLargest to it
				if(array[loopVariable] > firstLargestElement){
					
					firstLargestElement = array[loopVariable];
					
					loopVariable = -1;
				}
				
				// if the element is greater than secondLargest and less than firstLargest then 
				// set secondLargest to it
				else if(array[loopVariable] < firstLargestElement && array[loopVariable] > secondLargestElement){
					
					secondLargestElement = array[loopVariable];
					
					loopVariable = -1;
			 	}
				
				// but if the element is less than secondLargest and greater than thirdLargest then
				// set thirdLargest to it
				else if(array[loopVariable] < secondLargestElement && array[loopVariable] > thirdLargestElement){
					
					thirdLargestElement = array[loopVariable];

				}
				
				// increment loop variable
				loopVariable++;
				
			}
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return thirdLargestElement;
		
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
		
		// message for user
		System.out.println("Please enter the valid count of number of elements in array");
		
		while(true){
			
			// applied try-catch for exceptions
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

}