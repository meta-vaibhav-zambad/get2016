/**
 * 
 */
package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav
 *
 */
public class TestNQueensProblem {
	
	NQueensProblem nQueensProblem;
	
	int[][] board;
	
	int[] expectedRow1For4Queens , expectedRow2For4Queens  , expectedRow3For4Queens , expectedRow4For4Queens;
	
	int[] actualRow1For4Queens , actualRow2For4Queens  , actualRow3For4Queens , actualRow4For4Queens;
	
	//int[] row1For8Queens , row2For8Queens  , row3For8Queens , row4For8Queens;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		nQueensProblem = new NQueensProblem();
		
		expectedRow1For4Queens = new int[]{0,1,0,0};
		
		expectedRow2For4Queens = new int[]{0,0,0,1};
		
		expectedRow3For4Queens = new int[]{1,0,0,0};
		
		expectedRow4For4Queens = new int[]{0,0,1,0};
		
		board = new int[4][4];
		
		board = nQueensProblem.nQueen(board, 0, 4);
		
		actualRow1For4Queens = new int[4];
		
		actualRow2For4Queens = new int[4];
		
		actualRow3For4Queens = new int[4];
		
		actualRow4For4Queens = new int[4];
		
		for(int i=0;i<4;++i){
			
			actualRow1For4Queens[i] = board[0][i];
		}
		
		for(int i=0;i<4;++i){
			
			actualRow2For4Queens[i] = board[1][i];
		}
		for(int i=0;i<4;++i){
	
			actualRow3For4Queens[i] = board[2][i];
		}
		for(int i=0;i<4;++i){
	
			actualRow4For4Queens[i] = board[3][i];
		}
		
		
		
	}

	/**
	 * Test method for {@link Assignment1.NQueensProblem#nQueen(int[][], int, int, int, int)}.
	 */
	@Test
	public void testNQueen() {
		
		assertArrayEquals(expectedRow1For4Queens, actualRow1For4Queens);
		
		assertArrayEquals(expectedRow2For4Queens, actualRow2For4Queens);
		
		assertArrayEquals(expectedRow3For4Queens, actualRow3For4Queens);
		
		assertArrayEquals(expectedRow4For4Queens, actualRow4For4Queens);
		
		
		
	}
}