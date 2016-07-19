/**
 * 
 */
package assignment_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vaibhav
 *
 */
public class TestPermutationsOfString {
	
	PermutationsOfString permutations;
	
	List<String> expectedPermutations;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		permutations = new PermutationsOfString();
		
		expectedPermutations = new ArrayList<String>(){{
			
			add("ABC");
			add("ACB");
			add("BAC");
			add("BCA");
			add("CAB");
			add("CBA");
			
		}};;	
	}

	/**
	 * Test method for {@link assignment_2.PermutationsOfString#passAllPermutations(java.lang.String)}.
	 */
	@Test
	public void testPassAllPermutations() {
		
		assertEquals(expectedPermutations , permutations.passAllPermutations("ABC"));
		
	}
}