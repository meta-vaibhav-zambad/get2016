/**
 * 
 */
package pF_Assignments;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav
 *
 */
public class TestPF_Assignment1 {
	
	PF_Assignment1 convert;
	int binaryNumber;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		convert = new PF_Assignment1();
		binaryNumber = 110101;
	}

	/**
	 * Test method for {@link pF_Assignments.PF_Assignment1#convertBinaryToOctal(int)}.
	 */
	@Test
	public void testConvertBinaryToOctal() {
		
		assertEquals(65, convert.convertBinaryToOctal(binaryNumber));
		
	}

}
