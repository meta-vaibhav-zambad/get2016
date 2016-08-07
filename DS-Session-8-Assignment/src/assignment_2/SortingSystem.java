package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortingSystem {

	BufferedReader bufferedReader = null;

	public SortingSystem(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	}

	public static void main(String[] args){

		boolean flagNotToEndProgram = true;

		while(flagNotToEndProgram){

			SortingSystem sortingSystem = new SortingSystem();

			try{

				int userPermission = '\0';

				System.out.println("Welcome to V Sorting System");

				do{

					int countOfArray = sortingSystem.readPositiveInteger("Please enter a valid count of array");

					int[] array = new int[countOfArray];

					array = sortingSystem.readArray(countOfArray);

					System.out.println("1. Comparison Sorting");

					System.out.println("2. Linear Sorting");

					int userChoice = sortingSystem.readPositiveInteger("Please enter a valid choice");
					
					System.out.println("Sorted Order");

					switch(userChoice){

					case 1:

						sortingSystem.selectSortingTechniqueForComparisonSorting(array);

						break;

					case 2:

						sortingSystem.selectSortingTechniqueForLinearSorting(array);

						break;

					default:

						System.out.println("invalid choice");
					}

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
					
					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
	}

	private void selectSortingTechniqueForComparisonSorting(int[] array){

		if(array.length <= 10){

			BubbleSort bubbleSort = new BubbleSort();

			bubbleSort.bubbleSort(array);

			for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

				System.out.println(array[loopVariable]);
			}
		}
		else{

			QuickSort quickSort = new QuickSort();

			quickSort.quickSort(array, 0, array.length-1);

			for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

				System.out.println(array[loopVariable]);
			}
		}
	}

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

		if(maxCountOfDigits <= 2){

			CountingSort countingSort = new CountingSort();

			array = countingSort.countingSort(array);
		}

		else{

			RadixSort radixSort = new RadixSort();

			array = radixSort.radixSort(array);
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

	public String getUserStringInput(String message){			

		boolean flag = true;

		String userInput = null;

		while(flag){
			// variable for user input

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

				//System.out.println("hello");

				if(userInput.length() > 0){

					flag = false;
				}

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}

		return userInput;
	}
}