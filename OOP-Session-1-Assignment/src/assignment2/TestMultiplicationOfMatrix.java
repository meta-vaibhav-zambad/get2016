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


public class TestMultiplicationOfMatrix {
	
	MultiplicationOfMatrix multiplication;
	
	int[][] expectedOutput;
	
	int[][] firstMatrix;
	
	int[][] secondMatrix;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		multiplication = new MultiplicationOfMatrix();
		
		expectedOutput = new int[][]{
				{14,40,46},
				{32,94,109},
				{50,148,172},
		};
		
		firstMatrix = new int[][]{
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		secondMatrix = new int[][]{
				
				{1,4,5},
				{2,6,7},
				{3,8,9}
		};
		
	}

	/**
	 * Test method for {@link assignment1.MultiplicationOfMatrix#multiplyMatrix(int[][], int[][])}.
	 */
	@Test
	public void testMultiplyMatrix() {
		
		assertArrayEquals(expectedOutput, multiplication.multiplyMatrix(firstMatrix, secondMatrix));
		
	}

}
