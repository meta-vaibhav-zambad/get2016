/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To implement Singly LinkedList
*/


package assignment_3;

// Node class to define a node in Linked MergedList
public class Node<E> {
	
	// node value
	public E nodeValue;
	
	// next pointer in node
	public Node<E> nextNode;
	
	/**
	 * empty constructor to initialize values
	 */
	public Node(){
		
		nodeValue = null;
		
		nextNode = null;
	}
	
	/**
	 * @param item
	 * 
	 * parameterized constructor to set item as node value
	 */
	public Node(E item){
		
		nodeValue = item;
		
		nextNode = null;
	}
	 
	// returns value of the object
	@Override
	public String toString() {
		
		return nodeValue.toString();
	}
}