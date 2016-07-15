/**
 * 
 */
package Assignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vaibhav zambad
 *
 */
public class Pattern {
	
	
	//object of Buffered Reader class for input 
	private BufferedReader br;
	
	//variable to store number of rows
	private int numberOfRows;
	
	//constructor to initialize objects
	public Pattern(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * main function to check output
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = new Pattern();
		
		int rows = pattern.readNumberOfRows();
		
		String[] requiredPattern = new String[(2*rows)-1];
		
		requiredPattern = pattern.printPyramid(rows);
		
		for(int i=0;i<requiredPattern.length;++i){
			
			System.out.println(requiredPattern[i]);
		}
		
	}
	
	// method to calculate the spaces when size is increasing
	public String spacesForContinuation(int row,int numberOfRows){
		
		String s1="";
		
		for(int j=0;j<numberOfRows-row-1;++j){
			
			s1 += " ";
			
		}
		
		return s1;
	}
	
	//method to calculate the spaces when size is decreasing
	public String spacesForReverse(int row,int numberOfRows){
		
		String s1="";
		
		for(int k=0;k<row-numberOfRows+1;++k){
			
			s1+=" ";
			
		}
		
		return s1;
	}
	
	// method to compute string when size is increasing
	public String numbersForContinuation(int row,int numberOfRows){
		
		String s1="";
		
		for(int k=0;k<row+1;++k){
			
			s1 += String.valueOf(k+1);
		}

		for(int k=row;k>0;--k){

			s1 += String.valueOf(k);
		}
		
		return s1;
	}
	
	// method to compute string when size is decreasing
	public  String numbersForReverse(int row,int numberOfRows){
		String s1 = "";
		
		for(int k=0;k<(2*numberOfRows)-row-1;++k){
			
			s1+=String.valueOf(k+1);
		}

		for(int k=(2*numberOfRows)-row-2;k>0;--k){
		
			s1+=String.valueOf(k);

		}
		
		return s1;
		
	}
	
	//method to compute the whole pyramid
	public String[] printPyramid(int numberOfRows){
		String s1,s2;
		
		String[] tempArray = new String[(2*numberOfRows)-1];
		
		for(int i=0;i<numberOfRows;++i){
			
			s1 = spacesForContinuation(i, numberOfRows);
			s2 = numbersForContinuation(i, numberOfRows);
			tempArray[i] = s1+s2;
		}
		
		for(int i=numberOfRows;i<(2*numberOfRows-1);++i){
			
			s1 = spacesForReverse(i, numberOfRows);
			s2 = numbersForReverse(i, numberOfRows);
			tempArray[i] = s1+s2;
		}
		
		return tempArray;
		
	}
		
	// method to feed input 
	private int getInputFromKeyboard(){
		while(true){
			try{
				return Integer.parseInt(br.readLine());
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	
	// method to read number of rows
	private int readNumberOfRows(){
		
		System.out.println("Please enter the number of rows which must be greater than zero");
		numberOfRows = getInputFromKeyboard();
		return numberOfRows;
	}

}