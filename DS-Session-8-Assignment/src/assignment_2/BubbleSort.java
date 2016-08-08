<<<<<<< HEAD
/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  Write a sorting system, which takes input from user and provide a sorted list. 
 * Here User could choose if he want to go with Comparison Sorting Or Linear Sorting.
*/
package assignment_2;

// class to define bubble sort technique
public class BubbleSort {

	/**
	 * This method sorts elements by comparing each element with every other one and swapping them
	 * 
	 * @param array
	 * @return sorted array
	 */
	public int[] doBubbleSort(int[] array){
=======
package assignment_2;

public class BubbleSort {

	public int[] bubbleSort(int[] array){
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

		for(int outerLoopVariable = 0 ; outerLoopVariable < array.length ; ++outerLoopVariable){

			for(int innerLoopVariable = outerLoopVariable + 1; innerLoopVariable < array.length ; ++innerLoopVariable){

				if(array[innerLoopVariable] < array[outerLoopVariable]){

					swap(array , innerLoopVariable , outerLoopVariable);
				}
			}
		}
		
		return array;
	}

	/**
	 * 
	 * @param array (integer)
	 * @param index1 (integer)
	 * @param index2 (integer)
	 * 
	 * This method is used to swap the elements in array 
	 */
	public void swap(int[] array,int index1,int index2){

		// temp is temporary variable
		int temp = array[index1];

		array[index1] = array[index2];

		array[index2] = temp;
	}

}