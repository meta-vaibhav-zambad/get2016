package assignment_2;

import java.util.Arrays;

public class CountingSort {

	public int[] countingSort(int[] array){

		int[] outputArray = new int[array.length];

		int[] countArray = new int[10];

		Arrays.fill(countArray, 0);

		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){

			countArray[array[loopVariable] / 10 % 10]++;
		}

		for(int loopVariable = 1 ; loopVariable < 10 ;++loopVariable){

			countArray[loopVariable] += countArray[loopVariable-1]; 
		}

		for(int loopVariable = array.length - 1 ; loopVariable >=0 ; --loopVariable){

			outputArray[--countArray[(array[loopVariable] / 10) % 10]]= array[loopVariable];
		}
		
		return outputArray;

	}
}