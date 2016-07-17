/**
 * 
 */
package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 */
public class TestQuickSort {

	QuickSort quickSort;
	
	int[] sortedArray;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		quickSort = new QuickSort();
		
		sortedArray = new int[]{2,5,8,9,10,11,55,77};
	}

	/**
	 * Test method for {@link assignment_3.QuickSort#sortArray(int[], int, int)}.
	 */
	@Test
	public void testSortArray() {
		
		assertArrayEquals(sortedArray, quickSort.sortArray(new int[]{2,5,8,9,10,77,55,11}, 0, 7));
		
		assertArrayEquals(new int[]{}, quickSort.sortArray(new int[]{}, 0, 0));
	}

}