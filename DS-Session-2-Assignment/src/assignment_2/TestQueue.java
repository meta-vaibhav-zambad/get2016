/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To test the implemented queue
*/
package assignment_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {
	
	Queue<String> queue;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		queue = new Queue<String>();
	}

	/**
	 * Test method for {@link assignment_2.Queue#enqueue(java.lang.Object)}.
	 */
	@Test
	public void testEnqueue() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",true,queue.enqueue("bbb"));
		assertEquals("Success",true,queue.enqueue("ccc"));
		assertEquals("Success",true,queue.enqueue("ddd"));
		assertEquals("Success",true,queue.enqueue("eee"));
		
	}

	/**
	 * Test method for {@link assignment_2.Queue#dequeue()}.
	 */
	@Test
	public void testDequeue() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",true,queue.enqueue("bbb"));
		assertEquals("Success",true,queue.enqueue("ccc"));
		assertEquals("aaa",queue.dequeue());
		assertEquals("bbb",queue.dequeue());
		assertEquals("ccc",queue.dequeue());
	}

	/**
	 * Test method for {@link assignment_2.Queue#makeEmpty()}.
	 */
	@Test
	public void testMakeEmpty() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",true,queue.enqueue("bbb"));
		assertEquals("Success",true,queue.enqueue("ccc"));
		assertEquals("Success",true,queue.makeEmpty());
		
	}

	/**
	 * Test method for {@link assignment_2.Queue#getFront()}.
	 */
	@Test
	public void testGetFront() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",true,queue.enqueue("bbb"));
		assertEquals("Success",true,queue.enqueue("ccc"));
		assertEquals("aaa",queue.getFront());
	}

	/**
	 * Test method for {@link assignment_2.Queue#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",false,queue.isEmpty());
		assertEquals("aaa",queue.dequeue());
		assertEquals("Success",true,queue.isEmpty());
	}

	/**
	 * Test method for {@link assignment_2.Queue#size()}.
	 */
	@Test
	public void testgetSize() {
		
		assertEquals("Success",true,queue.enqueue("aaa"));
		assertEquals("Success",true,queue.enqueue("bbb"));
		assertEquals("Success",true,queue.enqueue("ccc"));
		assertEquals(3,queue.getSize());
		assertEquals("Success",true,queue.makeEmpty());
		assertEquals(0,queue.getSize());
		
	}
}