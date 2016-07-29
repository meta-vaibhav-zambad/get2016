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
		assertEquals("Success",true,doublyLinkedList.add(0, "vaibhav4"));
		
	}
	
	@Test
	public void testRemoveBasedOnValue() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,doublyLinkedList.add(2, "to"));

		assertEquals("Success",true,doublyLinkedList.remove("welcome"));
		assertEquals("Success",true,doublyLinkedList.remove("vaibhav"));
	}

	@Test
	public void testRemoveBasedOnIndex() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,doublyLinkedList.add(2, "to"));
		assertEquals("Success",true,doublyLinkedList.add(3, "Linked List"));
		
		assertEquals("Success",true,doublyLinkedList.remove(3));
		assertEquals("Success",true,doublyLinkedList.remove(0));
	}
	
	
	@Test
	public void testGetElementBasedOnIndex() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "this"));
		assertEquals("Success",true,doublyLinkedList.add(1, "is"));
		assertEquals("Success",true,doublyLinkedList.add(2, "Linked List"));
		
		assertEquals("this",doublyLinkedList.get(0));
		assertEquals("is",doublyLinkedList.get(1));
		
	}
}