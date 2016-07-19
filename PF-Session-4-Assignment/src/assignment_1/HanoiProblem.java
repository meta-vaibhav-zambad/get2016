/**
 * 
 */
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

/**
 * @author vaibhav
 *
 */
public class HanoiProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HanoiProblem hanoiProblem = new HanoiProblem();
		
		List<String> requiredStepsList = new ArrayList<String>();
		
		requiredStepsList = hanoiProblem.towerOfHanoi("A", "C", "B", hanoiProblem.readNumberOfDisk(),requiredStepsList);
		
		System.out.println(Arrays.toString(requiredStepsList.toArray()));

	}
	
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
