package assignment_4;

public class Node<E> {
	
	public E nodeValue;
	
	public Node<E> nextNode;
	
	public Node<E> prevNode;
	
	public Node(){
		
		nodeValue = null;
		
		nextNode = null;
		
		prevNode = null;
	}
	
	public Node(E item){
		
		nodeValue = item;
		
		nextNode = null;
		
		prevNode = null;
	}

}