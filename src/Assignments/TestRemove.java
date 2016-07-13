/**
 * 
 */
package Assignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author admin
 *
 */
public class TestRemove {

	/**
	 * @throws java.lang.Exception
	 */
	Remove remove ;
	int[] input;	
	@Before
	public void setUp() throws Exception {
		remove = new Remove();
		input = new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	}

	/**
	 * Test method for {@link Assignments.Remove#removeDuplicate(int[])}.
	 */
	@Test
	public void testRemoveDuplicate() {
		assertArrayEquals(remove.removeDuplicate(input), new int[]{2,5,4,6,3,8,9,0});
	}
}