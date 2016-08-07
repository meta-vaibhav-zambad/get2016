package assignment_2;

import java.util.Arrays;

public class RadixSort {
	
	public int[] radixSort(int[] array){
		
		int largestNumber = getLargestNumber(array);
		
		int exponent = 1;
		
		while(largestNumber != 0){
			
			array = countSort(array , exponent);
			
			largestNumber /= 10;
			
			exponent *= 10;
		}
		
		return array;
	}
	
	public int[] countSort(int[] array , int exponent){
		
		int[] outputArray = new int[array.length];
		
		int[] countArray = new int[10];
		
		
		Arrays.fill(countArray, 0);
		
		for(int loopVariable = 0 ; loopVariable < array.length ; ++loopVariable){
			
			countArray[(array[loopVariable] / exponent) % 10]++;
		}
		
		for(int loopVariable = 1 ; loopVariable < 10 ;++loopVariable){
			
			countArray[loopVariable] += countArray[loopVariable-1]; 
		}
		 
		for(int loopVariable = array.length - 1 ; loopVariable >=0 ; --loopVariable){
			
			outputArray[--countArray[ (array[loopVariable] / exponent) % 10 ]] = array[loopVariable];
		}
		
		return outputArray;
	}
	
	public int getLargestNumber(int[] array){
		
		int largestNumber = 0;
		
		for(int i = 0 ; i < array.length ; ++i){
			
			if(array[i] > largestNumber){
				
				largestNumber = array[i];
			}
		}
		
		return largestNumber;
	}
}