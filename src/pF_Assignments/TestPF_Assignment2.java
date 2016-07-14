/**
 * 
 */
package pF_Assignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author admin
 *
 */
public class TestPF_Assignment2 {

	/**
	 * @throws java.lang.Exception
	 */
	PF_Assignment2 remove ;
	int[] input;	
	@Before
	public void setUp() throws Exception {
		remove = new PF_Assignment2();
		input = new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment2#removeDuplicate(int[])}.
	 */
	@Test
	public void testRemoveDuplicate() {
		assertArrayEquals(remove.removeDuplicate(input), new int[]{2,5,4,6,3,8,9,0});
	}
}