package assignment_3;

public class Node<E> {
	
	public E nodeValue;
	
	public Node<E> left , right;
	
	public Node(){
		
		nodeValue = null;
		
		left = null;
		
		right = null;
		
	}
	
	public Node(E element){
		
		nodeValue = element;
		
		left = null;
		
		right = null;
	}
	
	public String toString(){
		
		return nodeValue.toString();
	}

}