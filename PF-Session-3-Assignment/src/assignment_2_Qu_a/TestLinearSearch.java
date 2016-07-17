/**
 * 
 */
package assignment_2_Qu_a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 */
public class TestLinearSearch {
	
	LinearSearch linearSearch;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		linearSearch = new LinearSearch();
	}

	/**
	 * Test method for {@link assignment_2_Qu_a.LinearSearch#searchElement(int[], int, int, int)}.
	 */
	@Test
	public void testSearchElement() {
		
		assertEquals(-1,linearSearch.searchElement(new int[]{2,5,8,9,10,77,55},0,6,88));
		
		assertEquals(77, linearSearch.searchElement(new int[]{2,5,8,9,10,77,55}, 0, 6, 77));
	}

}
