package Assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 * 
 */

/**
 * @author admin
 *
 */
public class Remove {
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;			
			
	private int count; 
			
	private static int[] arr;
	
	
	//private int outputArrayIndex;
	
	public Remove(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove remove = new Remove();
		remove.readInput();
		
		ps.println("The array by removing all the duplicated elements is : ");
		
		int[] output = remove.removeDuplicate(arr);
		
		//int[] output = remove.removeDuplicate(arr);
		
		for(int i=0;i<output.length;++i){
			ps.println(output[i]);
		}
	}
	
	public void readInput(){
		readCount();
		readArray();
	}
	
	
	
	public int[] removeDuplicate(int input[]){
		
		int tempNum,flag=0;
		
		int[] tempArray = new int[input.length];
		
		int outputArrayIndex = 1;
		
		tempArray[0] = input[0];
		
		for(int i=1;i<input.length;++i){
			
			flag = 0;
			
			tempNum = input[i];
			
			
			
			for(int j=0;j<outputArrayIndex;++j){
				//ps.println("num: "+tempNum);
				if(tempNum == tempArray[j]){
					//ps.println("Present");
					flag = 1;
					break;
				}
				else{
					flag = 0;
				}
			}
			
			
			if(flag == 0){
				//ps.println("num: "+tempNum);
				tempArray[outputArrayIndex] = tempNum;
				outputArrayIndex++;
			}
		}
		
		/*for(int i=0;i<outputArrayIndex;++i){
			ps.println(outputArray[i]);
		}*/
		
		int[] outputArray = new int[outputArrayIndex];
		
		for(int i=0;i<outputArrayIndex;++i){
			
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