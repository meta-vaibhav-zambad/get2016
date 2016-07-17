/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 * Aim : To sort the given array in ascending order using Quick Sort recursively
 */


// package name reflects the assignment number and question number
package assignment_3;

// required imports to use inbuilt function to take user inputs
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSort {

	/**
	 * @param args
	 * Main method to manually test the program
	 */
	public static void main(String[] args) {
		
		// object of quick sort is made
		QuickSort quickSort = new QuickSort();
		
		// number of elements in array is stored 
		int numberOfElements = quickSort.readArrayCount();
		
		// array is initialized
		int[] array = quickSort.readArray(numberOfElements);
		
		// sorted array is computed
		array = quickSort.sortArray(array,0,numberOfElements - 1);
		
		// sorted array is printed
		System.out.println("Sorted Array is: ");
		
		for(int i = 0 ; i < numberOfElements ; ++i){
			
			System.out.println((i+1)+"th: "+array[i]);
		}

	}
	
	/**
	 * 
	 * @param array (integer)
	 * @param start (integer)
	 * @param end (integer)
	 * @return array (sorted) (integer)
	 * 
	 * this method sort the given array using QuickSort recursively
	 * 
	 * Here if start index is less than end index of array then a partition index is computed by 
	 * calling the method named partition . The partitionIndex signifies the index of element which is 
	 * placed at the correct position in array such that elements to right of it are all greater and 
	 * elements to the left are all smaller than the element at partitionIndex. 
	 * The same method is again called for the elements	from start to partitionIndex - 1 and for the elements 
	 * from partitionIndex+1 to end such that each and every element is at its correct position in array.
	 * Hence the array is sorted
	 */
	public int[] sortArray(int[] array , int start,int end){
		
		
		//condition to check to call this method again 
		if(start < end){
			
			// here the partitionIndex is computed which is the index of correctly placed element in array
			int partitionIndex = partition(array,start,end);
			
			// calling the same method from start to partitionIndex-1 to sort the left array 
			sortArray(array , start , partitionIndex - 1);
			
			// calling the same method from partitionIndex+1 to end to sort the right array
			sortArray(array , partitionIndex + 1 , end);
		}
		
		// returning sorted array
		return array;
	}
	
	/**
	 * 
	 * @param array (integer)
	 * @param start (integer)
	 * @param end (integer)
	 * @return partitionIndex (integer)
	 * 
	 *  This method computes the correct position of pivot element in array and place it there.
	 *  Here the pivot element is taken as the starting element in array. partitionIndex is taken as the 
	 *  start+1 element . Now the whole array is traversed and when the pivot element is greater than the current 
	 *  array element , it is swapped with the element at partitionIndex and partitionIndex is incremented,
	 *  to get the correct position for pivot element which is returned.  
	 */
	public int partition(int[] array,int start,int end){
		
		// taking pivot element as start element of array
		int pivot = array[start];
		
		// a variable called partitionIndex which will be used to signify the correct position of pivot element
		int partitionIndex = start + 1;
		
		// correct position is computed by traversing the whole array
		for(int i = start+1 ; i <= end ; ++i){
			
			if(pivot > array[i]){
				
				swap(array,partitionIndex,i);
				partitionIndex++ ;
			}
		}
		
		swap(array,partitionIndex - 1,start);
		
		// correct position is returned
		return (partitionIndex - 1);
	}
	
	
	/**
	 * 
	 * @param array (integer)
	 * @param index1 (integer)
	 * @param index2 (integer)
	 * 
	 * this method is used to swap the elements in array which is required in 
	 * partition method
	 */
	public void swap(int[] array,int index1,int index2){
		
		// temp is temporary variable
		int temp = array[index1];
		
		array[index1] = array[index2];
		
		array[index2] = temp;
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
		
		while(true){
			
			// applied try-catch for exceptions
			try{
				
				// message for user
				System.out.println("Please enter the valid count of number of elements in array");
				
				// user input for number of elements in array is stored in variable using BufferedReader class
				int countOfArray = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				
				// checking for valid input and handling it
				while(countOfArray < 0){
					
					System.out.println("Please enter the valid count of number of elements in array");
					
					countOfArray = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				}
				
				// returning the valid input
				return countOfArray;
				
			}catch(Exception ex){
				
				System.out.println("Invalid Input: "+ex.getMessage());
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
				
				System.out.println("Invalid Input: "+ex.getMessage());
			}
		}
	}
}