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
public class TestPF_Assignment6 {
	
	PF_Assignment6 join;
	int[] arrayA ,arrayB,arrayC;
	int asize,bsize;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		join = new PF_Assignment6();
		arrayA = new int[]{9,10,14,17};
		asize = 4;
		arrayB = new int[]{1,2,11,12,19};
		bsize = 5;
		arrayC = new int[(asize+bsize)];
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment6#join(int[], int, int[], int, int[])}.
	 */
	@Test
	public void testJoin() {
		assertArrayEquals(new int[]{1,2,9,10,11,12,14,17,19},join.join(arrayA, asize, arrayB, bsize, arrayC));
	}

}
