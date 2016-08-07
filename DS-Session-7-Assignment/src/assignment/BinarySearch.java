package assignment;

// required imports to use inbuilt function to take user inputs
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BinarySearch {

	/**
	 * @param args
	 * 
	 * Main method to manually test the program
	 */
	public static void main(String[] args) {
		
		// object of BinarySearch 
		BinarySearch binarySearch = new BinarySearch();
		
		// variable to store the number of elements in array
		int arrayCount = binarySearch.readArrayCount();
		
		// array is initialized with the elements
		int[] array = binarySearch.readArray(arrayCount);
		
		// variable to store the number to search for
		int numberToFind = binarySearch.readNumberToFind();
		
		int indexOfFoundNumber = -1;
		
		// result is stored after calling searchElement method
		indexOfFoundNumber = binarySearch.searchElement(array, 0, arrayCount-1, numberToFind,indexOfFoundNumber);
		
		// checking if the number to search for is same as result
		if(indexOfFoundNumber >= 0){
			
			// if the number is same then it is printed with the message
			System.out.println("Index of Number: "+indexOfFoundNumber);
		}
			// else if the number is not found then message is displayed for the same
			else if(indexOfFoundNumber == -1){
				
				System.out.println("Number not found");
			}
	}
	
	/**
	 * 
	 * @param array (integer)
	 * @param start (integer)
	 * @param end (integer)
	 * @param numberToFind (integer)
	 * @return numberToFind (integer) - if number is found
	 * @return -1 (integer) - if the number is not found
	 * 
	 *  Binary Search is applied to search for number. Here the input array needs to be sorted
	 *  first the mid index is calculated . If the element found then index is returned.
	 *  But if the number to be searched is greater than mid number then number is searched in the 
	 *  array starting from mid_index+1 to end .
	 *  Else if the number to be searched is less then mid number then number is searched in the array starting 
	 *  from start to mid_index-1 .   
	 *  But if the start becomes greater than end then array is completely traversed and number not found so 
	 *  -1 is returned.Here leftmost occurrence of the number is returned
	 */
	public int searchElement(int[] array,int start,int end,int numberToFind,int indexOfFoundNumber){
		
		// value of midIndex is calculated
		int midIndex = (start+end)/2;
		
		// base condition to check that the array is completely traversed and number not found
		if(start > end){
		
			// indexOfFoundNumber is returned 
			return indexOfFoundNumber;
		}
			// base condition to check that the number is found
			else if(array[midIndex] == numberToFind){
				
				// store the index of found number in variable
				indexOfFoundNumber = midIndex;
				
				// number can also be present in the left side so search for that
				return searchElement(array, start, midIndex-1, numberToFind,indexOfFoundNumber);
			}
				// if number to find is less than mid number then number is searched in array from start to
				// mid-1 recursively
				else if(array[midIndex] > numberToFind){
					
					return searchElement(array, start, midIndex-1, numberToFind,indexOfFoundNumber);
				}
					// if number to find is greater than mid number then number is searched in array from mid+1
					// to end recursively
					else{
						
						return searchElement(array, midIndex+1, end, numberToFind,indexOfFoundNumber);
					}
		
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
			
			//applied try - catch for exceptions
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