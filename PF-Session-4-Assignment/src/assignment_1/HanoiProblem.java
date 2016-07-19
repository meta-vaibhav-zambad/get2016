/**
 * @author Vaibhav Zambad
 * 
 * Date : 19 July 2016
 *
 * Aim : To return List of movements of disk in Tower Of Hanoi Problem
 */

//package name reflects the assignment number
package assignment_1;

//required imports to use inbuilt function to take user inputs
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;


public class HanoiProblem {

	/**
	 * @param args
	 * 
	 * Main Method to test the implementation of program
	 */
	public static void main(String[] args) {
		
		// object of class is created 
		HanoiProblem hanoiProblem = new HanoiProblem();
		
		//List of String is used to store the required steps
		List<String> requiredStepsList = new ArrayList<String>();
		
		requiredStepsList = hanoiProblem.towerOfHanoi("A", "C", "B", hanoiProblem.readNumberOfDisk(),requiredStepsList);
		
		System.out.println(Arrays.toString(requiredStepsList.toArray()));

	}
	
	/**
	 * 
	 * @param source
	 * @param auxiliary
	 * @param destination
	 * @param numOfDisk
	 * @param requiredStepsList
	 * @return List<String>
	 * 
	 * 
	 * 
	 */
	public List<String> towerOfHanoi(String source , String auxiliary , String destination , int numOfDisk,List<String> requiredStepsList){
		
		if(numOfDisk == 1){
			
			requiredStepsList.add("Move Disk "+ (numOfDisk) + " from "+source+" to "+destination);
			
		}
		
		else{
			
			towerOfHanoi(source, destination, auxiliary, numOfDisk-1, requiredStepsList);
			
			requiredStepsList.add("Move Disk "+ (numOfDisk) + " from "+source+" to "+destination);
			
			towerOfHanoi(auxiliary , source, destination, numOfDisk-1 ,requiredStepsList);
		}
		
		return requiredStepsList;
	}
	
	/**
	 * 
	 * @return number of disks
	 */
	private int readNumberOfDisk(){
		
		while(true){
			
			try{
				
				System.out.println("Please enter the valid value for number of disks");
				
				int numOfDisks = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				while(numOfDisks <= 0){
					
					
					System.out.println("Please enter the valid value for number of disks");
					
					numOfDisks = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
					
				}
				
				return numOfDisks;
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}

}