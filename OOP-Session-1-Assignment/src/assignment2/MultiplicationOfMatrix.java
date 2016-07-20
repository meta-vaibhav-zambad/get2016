/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 20 July 2016
 */
package assignment2;



public class MultiplicationOfMatrix {
	
	Matrix matrix = new Matrix();
	/**
	 * 
	 * @param firstMatrix
	 * @param secondMatrix
	 * @return multiplication of matrix
	 */
	public int[][] multiplyMatrix(int[][] firstMatrix , int[][] secondMatrix){
		
		int sum = 0;
		
		int[][] resultantMatrix = new int[firstMatrix[0].length][secondMatrix.length]; 
		
		for(int i=0;i < firstMatrix[0].length ;++i){
			
			for(int j=0; j < secondMatrix.length;++j){
				
				for(int k=0;k < firstMatrix.length ; ++k){
					
					sum += firstMatrix[i][k] * secondMatrix[k][j];
				}
				
				resultantMatrix[i][j] = sum;
				
				sum = 0;
			}
		}
		
		return resultantMatrix;
		
	}
	
	/**
	 * 
	 * @return first matrix
	 */
	public int[][] getFirstMatrix(){
		
		int[][] firstMatrix = matrix.readMatrixArray();
		
		return firstMatrix;
		
	}
	
	/**
	 * 
	 * @return second matrix
	 */
	public int[][] getSecondMatrix(){
		
		int[][] secondMatrix = matrix.readMatrixArray();
		
		return secondMatrix;
	}
}