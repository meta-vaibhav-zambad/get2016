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

			int userInput = 0;
			
			char userPermission = '\0';

			do{

				System.out.println("1. Insert in binary tree");

				System.out.println("2. Display preorder traversal");

				System.out.println("3. Exit");

				choice = operations.getUserIntegerInput("Please enter a valid choice");

				switch(choice){

				case 1:

					userInput = operations.getUserIntegerInput("Please enter an element to add in tree");
					rootNode = binaryTree.insert(rootNode, userInput);
					break;

				case 2:

					binaryTree.preorder(rootNode);
					break;

				case 3:

					System.exit(0);

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