/**
 * 
 */
package pF_Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author admin
 *
 */
public class PF_Assignment3 {
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;			
			
	private int count; 
			
	private static int[] arr;
	
	public PF_Assignment3(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PF_Assignment3 longestIncreasingSequence = new PF_Assignment3();
		longestIncreasingSequence.readInput();
		
		ps.println("The Longest Increasing Sequence is : ");
		
		int[] output = longestIncreasingSequence.longestSequence(arr);
		
		for(int i=0;i<output.length;++i){
			ps.println(output[i]);
		}
		

	}
	
	public void readInput(){
		readCount();
		readArray();
	}
	
	public int[] longestSequence(int[] input){

		int[] tempArray = new int[input.length];
		
		int maxcount = 0,count = 0,temp=0,lastIndex = 0;
		
		for(int i=0;i<input.length-1;++i){
			if(input[i] < input[i+1]){
				tempArray[temp] = input[i];
				temp++;
				count++;
				lastIndex = i+1;
			}
			else{
				if(maxcount < count){
					
					maxcount = count;
					count = 0;
					temp = 0;
				}
			}
		}
		if(maxcount < count){
			maxcount = count;
		}

		tempArray[maxcount] = input[lastIndex];
		maxcount++;
		
		int[] outputArray = new int[maxcount];
		
		for(int i=0;i<maxcount;++i){
			outputArray[i] = tempArray[i];
		}
		
		return outputArray;
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