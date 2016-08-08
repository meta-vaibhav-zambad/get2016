/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  Write a sorting system, which takes input from user and provide a sorted list. 
 * Here User could choose if he want to go with Comparison Sorting Or Linear Sorting.
*/
package assignment_2;

import java.util.Arrays;

// class to define counting sort
public class CountingSort {

	/**
	 * this method returns sorted array. It stores the count of each digit, increment it by adding the 
	 * previous one and place the number by taking count as its position 
	 * 
	 * @param array having numbers with less than or equal to 2 digits
	 * @return sorted array
	 */
	public int[] doCountingSort(int[] array){

		// output array to store the result
		int[] outputArray = new int[array.length];

		// countArray to store the count of each number
		int[] countArray = new int[10];

		// fill count array with zeros
		Arrays.fill(countArray, 0);

		// divide each array element by 10,take its modulo by 10 to get each digit and increment 
		// its count by one
		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

			countArray[array[loopVariable] / 10 % 10]++;
		}
		
		// add each count to previous one
		for(int loopVariable = 1 ; loopVariable < 10 ;++loopVariable){

			countArray[loopVariable] += countArray[loopVariable-1]; 
		}
		
		// start array from last and set each element to its count and decrement count by 1	
		for(int loopVariable = array.length - 1 ; loopVariable >=0 ; --loopVariable){

			outputArray[--countArray[(array[loopVariable] / 10) % 10]]= array[loopVariable];
		}
		
		return outputArray;

	}
}