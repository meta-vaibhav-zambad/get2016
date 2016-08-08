<<<<<<< HEAD
/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  To Write a program to print disorderly provided role numbers of 
 * 		n students in  ascending series using tree sort
*/
package assignment_1;

// class to define node
public class Node {
	
	// variable to define node value
	public int nodeValue;
	
	// variable to define right and left pointer of tree
	public Node left , right;
	
	/**
	 * constructor to initialize values to default
	 */
=======
package assignment_1;

public class Node {
	
	public int nodeValue;
	
	public Node left , right;
	
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public Node(){
		
		nodeValue = 0;
		
		left = null;
		
		right = null;
		
	}
	
<<<<<<< HEAD
	/**
	 * Parameterized constructor to initialize node value of node 
	 * and others to null
	 * @param element
	 */
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public Node(int element){
		
		nodeValue = element;
		
		left = null;
		
		right = null;
	}
	
<<<<<<< HEAD
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public String toString(){
		
		return String.valueOf(nodeValue);
	}

}