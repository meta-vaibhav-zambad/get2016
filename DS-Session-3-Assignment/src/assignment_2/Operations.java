package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import assignment_1.BinaryTree;
import assignment_1.Node;

public class Operations {

	BufferedReader bufferedReader;

	public Operations(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	public static void main(String[] args) {

		Operations operations = new Operations();

		try{

			BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

			Node<Integer> rootNodeForTree1 = null;

			Node<Integer> rootNodeForTree2 = null;
			
			int choice = 0;
			
			int elementForRoot = 0 , elementForLeftOfRoot = 0 , elementForRightOfRoot = 0;
			
			char addAnother = '\0';

			char userPermission = '\0';

			do{

				System.out.println("1. Insert in first binary tree");
				
				System.out.println("2. Insert in second binary tree");

				System.out.println("3. Check if trees are mirror image of each other");

				choice = operations.getUserIntegerInput("Please enter a valid choice");

				switch(choice){

				case 1:

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

					break;

				case 3:

					boolean result = operations.areMirrorTrees(rootNodeForTree1 , rootNodeForTree2);
					
					if(result == true){
						
						System.out.println("Yes , trees are mirrot images of each other");
					}
					else{
						
						System.out.println("No , trees are not mirror images of each other");
					}
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