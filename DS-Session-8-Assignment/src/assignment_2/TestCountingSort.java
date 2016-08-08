/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  Write a sorting system, which takes input from user and provide a sorted list. 
 * Here User could choose if he want to go with Comparison Sorting Or Linear Sorting.
*/
package assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCountingSort {
	
	CountingSort countingSort;
	int[] array1,array2,array3;
	int[] sortedArray1;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		countingSort = new CountingSort();
		
		array1 = new int[]{80,45,90,1,45,32,87,46,33};
		array2 = new int[]{4,4,4,4,4,4,4,4,4,4,4,4};
		array3 = new int[]{10,20,30,40,50,60,70};
		
		sortedArray1 = new int[]{1,32,33,45,45,46,80,87,90};
	}

	/**
	 * Test method for {@link assignment_2.CountingSort#doCountingSort(int[])}.
	 */
	@Test
	public void testDoCountingSort() {
		
		assertArrayEquals(sortedArray1, countingSort.doCountingSort(array1));
		assertArrayEquals(array2, countingSort.doCountingSort(array2));
		assertArrayEquals(array3, countingSort.doCountingSort(array3));
	}

}