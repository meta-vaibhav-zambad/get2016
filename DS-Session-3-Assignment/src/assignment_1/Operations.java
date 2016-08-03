/**
 * @author Vaibhav Zambad
 * 
 * Date : 02-August-2016
 * 
 * Aim : To traverse a binary tree in preOrder and print the nodes as they are traversed.
 */
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// class for operations to be performed on binary tree
public class Operations {

	// buffered reader object for input and output
	BufferedReader bufferedReader;

	/**
	 * Constructor to initialize buffered reader object
	 */
	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// entry point of program
	public static void main(String[] args) {
		
		Operations operations = new Operations();

		try{

			Node<Integer> rootNode = null;
			
			// variable for user choice
			int choice = 0;

<<<<<<< HEAD
			// variable for user permission to continue or not
=======
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
			char userPermission = '\0';

			do{
				
				// printing choices
				System.out.println("1. Insert in binary tree");

				System.out.println("2. Display preorder traversal");
				
				choice = operations.getUserIntegerInput("Please enter a valid choice");

				switch(choice){
				
				// insert elements in the tree
				case 1:
<<<<<<< HEAD
					
					System.out.println("Press -1 for null element");
					rootNode = operations.getUserInputForTree(rootNode);
					
					break;
					
				// display preOrder of binary tree
				case 2:
					
					operations.preorder(rootNode);
					break;
					
				// for invalid choice	
=======

					int elementForRoot = operations.getUserIntegerInput("Please enter an element for "
							+ "root of tree");

					int elementForLeftOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to left of root");

					int elementForRightOfRoot = operations.getUserIntegerInput("Please enter an element "
							+ "for node to right of root");

					rootNode = binaryTree.insertRoot(rootNode, elementForRoot, elementForLeftOfRoot, elementForRightOfRoot);

					char addAnother = 'y';

					while(addAnother == 'y' || addAnother == 'Y'){

						int elementForLeft = operations.getUserIntegerInput("Please enter an element "
								+ "for left node");

						int elementForRight = operations.getUserIntegerInput("Please enter an element "
								+ "for right node");

						rootNode = binaryTree.insert(rootNode, elementForLeft, elementForRight);

						addAnother = operations.getUserStringInput("Please enter Y or y to add"
								+ " elements again").charAt(0);
					}

					break;

				case 2:

					operations.preorder(rootNode);
					break;
					
					
>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
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
					+ " elements further").charAt(0);
		}
		
		return rootNode;
	}

<<<<<<< HEAD
	/**
	 * This method traverses the tree in preOrder 
	 * that is node , left and right 
	 * 
	 * @param rootNode
	 */
	public void preorder(Node<Integer> rootNode){

		try{
			
			// do traversal only if root node is not null
=======
	public void preorder(Node<Integer> rootNode){

		try{

>>>>>>> a8f87b82a5ddd141510c8755ce191d015bcf03a6
			if(rootNode != null){

				System.out.println(rootNode.nodeValue);

				preorder(rootNode.left);

				preorder(rootNode.right);
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
<<<<<<< HEAD
	
	/**
	 * This method returns the user input for integer values
	 * 
	 * @param message
	 * @return user input (integer)
	 */
=======

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

	/**
	 * This method returns the user input for string variables
	 * 
	 * @param message
	 * @return user input for string variables
	 */
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