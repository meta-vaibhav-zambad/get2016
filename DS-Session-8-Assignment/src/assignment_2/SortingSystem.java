<<<<<<< HEAD
/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  Write a sorting system, which takes input from user and provide a sorted list. 
 * Here User could choose if he want to go with Comparison Sorting Or Linear Sorting.
*/
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingSystem {

<<<<<<< HEAD
	// buffered reader object for input stream
	BufferedReader bufferedReader = null;

	/**
	 * Constructor to initialize buffered reader object
	 */
=======
	BufferedReader bufferedReader = null;

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public SortingSystem(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	}

<<<<<<< HEAD
	// entry method of program
	public static void main(String[] args){

		// variable to not to end program
=======
	public static void main(String[] args){

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		boolean flagNotToEndProgram = true;

		while(flagNotToEndProgram){

<<<<<<< HEAD
			// object of sorting system
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
			SortingSystem sortingSystem = new SortingSystem();

			try{

<<<<<<< HEAD
				// variable for user permission
				char userPermission = '\0';
=======
				int userPermission = '\0';
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

				System.out.println("Welcome to V Sorting System");

				do{

<<<<<<< HEAD
					// variable for count of elements in array
					int countOfArray = sortingSystem.readPositiveInteger("Please enter a valid count of array");

					// to store array elements
					int[] array = new int[countOfArray];

					// read array 
					array = sortingSystem.readArray(countOfArray);

					// display choices
=======
					int countOfArray = sortingSystem.readPositiveInteger("Please enter a valid count of array");

					int[] array = new int[countOfArray];

					array = sortingSystem.readArray(countOfArray);

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					System.out.println("1. Comparison Sorting");

					System.out.println("2. Linear Sorting");

<<<<<<< HEAD
					// variable for user choice
					int userChoice = sortingSystem.readPositiveInteger("Please enter a valid choice");

=======
					int userChoice = sortingSystem.readPositiveInteger("Please enter a valid choice");
					
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					System.out.println("Sorted Order");

					switch(userChoice){

<<<<<<< HEAD
					// comparison sorting
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					case 1:

						sortingSystem.selectSortingTechniqueForComparisonSorting(array);

						break;

<<<<<<< HEAD
						// linear sorting
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					case 2:

						sortingSystem.selectSortingTechniqueForLinearSorting(array);

						break;

					default:

						System.out.println("invalid choice");
					}

<<<<<<< HEAD
					// take permission from user to continue or not
					userPermission = sortingSystem.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission == 'Y');

				System.out.println("Program Ended");

				flagNotToEndProgram = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}finally{

				try{

					// close the stream
					sortingSystem.bufferedReader.close();

				}catch(Exception ex){

=======
					userPermission = sortingSystem.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission == 'Y');
				
				System.out.println("Program Ended");
				
				flagNotToEndProgram = false;

			}catch(Exception ex){
				
				System.out.println("Something went wrong: "+ex.getMessage());
				
			}finally{
				
				try{
					
					sortingSystem.bufferedReader.close();
					
				}catch(Exception ex){
					
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
	}

<<<<<<< HEAD
	/**
	 * Method to select sorting technique for comparison sorting
	 * @param array
	 */
	private void selectSortingTechniqueForComparisonSorting(int[] array){

		// if array length is less than or equal to 10 then do bubble sort
=======
	private void selectSortingTechniqueForComparisonSorting(int[] array){

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		if(array.length <= 10){

			BubbleSort bubbleSort = new BubbleSort();

<<<<<<< HEAD
			bubbleSort.doBubbleSort(array);

			System.out.println("System has used Bubble Sort technique and "
					+ "sorted list is as below :");
		}
		
		// else do quick sort
=======
			bubbleSort.bubbleSort(array);

			for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

				System.out.println(array[loopVariable]);
			}
		}
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		else{

			QuickSort quickSort = new QuickSort();

<<<<<<< HEAD
			quickSort.doQuickSort(array, 0, array.length-1);

			System.out.println("System has used Quick Sort technique and "
					+ "sorted list is as below :");

		}
		
		// print sorted list
		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

			System.out.println(array[loopVariable]);
		}
	}

	/**
	 * Method to select sorting technique for linear sorting
	 * @param array
	 */
=======
			quickSort.quickSort(array, 0, array.length-1);

			for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

				System.out.println(array[loopVariable]);
			}
		}
	}

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	private void selectSortingTechniqueForLinearSorting(int[] array){

		int maxCountOfDigits = 0 ;

		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

			int countOfDigits = 0;

			int arrayElement = array[loopVariable];

			while(arrayElement != 0){

				arrayElement /= 10;

				countOfDigits++;
			}

			if(countOfDigits > maxCountOfDigits){

				maxCountOfDigits = countOfDigits;
			}
		}

<<<<<<< HEAD
		// if maximum count of digits is less than or equal to 2 , do counting sort
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		if(maxCountOfDigits <= 2){

			CountingSort countingSort = new CountingSort();

<<<<<<< HEAD
			array = countingSort.doCountingSort(array);

			System.out.println("System has used Counting Sort technique and "
					+ "sorted list is as below :");
		}

		// else do radix sort
=======
			array = countingSort.countingSort(array);
		}

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		else{

			RadixSort radixSort = new RadixSort();

<<<<<<< HEAD
			array = radixSort.doRadixSort(array);

			System.out.println("System has used Radix Sort technique and "
					+ "sorted list is as below :");
=======
			array = radixSort.radixSort(array);
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		}

		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

			System.out.println(array[loopVariable]);
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
	private int readPositiveInteger(String message){

		while(true){

			// applied try-catch for exceptions
			try{

				// message for user
				System.out.println(message);

				// user input for number of elements in array is stored in variable using BufferedReader class
				int userInput = Integer.parseInt(bufferedReader.readLine());


				// checking for valid input and handling it
				while(userInput <= 0){

					System.out.println(message);

					userInput = Integer.parseInt(bufferedReader.readLine());
				}

				// returning the valid input
				return userInput;

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

					array[i] = Integer.parseInt(bufferedReader.readLine());
				}

				// array is returned
				return array;

			}catch(Exception ex){

				System.out.println(ex.getMessage());
			}
		}
	}

<<<<<<< HEAD
	/**
	 * 
	 * @param message
	 * @return string given by user
	 */
	public String getUserStringInput(String message){			

		String userInput = null;

		while(true){
=======
	public String getUserStringInput(String message){			

		boolean flag = true;

		String userInput = null;

		while(flag){
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
			// variable for user input

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

				//System.out.println("hello");

				if(userInput.length() > 0){

<<<<<<< HEAD
					return userInput;
=======
					flag = false;
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
				}

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}
<<<<<<< HEAD
=======

		return userInput;
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	}
}