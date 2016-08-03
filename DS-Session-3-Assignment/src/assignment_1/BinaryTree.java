/**
 * @author Vaibhav Zambad
 * 
 * Date : 02-August-2016
 * 
 * Aim : To implement a binary tree
 */
package assignment_1;

// generic class for binary tree
public class BinaryTree<E> {

	// a size variable
	// deciding factor for insertion to left or right node
	int size;
	
	/**
	 * constructor for binary tree
	 */
	public BinaryTree(){

		// initialized size to 1
		size = 1;
		
	}
	
	/**
	 * This method inserts node to root and to left and right of node
	 * 
	 * @param rootNode
	 * @param elementForRoot
	 * @param elementForLeftOfRoot
	 * @param elementForRightOfRoot
	 * @return root node
	 */
	public Node<E> insertRoot(Node<E> rootNode , E elementForRoot , E elementForLeftOfRoot , 
			E elementForRightOfRoot){
		
		if(rootNode == null){
			
			rootNode = new Node<E>();
			
			rootNode.nodeValue = elementForRoot;
			
			rootNode.left = new Node<E>();
			
			rootNode.left.nodeValue = elementForLeftOfRoot;
			
			rootNode.right = new Node<E>();
			
			rootNode.right.nodeValue = elementForRightOfRoot;
		}
		
		return rootNode;
	}
	
	/**
	 * This method starts inserting nodes from level 2 of binary tree
	 * 
	 * @param rootNode
	 * @param elementForLeft
	 * @param elementForRight
	 * @return root node 
	 */
	public Node<E> insert(Node<E> rootNode , E elementForLeft , E elementForRight){

		try{
			
			// if left and right of node both are null then insert to left and right at the same time
			// increment size variable
			if(rootNode.left == null && rootNode.right == null){
				
				rootNode.left = new Node<E>();
				
				rootNode.left.nodeValue = elementForLeft;
				
				rootNode.right = new Node<E>();
				
				rootNode.right.nodeValue = elementForRight;
				
				size++;
				
			}
			
			else{
				
				// if size is even then insert to left node
				if(size % 2 == 0){

					rootNode.left = insert(rootNode.left , elementForLeft , elementForRight);
				}
				
				// if size is odd then insert to right node
				else{

					rootNode.right = insert(rootNode.right , elementForLeft , elementForRight);
				}
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}

		return rootNode;
	}
}