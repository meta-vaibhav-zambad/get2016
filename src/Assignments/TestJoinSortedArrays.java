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
public class TestJoinSortedArrays {
	
	JoinSortedArrays join;
	int[] arrayA ,arrayB,arrayC;
	int asize,bsize;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		join = new JoinSortedArrays();
		arrayA = new int[]{9,10,14,17};
		asize = 4;
		arrayB = new int[]{1,2,11,12,19};
		bsize = 5;
		arrayC = new int[(asize+bsize)];
	}

	/**
	 * Test method for {@link Assignments.JoinSortedArrays#join(int[], int, int[], int, int[])}.
	 */
	@Test
	public void testJoin() {
		assertArrayEquals(join.join(arrayA, asize, arrayB, bsize, arrayC), new int[]{1,2,9,10,11,12,14,17,19});
	}

}
