package assignment_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDoublyLinkedList {
	
	DoublyLinkedList<String> doublyLinkedList;

	@Before
	public void setUp() throws Exception {
		
		doublyLinkedList = new DoublyLinkedList<String>();
	}

	@Test
	public void testAdd() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "vaibhav1"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav2"));
		assertEquals("Success",true,doublyLinkedList.add(2, "vaibhav3"));
		
	}

}
