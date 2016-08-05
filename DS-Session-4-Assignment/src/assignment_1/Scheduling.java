package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Scheduling {

	BufferedReader bufferedReader = null;

	public Scheduling(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args){
		
		Scheduling scheduling = new Scheduling();

		PriorityQueue priorityQueue = new PriorityQueue();
		
		char userPermission = '\0';
		
		do{
			System.out.println("1. Insert");

			System.out.println("2. Print Jobs Based On Priority");

			int userChoice = scheduling.getUserIntegerInput("Please enter a valid choice");

			switch (userChoice){

			case 1 : 

				int jobPriority = scheduling.getUserIntegerInput("Please enter the priority of job");

				priorityQueue.insertJob(jobPriority);

				break;                          

			case 2 : 

				System.out.println("Job Execution Order");
				
				priorityQueue.printJobQueue();

				break;        

			default : 

				System.out.println("Wrong Entry \n ");

				break;   
			}   
			
			userPermission = scheduling.getUserStringInput("Please enter Y or y to continue").charAt(0);
					
		} while (userPermission == 'Y'|| userPermission == 'y');            
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