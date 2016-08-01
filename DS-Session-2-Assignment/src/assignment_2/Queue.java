package assignment_2;

import java.util.Arrays;

public class Queue<E> {

	private Object[] array;
	
	private int front , rear;

	public Queue(int capacity){

		array = new Object[capacity];
		
		front = 0;
		
		rear = 0;
	}

	public Queue(){

		array = new Object[10];
		
		front = 0;
		
		rear = 0;
	}

	public boolean enqueue(E item){

		// to ensure the size of mergedList
		ensureCapacity(rear+1);

		array[rear++] = item;
		
		return true;

	}
	
	@SuppressWarnings("unchecked")
	public E dequeue(){
		
		if(front == rear){
			
			throw new IndexOutOfBoundsException("Queue Underflow");
		}
		
		return (E)array[front++];
	}
	
	public boolean makeEmpty(){
		
		front = 0;
		rear = 0;
		
		return true;
	}
	
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
	
	public boolean isEmpty(){
		
		if(rear == front){
			
			return true;
		}
		
		return false;
	}
	
	public int getSize(){
		
		int size = rear - front ;
		
		return size;
	}
	
	public void print(){
		
		for(int i = front ; i < rear ; ++i ){
			
			System.out.println(array[i]);
		}
	}	
}