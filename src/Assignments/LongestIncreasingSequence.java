/**
 * 
 */
package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author admin
 *
 */
public class LongestIncreasingSequence {
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;			
			
	private int count; 
			
	private static int[] arr;
	
	private static int maxelements;
	
	public LongestIncreasingSequence(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestIncreasingSequence longestIncreasingSequence = new LongestIncreasingSequence();
		longestIncreasingSequence.readInput();
		
		ps.println("The Longest Increasing Sequence is : ");
		
		int[] output = longestIncreasingSequence.longestSequence(arr);
		
		//int[] output = remove.removeDuplicate(arr);
		
		for(int i=0;i<maxelements;++i){
			ps.println(output[i]);
		}

	}
	
	public void readInput(){
		readCount();
		readArray();
	}
	
	public int[] longestSequence(int[] input){
		
		int[] output = new int[input.length];
		
		int outputArrayIndex = 0;
		
		for(int i=0;i<input.length-1;++i){
			
			if(input[i] < input[i+1]){
				//ps.println("inp: "+input[i]);
				output[outputArrayIndex] = input[i];
				outputArrayIndex++;
			}
			
			
			
			if(maxelements < outputArrayIndex){
				maxelements = outputArrayIndex;
			}
		}
		
		//ps.println("out: "+outputArrayIndex);
		
		output[outputArrayIndex] = input[outputArrayIndex+1];
		maxelements++;
		
		return output;
		
	}
	
	private int getInputFromKeyboard(){
		while(true){
			try{
				return Integer.parseInt(br.readLine());
			}catch(Exception ex){
				ps.println("Please enter the correct number");
				try{
					br.readLine();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	private void readCount(){
		
		ps.println("Please enter the number of count which must be greater than zero");
		count = getInputFromKeyboard();
		while(count<=0){
			ps.println("Please enter the number of count which must be greater than zero");
			count = getInputFromKeyboard();
		}
	}
	
	private void readArray(){
		arr = new int[count];
		for(int i=0;i<count;++i){
			ps.println("Please enter the "+(i+1)+"th number");
			arr[i] = getInputFromKeyboard();
		}
	}

}
