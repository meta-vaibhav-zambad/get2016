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
public class TestPF_Assignment5 {
	
	PF_Assignment5 check ;
	int[] array1,array2,array3;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		check = new PF_Assignment5();
		array1 = new int[]{1,2,3,4,5,6,7,8};
		array2 = new int[]{8,7,6,5,4,3,2,1};
		array3 = new int[]{45,56,12,78,99,2};
		
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment5#checkArray(int[])}.
	 */
	@Test
	public void testCheckArray() {
		assertEquals(check.checkArray(array1), 1);
		assertEquals(check.checkArray(array2),2);
		assertEquals(check.checkArray(array3),0);
	}

}