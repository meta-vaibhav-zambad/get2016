package assignment_1;

public class Node {
	
	public int nodeValue;
	
	public Node left , right;
	
	public Node(){
		
		nodeValue = 0;
		
		left = null;
		
		right = null;
		
	}
	
	public Node(int element){
		
		nodeValue = element;
		
		left = null;
		
		right = null;
	}
	
	public String toString(){
		
		return String.valueOf(nodeValue);
	}

}