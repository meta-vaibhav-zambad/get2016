/**
 * 
 */
package Assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav zambad
 *
 */
public class TestPattern {
	
	Pattern pattern;
	String spaceRow1,spaceRow2,spaceRow3,spaceRow6,spaceRow8;
	String numberRow1,numberRow5,numberRow3,numberRow6,numberRow8;
	int numberOfRows;	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pattern = new Pattern();
		
		numberOfRows = 5;
		
		spaceRow1="    ";
		spaceRow2="   ";
		spaceRow3="  ";
		spaceRow6=" ";
		spaceRow8="   ";
		
		numberRow1="1";
		numberRow3="12321";
		numberRow5="123454321";
		numberRow6="1234321";
		numberRow8="121";	
				
	}

	/**
	 * Test method for {@link Assignment1.Pattern#spacesForContinuation(int, int)}.
	 */
	@Test
	public void testSpacesForContinuation() {
		assertEquals(spaceRow1, pattern.spacesForContinuation(0, numberOfRows));
		assertEquals(spaceRow2, pattern.spacesForContinuation(1, numberOfRows));
		assertEquals(spaceRow3, pattern.spacesForContinuation(2, numberOfRows));
	}

	/**
	 * Test method for {@link Assignment1.Pattern#spacesForReverse(int, int)}.
	 */
	@Test
	public void testSpacesForReverse() {
		assertEquals(spaceRow6, pattern.spacesForReverse(5, numberOfRows));
		assertEquals(spaceRow8, pattern.spacesForReverse(7, numberOfRows));
	}

	/**
	 * Test method for {@link Assignment1.Pattern#numbersForContinuation(int, int)}.
	 */
	@Test
	public void testNumbersForContinuation() {
		assertEquals(numberRow1, pattern.numbersForContinuation(0, numberOfRows));
		assertEquals(numberRow3, pattern.numbersForContinuation(2, numberOfRows));
		assertEquals(numberRow5, pattern.numbersForContinuation(4, numberOfRows));
		
	}

	/**
	 * Test method for {@link Assignment1.Pattern#numbersForReverse(int, int)}.
	*/ 
	@Test
	public void testNumbersForReverse() {
		assertEquals(numberRow6, pattern.numbersForReverse(5, numberOfRows));
		assertEquals(numberRow8, pattern.numbersForReverse(7, numberOfRows));
	}

	/**
	 * Test method for {@link Assignment1.Pattern#printPyramid(int)}.
	 */
	@Test
	public void testPrintPyramid() {
		
		assertArrayEquals(new String[]{"    1","   121","  12321"," 1234321","123454321",
				" 1234321","  12321","   121","    1"}, pattern.printPyramid(numberOfRows));
	}

}