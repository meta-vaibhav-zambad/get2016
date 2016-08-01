/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To implement Doubly LinkedList
*/

package assignment_4;

// class of node (an entity of doubly linked mergedList)(Generic type)
public class Node<E> {
	
	// generic variable to set node value
	public E nodeValue;
	
	// pointer for next node
	public Node<E> nextNode;
	
	// pointer for previous node
	public Node<E> prevNode;
	
	/**
	 * empty constructor for node
	 */
	public Node(){
		
		nodeValue = null;
		
		nextNode = null;
		
		prevNode = null;
	}
	
	/**
	 * parameterized constructor to set the item for node
	 * 
	 * @param item
	 */
	public Node(E item){
		
		nodeValue = item;
		
		nextNode = null;
		
		prevNode = null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return nodeValue.toString();
	}

}