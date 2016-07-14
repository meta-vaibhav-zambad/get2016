/**
 * 
 */
package pF_Assignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav
 *
 */
public class TestPF_Assignment3 {
	
	PF_Assignment3 longestSequence;
	int[] Array;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		longestSequence = new PF_Assignment3();
		
		Array = new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment3#longestSequence(int[])}.
	 */
	@Test
	public void testLongestSequence() {
		assertArrayEquals(longestSequence.longestSequence(Array), new int[]{1,2,4,5,6,7,8,9});
	}

}
