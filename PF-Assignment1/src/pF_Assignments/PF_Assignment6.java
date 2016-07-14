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
public class PF_Assignment6 {
	
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;			
			
	private static  int countA;
	
	private static int countB;
			
	private static int[] a;
	
	
	private static int[] b;
	
	
	private static int[] c;
	
	private static int outputArrayIndex ;
	
	public PF_Assignment6(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PF_Assignment6 joinsorted = new PF_Assignment6();
		joinsorted.readInput();
		
		c = new int[countA + countB];
		
		ps.println("The Joint Sorted Array is : ");
		
		
		
		int[] output = joinsorted.join(a, countA, b, countB, c);
		
		
		
		//int[] output = remove.removeDuplicate(arr);
		
		for(int i=0;i<(countA+countB);++i){
			
			ps.println(output[i]);
		}


	}
	
	public void readInput(){
		readCountA();
		readArrayA();
		readCountB();
		readArrayB();
	}
	
	int[] join (int a[],int asize,int[] b,int bsize,int c[]){
		
		int aindex = 0,bindex=0,cindex=0;
		
		while(aindex < asize && bindex < bsize){
			if(a[aindex] >= b[bindex]){
				c[cindex] = b[bindex];
				bindex++;
			}
			else{
				c[cindex] = a[aindex];
				aindex++;
			}
			cindex++;
		}
		
		while(aindex < asize){
			c[cindex] = a[aindex];
			aindex++;
			cindex++;
		}
		
		while(bindex<bsize){
			c[cindex] = b[bindex];
			bindex++;
			cindex++;
		}
		
		return c;
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
	
	private void readCountA(){
		
		ps.println("Please enter the number of count for array A which must be greater than zero");
		countA = getInputFromKeyboard();
		while(countA<=0){
			ps.println("Please enter the number of count which must be greater than zero");
			countA = getInputFromKeyboard();
		}
	}
	
	private void readCountB(){
		
		ps.println("Please enter the number of count for array B which must be greater than zero");
		countB = getInputFromKeyboard();
		while(countB<=0){
			ps.println("Please enter the number of count which must be greater than zero");
			countB = getInputFromKeyboard();
		}
	}
	
	
	private void readArrayA(){
		a = new int[countA];
		for(int i=0;i<countA;++i){
			ps.println("Please enter the "+(i+1)+"th number");
			a[i] = getInputFromKeyboard();
		}
	}
	
	private void readArrayB(){
		b = new int[countB];
		for(int i=0;i<countB;++i){
			ps.println("Please enter the "+(i+1)+"th number");
			b[i] = getInputFromKeyboard();
		}
	}

}
