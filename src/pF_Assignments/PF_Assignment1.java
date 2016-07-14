package pF_Assignments;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class PF_Assignment1 {
	
	private Scanner sc;
	
	private static PrintStream ps ;			
	
	private static int binaryNumber;
	
	public PF_Assignment1(){
		
		sc = new Scanner(System.in);
		ps = new PrintStream(System.out);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PF_Assignment1 conversion = new PF_Assignment1();
		conversion.readInput();
		
		ps.println("The converted octal number is: "+conversion.convertBinaryToOctal(binaryNumber));
		

	}
	
	public void readInput(){
		
		readBinaryNumber();
	}
	
	public int convertBinaryToOctal(int n){
		
		int decimalValue = 0,base = 1,octalValue=0,temp = 1;
		
		while(n != 0){
			
			decimalValue += (n%10)*base;
			n /= 10;
			base *= 2;
			
		}
		
		while(decimalValue != 0){
			octalValue += (decimalValue%8)*temp;
			decimalValue /= 8;
			temp *= 10;
		}
		
		return octalValue;
	}
	
	
	private int getInputFromKeyboard(){
		while(true){
			try{
				return sc.nextInt();
			}catch(Exception ex){
				ps.println("Please enter the correct binary number");
				sc.next();
			}
		}
	}
	
	private void readBinaryNumber(){
		
		ps.println("Please enter the binary number");
		binaryNumber = getInputFromKeyboard();
	}
}