package assignment_6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLargestElement {

	LargestElement largestElement;
	
	int[] array1,array2,array3;
	@Before
	public void setUp() throws Exception {
		
		largestElement = new LargestElement();
		
		array1 = new int[]{10,9,8,7,6,5,4,3,2,1};
		
		array2 = new int[]{11,9,4,2,16,3,5};
		
		array3 = new int[]{1,2,3,4,5,6,7,8,9,10};
	}

	@Test
	public void test() {
		
		assertEquals(8,largestElement.findThirdLargestElement(array1));
		
		assertEquals(9,largestElement.findThirdLargestElement(array2));
		
		assertEquals(8,largestElement.findThirdLargestElement(array3));
	}

}
