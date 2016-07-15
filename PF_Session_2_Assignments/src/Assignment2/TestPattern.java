/**
 * 
 */
package Assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 *
 */
public class TestPattern {
	
	Pattern pattern ;
	String spaceRow1,spaceRow2,spaceRow5;
	String numberRow2,numberRow3,numberRow5;
	int numberOfRows;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		pattern = new Pattern();
		
		spaceRow1 ="";
		spaceRow2 =" ";
		spaceRow5="    ";
		numberRow2="1234";
		numberRow3="123";
		numberRow5="1";
		
		numberOfRows = 5;
	}

	/**
	 * Test method for {@link Assignment2.Pattern#spaces(int, int)}.
	 */
	@Test
	public void testSpaces() {
		assertEquals(spaceRow1, pattern.spaces(0, numberOfRows));
		assertEquals(spaceRow2, pattern.spaces(1, numberOfRows));
		assertEquals(spaceRow5, pattern.spaces(4, numberOfRows));
	}

	/**
	 * Test method for {@link Assignment2.Pattern#numbers(int, int)}.
	 */
	@Test
	public void testNumbers() {
		assertEquals(numberRow2,pattern.numbers(1, numberOfRows));
		assertEquals(numberRow3,pattern.numbers(2, numberOfRows));
		assertEquals(numberRow5,pattern.numbers(4, numberOfRows));
	}
	
	/**
	 * Test method for {@link Assignment1.Pattern#printPyramid(int)}.
	 */
	@Test
	public void testPrintPyramid() {
		
		assertArrayEquals(new String[]{"12345"," 1234","  123","   12","    1"}
							, pattern.printPyramid(numberOfRows));
	}


}
