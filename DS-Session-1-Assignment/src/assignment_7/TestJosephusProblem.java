/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To test the Josephus Problem class
*/
package assignment_7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJosephusProblem {
	
	// creating object
	JosephusProblem josephusProblem;

	/**
	 * initializing objects 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		josephusProblem = new JosephusProblem();
		
	}
	
	/**
	 * test method for remove method of JosephusProblem class
	 */
	@Test
	public void testRemove() {
		
		assertEquals(21 , josephusProblem.remove(41 , 5));
		assertEquals(17 , josephusProblem.remove(20 , 4));
		assertEquals(5 , josephusProblem.remove(10 , 2));
		assertEquals(60 , josephusProblem.remove(100 , 23));
		assertEquals(303 , josephusProblem.remove(500 , 102));
	}

}