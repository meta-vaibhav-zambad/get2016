/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  To Write a program to print disorderly provided role numbers of 
 * 		n students in  ascending series using tree sort
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// main class to define tree sort
public class TreeSort {

	// buffered reader object for input
	BufferedReader bufferedReader = null;

	/**
	 * constructor to initialize buffered reader object
	 */
	public TreeSort(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		
		// variable to continue
		boolean flagToContinue = true;

		while(flagToContinue){

			// object of tree sort
			TreeSort treeSort = new TreeSort();

			try{
				
				Node startNode = null;
				
				List<Integer> studentRollNumberList = new ArrayList<Integer>();
 
				// variable for user permission to continue or not
				char userPermission = '\0';

				do{

					System.out.println("1. Add Student");

					int userChoice = treeSort.getUserIntegerInput("Please select a valid choice");

					switch(userChoice){

					case 1:

						treeSort.addStudent(studentRollNumberList);

						break;

					default: 

						System.out.println("Invalid Choice");

					}

					// getting user permission
					userPermission = treeSort.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission =='Y');
				
				startNode = treeSort.createBinarySearchTree(studentRollNumberList, startNode);
				
				
				// display sorted order
				if(startNode != null){
					
					List<Integer> sortedRollNumberList = new ArrayList<Integer>();

					System.out.println("Sorted Order according to roll number");

					treeSort.getSortedOrder(startNode , sortedRollNumberList);
					
					for (Integer rollNumber : sortedRollNumberList) {
						
						System.out.println(rollNumber);
					}
				}

				else{

					System.out.println("No student to display");
				}
				
				flagToContinue = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");

			}finally{

				try{
					
					// close input stream
					treeSort.bufferedReader.close();

				}catch(Exception ex){

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
		
		System.out.println("Program Ended");
	}

	/**
	 * This method adds the student to tree
	 * 
	 * @param startNode
	 * @return startnode after adding student
	 */
	public void addStudent(List<Integer> studentRollNumberList) {

		boolean flag = true;

		while(flag){

			try{

				int studentRollNumber = getUserIntegerInput("Please enter student roll number");
				
				studentRollNumberList.add(studentRollNumber);
				
				flag = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+"Please add student again");

			}
		}
	}
	
	public Node createBinarySearchTree(List<Integer> rollNumberList , Node startNode){
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		for(int loopVariable = 0 ; loopVariable < rollNumberList.size() ;++loopVariable){
			
			startNode = binarySearchTree.insertNode(startNode, rollNumberList.get(loopVariable));
		}
		
		return startNode;
	}

	/**
	 * InorderTraversal for sorted order
	 * @param startNode
	 * @param rollNumberList
	 */
	public void getSortedOrder(Node startNode , List<Integer> rollNumberList){

		if(startNode != null){

			getSortedOrder(startNode.left , rollNumberList);
			
			rollNumberList.add(startNode.nodeValue);

			getSortedOrder(startNode.right , rollNumberList);
		}
		
	}

	/**
	 * 
	 * @param message
	 * @return user integer input
	 */
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

	/**
	 * 
	 * @param message
	 * @return user string input
	 */
	public String getUserStringInput(String message){			

		boolean flag = true;

		String userInput = null;

		while(flag){

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

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