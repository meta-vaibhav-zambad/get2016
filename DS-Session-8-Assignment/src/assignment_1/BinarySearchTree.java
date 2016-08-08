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
		if(startNode == null){
			
			startNode = new Node();
			
			startNode.nodeValue = element;
			
			startNode.left = null;
			
			startNode.right = null;
		}
		
		else{
			
			// if current element is greater than start node value 
			// insert node to left
			if(startNode.nodeValue  >  element){
				
				startNode.left = insertNode(startNode.left, element);
			}
			
			// else insert node to right
			else if(startNode.nodeValue < element){
				
				startNode.right = insertNode(startNode.right, element);
			}
		}
		
		return startNode;
	}
}