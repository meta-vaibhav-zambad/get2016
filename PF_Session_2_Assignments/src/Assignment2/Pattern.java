/**
 * 
 */
package Assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author vaibhav zambad
 *
 */
public class Pattern {
	
	//object of Buffered Reader class for input
	private BufferedReader br ;
	
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
		
		String[] requiredPattern = pattern.printPyramid(pattern.readNumberOfRows());
		
		for(int i=0;i<requiredPattern.length;++i){
			
			System.out.println(requiredPattern[i]);
		}

	}
	
	// method to compute position of spaces in string
	public String spaces(int row,int numberOfRows){
		
		String s1="";
		
		for(int j=0;j<row;++j){
			s1+=" ";
		}
		
		return s1;
	}
	
	// method to compute position of numbers in string
	public String numbers(int row,int numberOfRows){
		String s1="";
		
		for(int j=0;j<numberOfRows-row;++j){

			s1+=String.valueOf(j+1);
		}
		
		return s1;
	}
	
	// method to compute the whole pyramid
	public String[] printPyramid(int numberOfRows){
		
		String s1,s2;
		String[] tempString = new String[numberOfRows];
		
		for(int i=0;i<numberOfRows;++i){
			
			s1 = spaces(i,numberOfRows);
			s2 = numbers(i,numberOfRows);
			tempString[i] = s1+s2;
		}
		
		return tempString;
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