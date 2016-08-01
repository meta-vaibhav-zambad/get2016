/**
 * @author vaibhav zambad
 * 
 * Date : 28 July 2016
 * 
 * Aim : To solve Josephus Problem : n People are arranged in a circle remove every mth person
 */

package assignment_7;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import assignment_1.ArrayList;

public class JosephusProblem {
	
	// buffered reader object
	BufferedReader bufferedReader;

	/*
	 * empty constructor of class . Initialized buffered reader object
	 */
	public JosephusProblem(){

		bufferedReader  = new BufferedReader(new InputStreamReader(System.in));

	}

	// entry point of program
	public static void main(String[] args){
		
		// object of main class
		JosephusProblem josephusProblem = new JosephusProblem();

		// taking input for number of people
		int totalNumberOfPeople = josephusProblem.getUserInput("Please enter total number of people");

		// taking input for mth person to be removed
		int personNumberToBeRemoved = josephusProblem.getUserInput("Please enter mth person to be removed");
		
		// printing winner 
		System.out.println("Winner: " + josephusProblem.remove(totalNumberOfPeople,personNumberToBeRemoved));

	}

	/**
	 * This method removes every Mth person and returns the winner
	 * It also prints the removed people from arrayList
	 * 
	 * @param n
	 * @param k
	 * @return the winner of program
	 */
	public int remove(int n, int k){
		
		// variable for mth person to be removed
		int person = 0;
		
		// mergedList of people
		ArrayList<Integer> people = new ArrayList<Integer>(n);
		
		// adding n people in mergedList
		for(int i = 1;i <= n;i++){

			people.add(i);

		}
		
		// remove message
		System.out.println("People removed in order:");
		
		// condition to take size of people mergedList 
		while(people.size() > 1){
			
			// calculating the person to be removed
			person = (person + k - 1) % people.size();
			
			// printing the person
			System.out.print(people.getElement(person) + " ");

			// removing the person
			people.remove(person);
		}

		System.out.println();
		
		// returning the winner
		return people.getElement(0);
	}
	
	/**
	 * this method gets user input and return it
	 * 
	 * @param message
	 * @return user input
	 */
	public int getUserInput(String message){
		
		// variable for user input
		int userInput = 0;
		
		// exception handling for input
		try{
			
			// message to be printed
			System.out.println(message);

			// taking user input
			userInput = Integer.parseInt(bufferedReader.readLine());
			
			while(userInput <= 0){
				
				// calling recursively the same method to take input again as it is not valid
				getUserInput(message);
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

			// calling recursively the same method to take input again as it is not valid
			getUserInput(message);
		}

		return userInput;
	}
}