/**
 * 
 */
package assignment_1_Qu_a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 * 
 */
public class TestRemainder {
	
	
	Remainder remainder ;
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		remainder = new Remainder();
	}

	/**
	 * Test method 1 for {@link assignment_1_Qu_a.Remainder#computeRemainder(int, int)}.
	 */
	@Test 
	public void testComputeRemainder1() {
		
		assertEquals(1, remainder.computeRemainder(100, 3));
		assertEquals(0 , remainder.computeRemainder(2, 1));
		
	}
	
	/**
	 * Test method 2 for {@link assignment_1_Qu_a.Remainder#computeRemainder(int, int)}.
	 */
	@Test (expected = java.lang.ArithmeticException.class)
	
	public void testComputeRemainder2(){
		
		assertEquals(0, remainder.computeRemainder(2, 0));
	}
}