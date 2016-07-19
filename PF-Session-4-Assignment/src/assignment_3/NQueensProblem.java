/**
 * @author Vaibhav Zambad
 * 
 * Date : 19 July 2016
 *
 * Aim : To return all the correct positions of queens in a chessboard such that they do not attack each other
 */
package assignment_3;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class NQueensProblem {

	/**
	 * @param args
	 * 
	 * Main method to test the program
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NQueensProblem nq = new NQueensProblem();
		
		int dimensionOfMatrix = nq.readNumberOfQueens();
		
		int[][] board = new int[dimensionOfMatrix][dimensionOfMatrix];
		
		nq.nQueen(board, 0, dimensionOfMatrix);
		
		
		for(int i=0;i<dimensionOfMatrix;++i){
			for(int j=0;j<dimensionOfMatrix;++j){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

	}
	
	/**
	 * 
	 * @param board
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return board containing the required positions
	 * 
	 * Here value "20" is taken as queen for simplicity
	 */
	public int[][] nQueen(int[][]board ,int startRow,int dimensionOfMatrix){
		
		// local variable for checking certain conditions
		int flag = 0 , count2=0;
		
		// column value to check for queens
		int columnValue=0;
		
		// for loop for traversing the columns 
		for(int loopVariableForColumn = 0; loopVariableForColumn < dimensionOfMatrix ; ++loopVariableForColumn){
			
			// here if the queen is already placed and we want to backtrack then we need to place 
			// 0 at that position
			if(board[startRow][loopVariableForColumn] == 20){
				
				board[startRow][loopVariableForColumn] = 0;
				
			}
			//if the queen is not placed at that position then we need to place the queen
			else{
				boolean check=true;
				
				// so for iterating the column to place the queen 
				// here there is a need to backtrack
				for(int i=loopVariableForColumn+1;i<dimensionOfMatrix;i++){
					
					// but if the queen is at previous position then do check false
					if(board[startRow][i] == 20){
						check=false;
					}
				}
				
				// now if the queen is not placed and queen is not at previous positions 
				// then place the queen there and no need to backtrack
				if(board[startRow][loopVariableForColumn] == 0 && check){
					
					board[startRow][loopVariableForColumn] = 20;
					
					columnValue = loopVariableForColumn;
					
					flag = 1;
					
					break;
					
				}
			}
			
		}
		
		// condition of backtrack 
		if(flag!=1){
			
			
			int count1 = 0;
			
			// checking the whole board to revert back the values 
			// updated due to placement of the queen at that position
			for(int loopVariableForRow = 0;loopVariableForRow < dimensionOfMatrix ;++loopVariableForRow){
				
				for(int loopVariableForColumn = 0;loopVariableForColumn < dimensionOfMatrix ;++loopVariableForColumn){
					
					// 
					if(board[loopVariableForRow][loopVariableForColumn] == startRow){
						
						board[loopVariableForRow][loopVariableForColumn] = 0;
					}
				}
			}
			
			
			// this is for checking whether there is queen in each row
			for(int loopVariableForRow = 0;loopVariableForRow < dimensionOfMatrix ;++loopVariableForRow){
				
				for(int loopVariableForColumn = 0;loopVariableForColumn < dimensionOfMatrix ;++loopVariableForColumn){
					
					if(board[loopVariableForRow][loopVariableForColumn] == startRow){
						
						board[loopVariableForRow][loopVariableForColumn] = 20;
						
						count1++;
						break;
					}
				}
			}
			
			// if yes then update the board by replacing the value 20 and other value by 0
			if(count1 == dimensionOfMatrix){
				
				for(int i=0;i<dimensionOfMatrix;++i){
					for(int j=0;j<dimensionOfMatrix;++j){
						if(board[i][j] == 20){
							board[i][j] = 1;
						}
						else{
							board[i][j]=0;
						}
					}
				}
				return board;
			}
			
			
			// if no then again recursively call the method by decreasing the row as 
			// the previous queen placed is not at correct position
			return nQueen(board, startRow-1,dimensionOfMatrix);
			
			
			//return ;
		}
		
		// updating the values of rows due to the placement of queens
		for(int loopVariableForRow = startRow+1;loopVariableForRow < dimensionOfMatrix ; ++loopVariableForRow){
			
			if(board[loopVariableForRow][columnValue] == 0 ){
				
				board[loopVariableForRow][columnValue] = startRow+1;
			}
			
		}
		
		// updating the values of columns due to the placement of queens
		for(int loopVariableForColumn = 1;loopVariableForColumn < dimensionOfMatrix ; ++loopVariableForColumn){
			
			if(board[startRow][loopVariableForColumn] == 0){
				
				board[startRow][loopVariableForColumn] = startRow+1;
			}
		}
		
		// updating the values diagonally right down to right due to the placement of queens
		for(int loopVariableForRow = startRow , loopVariableForColumn = columnValue  ; 
					loopVariableForRow < dimensionOfMatrix - 1 && loopVariableForColumn  < dimensionOfMatrix - 1 ;
						loopVariableForColumn++,loopVariableForRow++){
			
			if(board[loopVariableForRow+1][loopVariableForColumn+1] == 0){
			
				board[loopVariableForRow+1][loopVariableForColumn+1] = startRow+1;
			}
		}
		
		// updating the values diagonally left down to right due to the placement of queens
		for(int loopVariableForRow = startRow , loopVariableForColumn = columnValue   ; 
				loopVariableForRow < dimensionOfMatrix - 1 && loopVariableForColumn  > 0 ;
					loopVariableForColumn--,loopVariableForRow++){
			
			if(board[loopVariableForRow+1][loopVariableForColumn-1] == 0){
				
				board[loopVariableForRow+1][loopVariableForColumn-1] = startRow+1;
			}
		}
		

		//checking for the base condition
		for(int i=0;i<dimensionOfMatrix;++i){ 
			for(int j=0;j<dimensionOfMatrix;++j){
				
				if(board[i][j]  == 20){
					
					count2++;
					break;
				}
			}
		}
		
		// if true then updating board by replacing 20 as 1 and others as 0
		if(count2 == dimensionOfMatrix){
			
			for(int i=0;i<dimensionOfMatrix;++i){
				for(int j=0;j<dimensionOfMatrix;++j){
					if(board[i][j] == 20){
						board[i][j] = 1;
					}
					else{
						board[i][j]=0;
					}
				}
			}
			
			return board;
		}
		
		// if no then again call the method by incrementing values of row
		return nQueen(board, startRow+1, dimensionOfMatrix);
		
	}
	
	/**
	 * 
	 * @return numberOfQueens
	 */
	private int readNumberOfQueens(){
		
		while(true){
			
			try{
				
				System.out.println("Please enter the valid value for number of queens");
				
				int numOfQueens = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				while(numOfQueens < 4){
					
					System.out.println("Not Possible for "+numOfQueens+" queens");
					
					System.out.println("Please enter the valid value for number of queens");
					
					numOfQueens = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
					
				}
				
				return numOfQueens;
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}
}