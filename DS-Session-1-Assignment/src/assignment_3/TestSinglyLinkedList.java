/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To test the Singly LinkedList class
*/

package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSinglyLinkedList {
	
	// declaring objects
	SinglyLinkedList<String> singlyLinkedList;

	/**
	 * initializing the objects
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		singlyLinkedList = new SinglyLinkedList<String>();
	}
	
	/**
	 * test add method at a particular index
	 */
	@Test
	public void testAddAtIndex() {
		
		assertEquals("Success",true,singlyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,singlyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,singlyLinkedList.add(2, "to"));
		assertEquals("Success",true,singlyLinkedList.add(3, "Linked MergedList"));
		
		
	}
	
	/**
	 * test remove method by value
	 */
	@Test
	public void testRemoveByValue() {
		
		assertEquals("Success",true,singlyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,singlyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,singlyLinkedList.add(2, "to"));

		assertEquals("Success",true,singlyLinkedList.remove("welcome"));
		assertEquals("Success",true,singlyLinkedList.remove("vaibhav"));
		assertEquals("Success",true,singlyLinkedList.remove("to"));
	}

	/**
	 * test method to remove from particular index
	 */
	@Test
	public void testRemoveByIndex() {
		
		assertEquals("Success",true,singlyLinkedList.add(0, "welcome"));
		assertEquals("Success",true,singlyLinkedList.add(1, "vaibhav"));
		assertEquals("Success",true,singlyLinkedList.add(2, "to"));
		assertEquals("Success",true,singlyLinkedList.add(3, "Linked MergedList"));
		
		assertEquals("Success",true,singlyLinkedList.remove(3));
	}
	
	/**
	 * test method for get element at a particular index
	 */
	@Test
	public void testGetElementByIndex() {
		
		assertEquals("Success",true,singlyLinkedList.add(0, "this"));
		assertEquals("Success",true,singlyLinkedList.add(1, "is"));
		assertEquals("Success",true,singlyLinkedList.add(2, "Linked MergedList"));
		
		assertEquals("this",singlyLinkedList.get(0));
		assertEquals("is",singlyLinkedList.get(1));
		
	}
}