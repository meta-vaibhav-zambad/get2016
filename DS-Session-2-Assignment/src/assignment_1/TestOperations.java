/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To test the infix to postFix operation
*/
package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOperations {
	
	Operations operations;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		operations = new Operations();
	}

	/**
	 * Test method for {@link assignment_1.Operations#infixToPostFix(java.lang.String)}.
	 */
	@Test
	public void testInfixToPostFix() {
		
		assertEquals("AB*CD/+",operations.infixToPostFix("( (A * B) + (C / D) )"));
		assertEquals("ABC+*D/",operations.infixToPostFix("((A * (B + C) ) / D)"));
		assertEquals("ABCD/+*",operations.infixToPostFix("(A * (B + (C / D) ) )"));
		assertEquals("xy/^5z*10+",operations.infixToPostFix("x ^ y / (5 * z) + 10"));
		
	}

}
