package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operations {

	BufferedReader bufferedReader;

	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	public static void main(String[] args) {

		Operations operations = new Operations();

		try{

			BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

			Node<Integer> rootNode = null;

			int choice = 0;

			char userPermission = '\0';

			do{

				System.out.println("1. Insert in binary tree");

				System.out.println("2. Display preorder traversal");
				
				choice = operations.getUserIntegerInput("Please enter a valid choice");

				switch(choice){

				case 1:

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
					
					
				default:

					System.out.println("Invalid Choice");
				}

				userPermission = operations.getUserStringInput("Press Y or y to continue").charAt(0);

			}while(userPermission == 'y' || userPermission =='Y');


		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

		}finally{

			try{

				operations.bufferedReader.close();

				System.out.println("Program Ended");

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}

	}

	public void preorder(Node<Integer> rootNode){

		try{

			if(rootNode != null){

				System.out.println(rootNode.nodeValue);

				preorder(rootNode.left);

				preorder(rootNode.right);
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

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