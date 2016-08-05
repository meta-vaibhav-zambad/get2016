package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// main class for job scheduling
public class JobScheduling {

	// buffered reader object for user input
	BufferedReader bufferedReader = null;

	/**
	 * Constructor to initialize buffered reader object
	 */
	public JobScheduling(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	// entry method of program
	public static void main(String[] args){

		// object of scheduling class
		JobScheduling jobScheduling = new JobScheduling();

		// object of priority queue
		PriorityQueue priorityQueue = new PriorityQueue();

		// variable for user permission to continue or not
		char userPermission = '\0';

		try{

			do{
				// displaying choices
				System.out.println("1. Insert Job");

				System.out.println("2. Print Jobs Based On Priority");

				// taking user choice 
				int userChoice = jobScheduling.getUserIntegerInput("Please enter a valid choice");

				switch (userChoice){

				// to insert job
				case 1 : 

					int jobPriority = jobScheduling.getUserIntegerInput("Please enter the priority of job");

					priorityQueue.insertJob(jobPriority);

					break;                          

					// to print job queue
				case 2 : 

					System.out.println("Job Execution Order");

					priorityQueue.printJobQueue();

					break;        

				default : 

					System.out.println("Invalid Choice");

					break;   
				}   

				userPermission = jobScheduling.getUserStringInput("Please enter Y or y to continue").charAt(0);

			} while (userPermission == 'Y'|| userPermission == 'y');

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

		}finally{

			try{
				// close input stream
				jobScheduling.bufferedReader.close();
				
			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}
	}

	/**
	 * 
	 * @param message
	 * @return user input (integer)
	 */
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
	 * 
	 * @param message
	 * @return user input(string)
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