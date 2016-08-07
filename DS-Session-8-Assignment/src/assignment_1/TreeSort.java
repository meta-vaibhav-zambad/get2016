package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TreeSort {

	BufferedReader bufferedReader = null;

	public TreeSort(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {

		boolean flag = true;

		while(flag){

			TreeSort treeSort = new TreeSort();

			try{

				Node startNode = null;

				char userPermission = '\0';

				do{

					System.out.println("1. Add Student");

					int userChoice = treeSort.getUserIntegerInput("Please select a valid choice");

					switch(userChoice){

					case 1:

						startNode = treeSort.addStudent(startNode);

						break;

					default: 

						System.out.println("Invalid Choice");

					}

					userPermission = treeSort.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission =='Y');
				

				if(startNode != null){
					
					List<Integer> rollNumberList = new ArrayList<Integer>();

					System.out.println("Sorted Order according to roll number");

					treeSort.getSortedOrder(startNode , rollNumberList);
					
					for (Integer rollNumber : rollNumberList) {
						
						System.out.println(rollNumber);
					}
				}

				else{

					System.out.println("No student to display");
				}
				
				flag = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");

			}finally{

				try{

					treeSort.bufferedReader.close();

				}catch(Exception ex){

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
		
		System.out.println("Program Ended");
	}

	public Node addStudent(Node startNode){

		boolean flag = true;

		while(flag){

			try{

				int studentRollNumber = getUserIntegerInput("Please enter student roll number");

				BinarySearchTree binarySearchTree = new BinarySearchTree();

				startNode = binarySearchTree.insertNode(startNode, studentRollNumber);

				flag = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+"Please add student again");

			}
		}

		return startNode;
	}

	public void getSortedOrder(Node startNode , List<Integer> rollNumberList){

		if(startNode != null){

			getSortedOrder(startNode.left , rollNumberList);
			
			rollNumberList.add(startNode.nodeValue);

			getSortedOrder(startNode.right , rollNumberList);
		}
	}

	public int getUserIntegerInput(String message){

		boolean flag = true;

		int userInput = 0;

		while(flag){
			// variable for user input

			try{

				System.out.println(message);

				// taking user input
				userInput = Integer.parseInt(bufferedReader.readLine());

				//System.out.println("hello");

				if(userInput >= 0){

					flag = false;
				}

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}

		return userInput;
	}

	public String getUserStringInput(String message){			

		boolean flag = true;

		String userInput = null;

		while(flag){
			// variable for user input

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

				//System.out.println("hello");

				if(userInput.length() > 0){

					flag = false;
				}

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}
		}

		return userInput;
	}
}