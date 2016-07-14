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
public class TestPF_Assignment4 {
	
	PF_Assignment4 fcfs;
	int[] arrivalTime;
	int[] jobSize;
	int[][] waitTime;
	int[] waitTime1DArray;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		fcfs = new PF_Assignment4();
		arrivalTime = new int[]{1,5,9,25};
		jobSize = new int[]{12,7,2,5};
		waitTime1DArray = new int[arrivalTime.length];
		waitTime = fcfs.FCFS(arrivalTime, jobSize);
		for(int i=0;i<arrivalTime.length;++i){
			waitTime1DArray[i] = waitTime[i][0];
		}
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment4#FCFS(int[], int[])}.
	 */
	@Test
	public void testFCFS() {
		
		assertArrayEquals(new int[]{0,8,11,0}, waitTime1DArray);
	}

}