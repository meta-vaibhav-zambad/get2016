/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To implement stack using singlyLinked list
*/

package assignment_1;

// a generic class for stack
public class Stack<E> {
	
	// an instance of singlyLinked List
	SinglyLinkedList<E> linkedList;
	
	// a top pointer to point at the recent element added into stack
	private int top = 0;
	
	/**
	 * An empty constructor to initialize a LinkedList with generic type 
	 */
	public Stack(){
		
		linkedList = new SinglyLinkedList<E>();
	}
	
	/**
	 * this method adds the element in stack
	 * 
	 * @param element
	 * @return true if the element is added into stack
	 */
	public boolean push(E element){
		
		linkedList.add(element);
		
		top++;
		
		return true;
		
	}
	
	/**
	 * this method removes the element from stack and returns it
	 * if there is no element then throws exception
	 * 
	 * @return the current removed element from stack
	 */
	public E pop(){
		
		if(top == 0){
			
			throw new IndexOutOfBoundsException("Stack underflow");
		}
		
		E value = linkedList.get(top-1);
		
		linkedList.remove(top-1);
		
		top--;
		
		return value;
	}
	
	/**
	 * this method returns the currently added element in stack
	 * if there is no element then throws exception
	 * 
	 * @return the top element of the stack
	 */
	public E getTop(){
		
		if(top == 0){
			
			throw new IndexOutOfBoundsException("stack is empty");
		}
		
		else{
			
			return linkedList.get(top-1);
		}
	}
	
	/**
	 * this method returns the element at a particular index
	 * if there is no element in stack then throws exception
	 * else if the index is greater than size then throws exception
	 * 
	 * @param index
	 * @return the element at a particular index
	 */
	public E get(int index){
		
		if(top == 0){
			
			throw new IndexOutOfBoundsException("stack is empty");
		}
		
		else if(index >= top){
			
			throw new IllegalArgumentException("size: "+top+" index: "+index);
		}
		
		return linkedList.get(index);
	}
	
	/**
	 * prints the whole stack
	 */
	public void print(){
		
		linkedList.print();
	}
	
	/**
	 * @return true if the stack is empty else returns false 
	 */
	public boolean isEmpty(){
		
		if(top == 0){
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return size of stack
	 */
	public int getSize(){
		
		return top;
	}
}