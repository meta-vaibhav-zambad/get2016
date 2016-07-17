/**
 * 
 */
package assignment_2_Qu_b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 */
public class TestBinarySearch {
	
	BinarySearch binarySearch;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		binarySearch = new BinarySearch();
	}

	/**
	 * Test method for {@link assignment_2_Qu_b.BinarySearch#searchElement(int[], int, int, int)}.
	 */
	@Test
	public void testSearchElement() {
		
		assertEquals(-1,binarySearch.searchElement(new int[]{2,5,8,9,10,55,77}, 0, 6, 88));
		
		assertEquals(77,binarySearch.searchElement(new int[]{2,5,8,9,10,55,77}, 0, 6, 77));
	}

}
