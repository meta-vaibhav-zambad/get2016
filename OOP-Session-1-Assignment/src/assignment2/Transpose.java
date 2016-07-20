/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 20 July 2016
 */
package assignment2;


public class Transpose {
	
	/**
	 * 
	 * @param matrix
	 * @return transpose of matrix
	 */
	public int[][] transposeOfMatrix(int[][] matrix){
		
		int[][] matrixTranspose = new int[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix[0].length;++i){
			
			for(int j=0;j<matrix.length;++j){
				
				matrixTranspose[i][j] = matrix[j][i];
			}
		}
		
		return matrixTranspose;
	}

}