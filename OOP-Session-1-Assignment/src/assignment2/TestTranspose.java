/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 20 July 2016
 */
package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTranspose {
	
	Transpose transpose;
	
	int[][] inputMatrix;
	int[][] expectedOutputMatrix;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		transpose = new Transpose();
		
		inputMatrix = new int[][]{
				
				{1,4,5},
				{2,6,7},
				{3,8,9}
		};
		
		expectedOutputMatrix = new int[][]{
				
				{1,2,3},
				{4,6,8},
				{5,7,9}
		};
	}

	/**
	 * Test method for {@link assignment1.Transpose#transposeOfMatrix(int[][])}.
	 */
	@Test
	public void testTransposeOfMatrix() {
		
		assertArrayEquals(expectedOutputMatrix, transpose.transposeOfMatrix(inputMatrix));
	}

}