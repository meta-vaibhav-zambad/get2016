/**
 * 
 */
package assignment_1_Qu_b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 * 
 * Date : 17 July 2016
 *
 */
public class TestGCD {
	
	
	GCD gcd;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		gcd = new GCD();
	}

	/**
	 * Test method for {@link assignment_1_Qu_b.GCD#computeGCD(int, int)}.
	 */
	@Test
	public void testComputeGCD() {
		
		assertEquals(1, gcd.computeGCD(2, 1));
		assertEquals(6,gcd.computeGCD(12, 18));
		assertEquals(1,gcd.computeGCD(100,3));
		
	}

}