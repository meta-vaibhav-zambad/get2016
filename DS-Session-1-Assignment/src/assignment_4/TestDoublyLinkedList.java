/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To test the Doubly LinkedList class
*/

package assignment_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDoublyLinkedList {
	
	// creating objects
	DoublyLinkedList<String> doublyLinkedList;

	/**
	 * initializing objects
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		doublyLinkedList = new DoublyLinkedList<String>();
	}

	/**
	 * test method for add element at a particular index
	 */
	@Test
	public void testAddAtIndex() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "vaibhav1"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav2"));
		assertEquals("Success",true,doublyLinkedList.add(2, "vaibhav3"));
		assertEquals("Success",true,doublyLinkedList.add(0, "vaibhav4"));
		
	}
	
	/**
	 * test method for remove element based on its value
	 */
	@Test
	public void testRemoveBasedOnValue() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,doublyLinkedList.add(2, "to"));

		assertEquals("Success",true,doublyLinkedList.remove("welcome"));
		assertEquals("Success",true,doublyLinkedList.remove("vaibhav"));
	}

	/**
	 * test method for remove element based on index
	 */
	@Test
	public void testRemoveBasedOnIndex() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,doublyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,doublyLinkedList.add(2, "to"));
		assertEquals("Success",true,doublyLinkedList.add(3, "Linked MergedList"));
		
		assertEquals("Success",true,doublyLinkedList.remove(3));
		assertEquals("Success",true,doublyLinkedList.remove(0));
	}
	
	/**
	 * test method for get element based on index
	 */
	@Test
	public void testGetElementBasedOnIndex() {
		
		assertEquals("Success",true,doublyLinkedList.add(0, "this"));
		assertEquals("Success",true,doublyLinkedList.add(1, "is"));
		assertEquals("Success",true,doublyLinkedList.add(2, "Linked MergedList"));
		
		assertEquals("this",doublyLinkedList.get(0));
		assertEquals("is",doublyLinkedList.get(1));
		
	}
}