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
public class CheckForSortedArray {
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;		
	
	private int count; 
	
	private static int[] arr;
	
	public CheckForSortedArray() {
		// TODO Auto-generated constructor stub
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckForSortedArray check = new CheckForSortedArray();
		check.readInput();
		
		ps.println("The result is: "+check.checkArray(arr));

	}
	
	public void readInput(){
		readCount();
		readArray();
	}
	
	int checkArray(int[] input){
		
		int result = 0,count = 0;
		
		for(int i=0;i<input.length-1;++i){
			
			if(arr[i] < arr[i+1]){
				
				count++;
			}
		}
		
		if(count == input.length-1){
			return 1;
		}
		
		else{
			
			count = 0;
			
			for(int i=0;i<input.length-1;++i){
				
				if(arr[i] > arr[i+1]){
					count++;
				}
			}
			
			if(count == input.length - 1){
				return 2;
			}
			
		}
		
		return 0;
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