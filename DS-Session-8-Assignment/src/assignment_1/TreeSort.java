<<<<<<< HEAD
/**
 * @author vaibhav zambad
 * 
 * Date : 08 August 2016
 * 
 * Aim :  To Write a program to print disorderly provided role numbers of 
 * 		n students in  ascending series using tree sort
*/
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
// main class to define tree sort
public class TreeSort {

	// buffered reader object for input
	BufferedReader bufferedReader = null;

	/**
	 * constructor to initialize buffered reader object
	 */
=======
public class TreeSort {

	BufferedReader bufferedReader = null;

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public TreeSort(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
<<<<<<< HEAD
		
		// variable to continue
		boolean flagToContinue = true;

		while(flagToContinue){

			// object of tree sort
			TreeSort treeSort = new TreeSort();

			try{
				
				Node startNode = null;
				
				List<Integer> studentRollNumberList = new ArrayList<Integer>();
 
				// variable for user permission to continue or not
=======

		boolean flag = true;

		while(flag){

			TreeSort treeSort = new TreeSort();

			try{

				Node startNode = null;

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
				char userPermission = '\0';

				do{

					System.out.println("1. Add Student");

					int userChoice = treeSort.getUserIntegerInput("Please select a valid choice");

					switch(userChoice){

					case 1:

<<<<<<< HEAD
						treeSort.addStudent(studentRollNumberList);
=======
						startNode = treeSort.addStudent(startNode);
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

						break;

					default: 

						System.out.println("Invalid Choice");

					}

<<<<<<< HEAD
					// getting user permission
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					userPermission = treeSort.getUserStringInput("Press y or Y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission =='Y');
				
<<<<<<< HEAD
				startNode = treeSort.createBinarySearchTree(studentRollNumberList, startNode);
				
				
				// display sorted order
				if(startNode != null){
					
					List<Integer> sortedRollNumberList = new ArrayList<Integer>();

					System.out.println("Sorted Order according to roll number");

					treeSort.getSortedOrder(startNode , sortedRollNumberList);
					
					for (Integer rollNumber : sortedRollNumberList) {
=======

				if(startNode != null){
					
					List<Integer> rollNumberList = new ArrayList<Integer>();

					System.out.println("Sorted Order according to roll number");

					treeSort.getSortedOrder(startNode , rollNumberList);
					
					for (Integer rollNumber : rollNumberList) {
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
						
						System.out.println(rollNumber);
					}
				}

				else{

					System.out.println("No student to display");
				}
				
<<<<<<< HEAD
				flagToContinue = false;
=======
				flag = false;
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+" Program will restart");

			}finally{

				try{
<<<<<<< HEAD
					
					// close input stream
=======

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
					treeSort.bufferedReader.close();

				}catch(Exception ex){

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
		
		System.out.println("Program Ended");
	}

<<<<<<< HEAD
	/**
	 * This method adds the student to tree
	 * 
	 * @param startNode
	 * @return startnode after adding student
	 */
	public void addStudent(List<Integer> studentRollNumberList) {
=======
	public Node addStudent(Node startNode){
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

		boolean flag = true;

		while(flag){

			try{

				int studentRollNumber = getUserIntegerInput("Please enter student roll number");
<<<<<<< HEAD
				
				studentRollNumberList.add(studentRollNumber);
				
=======

				BinarySearchTree binarySearchTree = new BinarySearchTree();

				startNode = binarySearchTree.insertNode(startNode, studentRollNumber);

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
				flag = false;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage()+"Please add student again");

			}
		}
<<<<<<< HEAD
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
=======

		return startNode;
	}

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public void getSortedOrder(Node startNode , List<Integer> rollNumberList){

		if(startNode != null){

			getSortedOrder(startNode.left , rollNumberList);
			
			rollNumberList.add(startNode.nodeValue);

			getSortedOrder(startNode.right , rollNumberList);
		}
<<<<<<< HEAD
		
	}

	/**
	 * 
	 * @param message
	 * @return user integer input
	 */
=======
	}

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
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

<<<<<<< HEAD
	/**
	 * 
	 * @param message
	 * @return user string input
	 */
=======
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
	public String getUserStringInput(String message){			

		boolean flag = true;

		String userInput = null;

		while(flag){
<<<<<<< HEAD
=======
			// variable for user input
>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8

			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();

<<<<<<< HEAD
=======
				//System.out.println("hello");

>>>>>>> f5d22ff314a6a1ce847b73e8e9e3c9f5d1a57fe8
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