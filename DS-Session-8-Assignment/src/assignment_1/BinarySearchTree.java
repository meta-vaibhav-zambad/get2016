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

// class to define binary search tree
public class BinarySearchTree {
	
	/**
	 * This method inserts node on binary search tree
	 * 
	 * @param startNode
	 * @param element
	 * @return start node after inserting elements
	 */
	public Node insertNode(Node startNode , int element){
		
		// if start node is null
=======
package assignment_1;

public class BinarySearchTree {
	
	public Node insertNode(Node startNode , int element){
		
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
		if(startNode == null){
			
			startNode = new Node();
			
			startNode.nodeValue = element;
			
			startNode.left = null;
			
			startNode.right = null;
		}
		
		else{
			
<<<<<<< HEAD
			// if current element is greater than start node value 
			// insert node to left
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
			if(startNode.nodeValue  >  element){
				
				startNode.left = insertNode(startNode.left, element);
			}
			
<<<<<<< HEAD
			// else insert node to right
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
			else if(startNode.nodeValue < element){
				
				startNode.right = insertNode(startNode.right, element);
			}
		}
		
		return startNode;
	}
}