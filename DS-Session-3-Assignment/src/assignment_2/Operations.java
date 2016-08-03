<<<<<<< HEAD
/**
 * @author Vaibhav Zambad
 * 
 * Date : 02-August-2016
 * 
 * Aim : To find if 2 given trees are mirror similar trees or not.
 */
=======
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
<<<<<<< HEAD

import assignment_1.BinaryTree;
import assignment_1.Node;

// class for operations on binary trees
public class Operations {

	// buffered reader object for taking input
	BufferedReader bufferedReader;

	/**
	 * Constructor to initialize buffered reader object
	 */
=======
import assignment_1.BinaryTree;
import assignment_1.Node;

public class Operations {

	BufferedReader bufferedReader;

>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
<<<<<<< HEAD
	
	// entry point for program
=======
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
	public static void main(String[] args) {

		Operations operations = new Operations();

		try{
<<<<<<< HEAD
			
			// variable for root node of tree 1
			Node<Integer> rootNodeForTree1 = null;

			// variable for root node of tree 2
			Node<Integer> rootNodeForTree2 = null;

			// variable for user choice
			int choice = 0;

			// variable for user permission to continue or not
=======

			BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

			Node<Integer> rootNodeForTree1 = null;

			Node<Integer> rootNodeForTree2 = null;
			
			int choice = 0;
			
			int elementForRoot = 0 , elementForLeftOfRoot = 0 , elementForRightOfRoot = 0;
			
			char addAnother = '\0';

>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
			char userPermission = '\0';

			do{

<<<<<<< HEAD
				// printing choices
				System.out.println("1. Insert in first binary tree");

=======
				System.out.println("1. Insert in first binary tree");
				
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
				System.out.println("2. Insert in second binary tree");

				System.out.println("3. Check if trees are mirror image of each other");

				choice = operations.getUserIntegerInput("Please enter a valid choice");

				switch(choice){

				case 1:
<<<<<<< HEAD
					
					// insert elements in the first tree
					rootNodeForTree1 = operations.getUserInputForTree(rootNodeForTree1);
					
					break;

				case 2:

					// insert elements in the second tree
					rootNodeForTree2 = operations.getUserInputForTree(rootNodeForTree2);
					
=======

					elementForRoot = operations.getUserIntegerInput("Please enter an element for "
							+ "root of tree");

					elementForLeftOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to left of root");

					elementForRightOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to right of root");

					rootNodeForTree1 = binaryTree.insertRoot(rootNodeForTree1, elementForRoot, elementForLeftOfRoot, elementForRightOfRoot);

					addAnother = 'y';

					while(addAnother == 'y' || addAnother == 'Y'){

						int elementForLeft = operations.getUserIntegerInput("Please enter an element "
								+ "for left node");

						int elementForRight = operations.getUserIntegerInput("Please enter an element "
								+ "for right node");

						rootNodeForTree1 = binaryTree.insert(rootNodeForTree1, elementForLeft, elementForRight);

						addAnother = operations.getUserStringInput("Please enter Y or y to add"
								+ " elements again").charAt(0);
					}

					break;
					
				case 2:
					
					elementForRoot = operations.getUserIntegerInput("Please enter an element for "
							+ "root of tree");

					elementForLeftOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to left of root");

					elementForRightOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to right of root");

					rootNodeForTree2 = binaryTree.insertRoot(rootNodeForTree2, elementForRoot, elementForLeftOfRoot, elementForRightOfRoot);

					addAnother = 'y';

					while(addAnother == 'y' || addAnother == 'Y'){

						int elementForLeft = operations.getUserIntegerInput("Please enter an element "
								+ "for left node");

						int elementForRight = operations.getUserIntegerInput("Please enter an element "
								+ "for right node");

						rootNodeForTree2 = binaryTree.insert(rootNodeForTree2, elementForLeft, elementForRight);

						addAnother = operations.getUserStringInput("Please enter Y or y to add"
								+ " elements again").charAt(0);
					}

>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
					break;

				case 3:

<<<<<<< HEAD
					// variable to store result if mirror trees or not
					boolean result = operations.areMirrorTrees(rootNodeForTree1 , rootNodeForTree2);

					if(result == true){

						System.out.println("Yes , trees are mirror images of each other");
					}
					else{

=======
					boolean result = operations.areMirrorTrees(rootNodeForTree1 , rootNodeForTree2);
					
					if(result == true){
						
						System.out.println("Yes , trees are mirrot images of each other");
					}
					else{
						
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
						System.out.println("No , trees are not mirror images of each other");
					}
					break;

				default:

					System.out.println("Invalid Choice");
				}

<<<<<<< HEAD
				// taking user permission to continue or not
=======
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
				userPermission = operations.getUserStringInput("Press Y or y to continue").charAt(0);

			}while(userPermission == 'y' || userPermission =='Y');


		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

		}finally{

			try{

<<<<<<< HEAD
				// closing the stream
=======
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
				operations.bufferedReader.close();

				System.out.println("Program Ended");

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}

	}
	
<<<<<<< HEAD
	/**
	 * This method checks whether the trees are mirror trees or not by recursion 
	 * Root node is replaced by rootNode.left for first tree and rootNode.right for second tree
	 * Again root node is replaced by rootNode.right for first tree and rootNode.left for second tree
	 * 
	 * @param rootNodeForTree1
	 * @param rootNodeForTree2
	 * @return true if mirror trees else return false
	 */
	public boolean areMirrorTrees(Node<Integer> rootNodeForTree1 , Node<Integer> rootNodeForTree2){

		if(rootNodeForTree1 == null && rootNodeForTree2 == null){

			return true;
		}

		if(rootNodeForTree1.nodeValue != rootNodeForTree2.nodeValue){

			return false;
		}

		if( (rootNodeForTree1 == null && rootNodeForTree2 != null) 
				|| rootNodeForTree2 == null && rootNodeForTree1 != null){

			return false;
		}

		return areMirrorTrees(rootNodeForTree1.left, rootNodeForTree2.right) && 
				areMirrorTrees(rootNodeForTree1.right, rootNodeForTree2.left);
	}
	
	/**
	 * This method take user input to insert nodes in tree
	 * 
	 * @param rootNode
	 * @return rootNode after insertions
	 */
	public Node<Integer> getUserInputForTree(Node<Integer> rootNode){
		
		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		
		// taking user input for root element
		Integer elementForRoot = getUserIntegerInput("Please enter an element for "
				+ "root of tree");

		// taking user input for element for left of root
		Integer elementForLeftOfRoot = getUserIntegerInput("Please enter an element "
				+ "for node to left of root");
		
		if(elementForLeftOfRoot.equals(-1)){
			
			elementForLeftOfRoot = null;
		}
		
		// taking user input for element for right of root
		Integer elementForRightOfRoot = getUserIntegerInput("Please enter an element "
				+ "for node to right of root");
		
		if(elementForRightOfRoot.equals(-1)){
			
			elementForRightOfRoot = null;
		}
		
		// getting rootNode
		rootNode = binaryTree.insertRoot(rootNode, elementForRoot, elementForLeftOfRoot, elementForRightOfRoot);
		
		// variable to take user permission to add left and right node
		char addAnother = 'y';
		
		addAnother = getUserStringInput("Please enter Y or y to add"
				+ " elements further").charAt(0);

		// checking condition
		while(addAnother == 'y' || addAnother == 'Y'){
			
			// taking user input for left node 
			Integer elementForLeft = getUserIntegerInput("Please enter an element "
					+ "for left node");
			
			if(elementForLeft.equals(-1)){
				
				elementForLeft = null;
			}

			// taking user input for right node
			Integer elementForRight = getUserIntegerInput("Please enter an element "
					+ "for right node");
			
			if(elementForRight.equals(-1)){
				
				elementForRight = null;
			}
			// getting root node
			rootNode = binaryTree.insert(rootNode, elementForLeft, elementForRight);

			// taking user permission to add another left and right node
			addAnother = getUserStringInput("Please enter Y or y to add"
					+ " elements futher").charAt(0);
		}
		
		return rootNode;
	}

	/**
	 * This method returns the user input for integer values
	 * 
	 * @param message
	 * @return user input (integer)
	 */
=======
	public boolean areMirrorTrees(Node<Integer> rootNodeForTree1 , Node<Integer> rootNodeForTree2){
		
		if(rootNodeForTree1 == null && rootNodeForTree2 == null){
			
			return true;
		}
		
		if(rootNodeForTree1.nodeValue != rootNodeForTree2.nodeValue){
			
			return false;
		}
		
		if( (rootNodeForTree1 == null && rootNodeForTree2 != null) 
				|| rootNodeForTree2 == null && rootNodeForTree1 != null){
			
			return false;
		}
		
		return areMirrorTrees(rootNodeForTree1.left, rootNodeForTree2.right) && 
				areMirrorTrees(rootNodeForTree1.right, rootNodeForTree2.left);
	}
		
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
	public int getUserIntegerInput(String message){

		// variable for user input
		int userInput = 0;

		try{

			System.out.println(message);

			// taking user input
			userInput = Integer.parseInt(bufferedReader.readLine());

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserIntegerInput(message);

		}

		return userInput;
	}
<<<<<<< HEAD
	
	/**
	 * This method returns the user input for string variables
	 * 
	 * @param message
	 * @return user input for string variables
	 */
=======

>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
	public String getUserStringInput(String message){			
		// variable for user input
		String userInput = "";

		try{

			System.out.println(message);

			// taking user input
			userInput = bufferedReader.readLine();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserStringInput(message);

		}

		return userInput;
	}
}