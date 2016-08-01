/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To implement queue using array
*/
package assignment_2;

import java.util.Arrays;

// a generic class for queue
public class Queue<E> {

	// an Object array
	private Object[] array;
	
	// variable to point front - the index from which elements will be removed
	// variable to point rear - the index to which elements will be added
	private int front , rear;

	/**
	 * Parameterized constructor to initialize array with the initial capacity 
	 * given by user and setting up front and top
	 * 
	 * @param capacity
	 */
	public Queue(int capacity){
		
		if( capacity < 0 ){
			
			throw new IllegalArgumentException("Illegal Capacity: "+capacity);
		}

		array = new Object[capacity];
		
		front = 0;
		
		rear = 0;
	}
	
	/**
	 * Constructor to initialize array with default size of 10
	 * and to set up front and rear
	 */
	public Queue(){

		array = new Object[10];
		
		front = 0;
		
		rear = 0;
	}
	
	/**
	 * this method adds the item to queue
	 * 
	 * @param item
	 * @return true if the element is added
	 */
	public boolean enqueue(E item){

		// to ensure the size of mergedList
		ensureCapacity(rear+1);

		array[rear++] = item;
		
		return true;

	}
	
	/**
	 * this method removes the element from queue and returns it
	 * 
	 * @return the current removed element from queue
	 */
	@SuppressWarnings("unchecked")
	public E dequeue(){
		
		if(front == rear){
			
			throw new IndexOutOfBoundsException("Queue Underflow");
		}
		
		return (E)array[front++];
	}
	
	/**
	 * this method makes the queue empty
	 * 
	 * @return true
	 */
	public boolean makeEmpty(){
		
		front = 0;
		rear = 0;
		
		return true;
	}
	
	/**
	 * this method returns the element at front
	 * 
	 * @return the element at front
	 */
	@SuppressWarnings("unchecked")
	public E getFront(){
		
		return (E)array[front];
	}

	/**
	 * @param minCapacity
	 * 
	 * this method increases the capacity of array by making a new array with increased capacity
	 * and transferring the old array into new one
	 */
	public void growCapacity(int minCapacity){

		try{

			int oldCapacity = array.length;

			int newCapacity = oldCapacity + (oldCapacity >> 1);

			array = Arrays.copyOf(array, newCapacity);

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	/**
	 * @param minCapacity
	 * 
	 * this method checks if the capacity is less and grows the capacity of array
	 */
	public void ensureCapacity(int minCapacity){

		try{

			// if capacity is less then grow the capacity 
			if(minCapacity - array.length > 0){

				growCapacity(minCapacity);

			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	/**
	 * 
	 * @return true if the queue is empty else false
	 */
	public boolean isEmpty(){
		
		if(rear == front){
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * 
	 * @return size of queue
	 */
	public int getSize(){
		
		int size = rear - front ;
		
		return size;
	}
	
	/**
	 * print the whole queue
	 */
	public void print(){
		
		for(int i = front ; i < rear ; ++i ){
			
			System.out.println(array[i]);
		}
	}	
}