/**
 * @author Vaibhav Zambad
 * 
 * Date : 19 July 2016
 *
 * Aim : To return all the permutations of given string
 */

//package name reflects the assignment number
package assignment_2;

//required imports to use inbuilt function to take user inputs
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class PermutationsOfString {

	/**
	 * @param args
	 * 
	 * Main Method to test the program
	 */
	public static void main(String[] args) {
		
		PermutationsOfString permut = new PermutationsOfString();
		
		permut.passAllPermutations(permut.readString());

	}
	
	/**
	 * 
	 * @param inputString
	 * @return List<String> containing all permutations
	 */
	public List<String> passAllPermutations(String inputString){
		
		PermutationsOfString permut = new PermutationsOfString();
		
		List<String> permutationsOfString = new ArrayList<String>();
		
		permut.makePermutation("",inputString, permutationsOfString);
		
		for(int i=0;i<permutationsOfString.size();++i){
			
			System.out.println(permutationsOfString.get(i));
		}
		
		return permutationsOfString;
	}
	
	/**
	 * 
	 * @param tempString
	 * @param inputString
	 * @param permutationsOfString
	 * 
	 * computing all permutations of string
	 */
	public void makePermutation(String tempString , String inputString,List<String> permutationsOfString){
	
		if(inputString.length() <= 1){
			
			String finalString = tempString + inputString;
			
			//System.out.println(finalString);
			
			if(! permutationsOfString.contains(finalString)){
				permutationsOfString.add(finalString);
			}
			
			//return permutationsOfString;
			
		}
		
		for(int i=0;i<inputString.length();++i){
				
			String newString = inputString.substring(0,i)+inputString.substring(i+1);
			
			makePermutation(tempString+inputString.charAt(i),
					newString,permutationsOfString);
		}
	}
	
	/**
	 * 
	 * @return String to compute permutations
	 */
	private String readString(){
		
		while(true){
			
			try{
				System.out.println("Please enter a valid string as input");
				
				String inputString = new BufferedReader(new InputStreamReader(System.in)).readLine();
				
				return inputString;
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}
}