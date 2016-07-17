/**
 * 
 */
package assignment_1_Qu_c;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 */
public class TestLargestDigit {
	
	LargestDigit largestDigit;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		largestDigit = new LargestDigit();
	}

	/**
	 * Test method for {@link assignment_1_Qu_c.LargestDigit#computeLargestDigit(int)}.
	 */
	@Test
	public void testComputeLargestDigit() {
		
		assertEquals(2, largestDigit.computeLargestDigit(2,0));
		assertEquals(9, largestDigit.computeLargestDigit(1257369,0));
		assertEquals(4, largestDigit.computeLargestDigit(444,0));
		
	}

}