/**
 * 
 */
package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author admin
 *
 */
public class TestStack {
	
	Stack<String> stack ;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		stack = new Stack<String>();
	}

	/**
	 * Test method for {@link assignment_1.Stack#push(java.lang.Object)}.
	 */
	@Test
	public void testPush() {
		
		assertEquals("Success",true,stack.push("aaa"));
		assertEquals("Success",true,stack.push("bbb"));
		assertEquals("Success",true,stack.push("ccc"));
		assertEquals("Success",true,stack.push("ddd"));
		assertEquals("Success",true,stack.push("eee"));
		assertEquals("Success",true,stack.push("fff"));
		assertEquals("Success",true,stack.push("ggg"));
	}

	/**
	 * Test method for {@link assignment_1.Stack#pop()}.
	 */
	@Test
	public void testPop() {
		
		assertEquals("Success",true,stack.push("ccc"));
		assertEquals("Success",true,stack.push("ddd"));
		assertEquals("Success",true,stack.push("eee"));
		assertEquals("Success",true,stack.push("fff"));
		assertEquals("Success",true,stack.push("ggg"));
		assertEquals("ggg",stack.pop());
		assertEquals("fff",stack.pop());
		assertEquals("eee",stack.pop());
		assertEquals("ddd",stack.pop());
		assertEquals("ccc",stack.pop());
		
	}

	/**
	 * Test method for {@link assignment_1.Stack#getTop()}.
	 */
	@Test
	public void testGetTop() {
		
		assertEquals("Success",true,stack.push("ccc"));
		assertEquals("Success",true,stack.push("ddd"));
		assertEquals("Success",true,stack.push("eee"));
		assertEquals("Success",true,stack.push("fff"));
		assertEquals("Success",true,stack.push("ggg"));
		assertEquals("ggg",stack.getTop());
	}

	/**
	 * Test method for {@link assignment_1.Stack#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		
		assertEquals("Success",true,stack.push("ccc"));
		assertEquals("Success",false,stack.isEmpty());
		assertEquals("ccc",stack.pop());
		assertEquals("Success",true,stack.isEmpty());
	}

	/**
	 * Test method for {@link assignment_1.Stack#size()}.
	 */
	@Test
	public void testgetSize() {
		
		assertEquals("Success",true,stack.push("ccc"));
		assertEquals("Success",true,stack.push("ddd"));
		assertEquals(2,stack.getSize());
		
	}

}