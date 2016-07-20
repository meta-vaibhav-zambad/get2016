
/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 20 July 2016
 * 
 * Aim : Add elements in matrix , Multiplication of matrix , Transpose of matrix, display matrix
 */

package assignment2;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Matrix {
	
	
	// Buffered Reader class for input
	BufferedReader br;
	
	public Matrix(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) {
		
		// object of class matrix
		Matrix matrix = new Matrix();
		
		// choice value is initialized
		int choice = 0; 
		
		// output matrix to store output
		int[][] outputMatrix;
		
		// input matrix to get input
		int[][] inputMatrix;
		
		while(true){
			
			int flag= 0;
			
			// printing choices
			System.out.println("1. Add elements in matrix");
			
			System.out.println("2. Multiplication Of Matrix");
			
			System.out.println("3. Transpose of Matrix");
			
			System.out.println("4. exit");
			
			choice = matrix.getPositiveIntegerInput("Please enter your choice");
			
			
			switch(choice){
			
				case 1:
					
					inputMatrix = matrix.readMatrixArray();
					
					matrix.displayMatrix(inputMatrix);
					 
					break;
					
				case 2:
					
					MultiplicationOfMatrix multiplication = new MultiplicationOfMatrix();
					
					int[][] firstMatrix = multiplication.getFirstMatrix();
					
					int[][] secondMatrix = multiplication.getSecondMatrix();
					
					outputMatrix = multiplication.multiplyMatrix(firstMatrix, secondMatrix);
					
					matrix.displayMatrix(outputMatrix);
					
					break;
					
				case 3:
					
					Transpose transpose = new Transpose();
					
					inputMatrix = matrix.readMatrixArray(); 
					
					outputMatrix  = transpose.transposeOfMatrix(inputMatrix);
					
					matrix.displayMatrix(outputMatrix);
					
					break;
					
				case 4:
					
					flag = 1;
					break;
			}
			
			if(flag == 1){
				
				break;
			}
		}
		
		System.out.println("Program Exited");

	}
	
	/**
	 * 
	 * @return matrix
	 */
	public int[][] readMatrixArray(){
		
		Matrix matrix = new Matrix();
		
		int numberOfRowsInMatrix = matrix.getPositiveIntegerInput("Please enter valid number "
				+ "of rows in matrix");
		
		int numberOfColumnsInMatrix = matrix.getPositiveIntegerInput("Please enter valid "
				+ "number of columns in matrix");
		
		int[][] matrixArray = new int[numberOfRowsInMatrix][numberOfColumnsInMatrix];
		
		for(int i=0;i<numberOfRowsInMatrix;++i){
			
			for(int j=0;j<numberOfColumnsInMatrix;++j){
				
				matrixArray[i][j] = matrix.getAnyIntegerInput("Please enter valid value at "
						+ (i+1)+" th row and "+(j+1) + " th column in matrix");
			}
			
		}
		
		return matrixArray;
	}
	
	/**
	 * 
	 * @param inputMessage
	 * @return positive value
	 */
	public int getPositiveIntegerInput(String inputMessage){
		
		
		int inputNumber;
		
		try{
			
			System.out.println(inputMessage);
			
			inputNumber = Integer.parseInt(br.readLine());
			
			if(inputNumber <= 0){
				
				inputNumber = getPositiveIntegerInput(inputMessage);
			}
			
		}catch(Exception ex){
			
			System.out.println("invalid input: "+ex.getMessage());
			
			inputNumber = getPositiveIntegerInput(inputMessage);
		}
		
		return inputNumber;
	}
	
	/**
	 * 
	 * @param inputMessage
	 * @return any integer (positive and negative both)
	 */
	public int getAnyIntegerInput(String inputMessage){
		
		int inputNumber;
		
		try{
			
			System.out.println(inputMessage);
			
			inputNumber = Integer.parseInt(br.readLine());
		}catch(Exception ex){
			
			System.out.println("invalid input: "+ex.getMessage());
			
			inputNumber = getAnyIntegerInput(inputMessage);
		}
		
		return inputNumber;
	}
	
	/**
	 * 
	 * @param matrix
	 */
	public void displayMatrix(int[][] matrix){
		
		for(int i=0;i < matrix.length ; ++i){
			
			for(int j=0;j<matrix[0].length;++j){
				
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
