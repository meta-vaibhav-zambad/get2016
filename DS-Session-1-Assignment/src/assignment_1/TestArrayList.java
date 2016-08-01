/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To test the ArrayList class
*/
package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {
	
	// object of ArrayList class
	ArrayList<String> arrayList , sortedArrayList ;

	@Before
	public void setUp() throws Exception {
		
		// initializing the object
		arrayList = new ArrayList<String>();
		
		sortedArrayList = new ArrayList<String>();
	}

	/**
	 * test method for adding element in array mergedList
	 */
	@Test
	public void testAddElement() {
		
		assertEquals("Success",true,arrayList.add("hello"));
		assertEquals("Success",true,arrayList.add("my"));
		assertEquals("Success",true,arrayList.add("name"));
		assertEquals("Success",true,arrayList.add("is"));
		assertEquals("Success",true,arrayList.add("vaibhav"));
		assertEquals("Success",true,arrayList.add("welcome"));
		assertEquals("Success",true,arrayList.add("to"));
		assertEquals("Success",true,arrayList.add("my"));
		assertEquals("Success",true,arrayList.add("arrayList"));
		assertEquals("Success",true,arrayList.add("end"));
		assertEquals("Success",true,arrayList.add("of"));
		assertEquals("Success",true,arrayList.add("program"));
		
	}

	/**
	 * test method for adding element in array mergedList at a particular index
	 */
	@Test
	public void testAddElementAtIndex() {
		
		assertEquals("Success",true,arrayList.add(0,"hello"));
		assertEquals("Success",true,arrayList.add(1,"my"));
		assertEquals("Success",true,arrayList.add(2,"name"));
		assertEquals("Success",true,arrayList.add(3,"is"));
		assertEquals("Success",true,arrayList.add(4,"vaibhav"));
		assertEquals("Success",true,arrayList.add(5,"welcome"));
		assertEquals("Success",true,arrayList.add(6,"to"));
		assertEquals("Success",true,arrayList.add(7,"my"));
		assertEquals("Success",true,arrayList.add(8,"arrayList"));
		assertEquals("Success",true,arrayList.add(9,"end"));
		
	}
	
	/**
	 * Test method to remove element at a particular index
	 */
	@Test
	public void testRemoveElementByIndex() {
		
		assertEquals("Success",true,arrayList.remove(6));
		assertEquals("Success",true,arrayList.remove(7));
		assertEquals("Success",true,arrayList.remove(8));
		assertEquals("Success",true,arrayList.remove(9));
		
	}

	/**
	 * Test method to remove element by value
	 */
	@Test
	public void testRemoveElementByValue() {
		
		assertEquals("Success",true,arrayList.remove("vaibhav"));
		assertEquals("Success",true,arrayList.remove("hello"));
		assertEquals("Success",true,arrayList.remove("is"));
		assertEquals("Success",true,arrayList.remove("my"));
		
	}
	
	/**
	 * test method to get index of elements present in mergedList 
	 */
	@Test
	public void testGetIndexOfElement() {
		
		assertEquals("Success",true,arrayList.add("people"));
		assertEquals("Success",true,arrayList.add("hello"));
		assertEquals("Success",0,arrayList.getIndex("people"));
		assertEquals("Success",1,arrayList.getIndex("hello"));
		
	}

	/**
	 * test method to get elements present at a particular index
	 */
	@Test
	public void testGetElementAtIndex() {
		
		assertEquals("Success",true,arrayList.add("hello"));
		assertEquals("Success",true,arrayList.add("vaibhav"));
		assertEquals("hello",arrayList.getElement(0));
		assertEquals("vaibhav",arrayList.getElement(1));
	}
		
	/**
	 * Test method to reverse the mergedList
	 */
	@Test
	public void testReverseList(){
		
		assertEquals("Success",true,arrayList.add("hello"));
		assertEquals("Success",true,arrayList.add("vaibhav"));
		assertEquals("Success",true,arrayList.add("welcome"));
		
		arrayList.reverseList();
		
		assertEquals("welcome",arrayList.getElement(0));
		assertEquals("vaibhav",arrayList.getElement(1));
		assertEquals("hello",arrayList.getElement(2));
		
	}
	
	/**
	 * test method to clear the mergedList
	 */
	@Test
	public void testClearList() {
		
		assertEquals("Success" , true, arrayList.clearList());
	}
	
	/**
	 * test method to sort the mergedList
	 */
	@Test
	public void testSortList(){
		
		sortedArrayList.add("abc");
		sortedArrayList.add("bce");
		sortedArrayList.add("cde");
		sortedArrayList.add("def");
		
		assertEquals("Success",true,arrayList.add("def"));
		assertEquals("Success",true,arrayList.add("cde"));
		assertEquals("Success",true,arrayList.add("bce"));
		assertEquals("Success",true,arrayList.add("abc"));
		
		arrayList.sort();
		
		assertEquals("abc",arrayList.getElement(0));
		assertEquals("bce",arrayList.getElement(1));
		assertEquals("cde",arrayList.getElement(2));
		assertEquals("def",arrayList.getElement(3));
		
		
	}

}
