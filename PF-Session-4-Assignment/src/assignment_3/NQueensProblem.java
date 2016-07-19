/**
 * 
 */
package assignment_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vaibhav
 *
 */
public class NQueensProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NQueensProblem nq = new NQueensProblem();
		
		int[][] board = new int[8][8];
		
		nq.nQueen(board, 0, 0, 8, 8);

	}
	
	public void nQueen(int[][]board ,int startRow,int startColumn,int totalRows,int totalColumns){
		
		
		int flag = 0 , count2=0;
		
		int columnValue=0;
		
		for(int loopVariableForColumn = startColumn; loopVariableForColumn < totalColumns ; ++loopVariableForColumn){
			
			if(board[startRow][loopVariableForColumn] == 0){
				
				board[startRow][loopVariableForColumn] = 20;
				
				columnValue = loopVariableForColumn;
				
				flag = 1;
				
				break;
				
			}
			
			else if(board[startRow][loopVariableForColumn] == 20){
				
				board[startRow][loopVariableForColumn] = 0;
				
				//flag = 1;
			}
		}
		
		if(flag!=1){
			
			//System.out.println(startRow);
			
			int count1 = 0;
			
			for(int loopVariableForRow = 0;loopVariableForRow < totalRows ;++loopVariableForRow){
				
				for(int loopVariableForColumn = 0;loopVariableForColumn < totalColumns ;++loopVariableForColumn){
					
					if(board[loopVariableForRow][loopVariableForColumn] == startRow){
						
						board[loopVariableForRow][loopVariableForColumn] = 0;
					}
				}
			}
			
			for(int i=0;i<totalRows;++i){
				
				for(int j=0;j<totalColumns;++j){
					
					System.out.print(board[i][j]+" ");
				}
				
				System.out.println();
			}
			
			System.out.println();
			
			
			for(int loopVariableForRow = 0;loopVariableForRow < totalRows ;++loopVariableForRow){
				
				for(int loopVariableForColumn = 0;loopVariableForColumn < totalColumns ;++loopVariableForColumn){
					
					if(board[loopVariableForRow][loopVariableForColumn] == startRow){
						
						board[loopVariableForRow][loopVariableForColumn] = 20;
						
						count1++;
					}
				}
			}
			
			if(count1 == 8){
				return ;
			}
			
			//return;
			
			nQueen(board, startRow-1, 0, totalRows, totalColumns);
			
			
			//return ;
		}
		
		for(int loopVariableForRow = startRow+1;loopVariableForRow < totalRows ; ++loopVariableForRow){
			
			if(board[loopVariableForRow][columnValue] == 0 ){
				
				board[loopVariableForRow][columnValue] = startRow+1;
			}
			
		}
		
		for(int loopVariableForColumn = startColumn+1;loopVariableForColumn < totalColumns ; ++loopVariableForColumn){
			
			if(board[startRow][loopVariableForColumn] == 0){
				
				board[startRow][loopVariableForColumn] = startRow+1;
			}
		}
		
		for(int loopVariableForRow = startRow , loopVariableForColumn = columnValue  ; 
					loopVariableForRow < totalRows - 1 && loopVariableForColumn  < totalColumns - 1 ;
						loopVariableForColumn++,loopVariableForRow++){
			
			if(board[loopVariableForRow+1][loopVariableForColumn+1] == 0){
			
				board[loopVariableForRow+1][loopVariableForColumn+1] = startRow+1;
			}
		}
		
		for(int loopVariableForRow = startRow , loopVariableForColumn = columnValue   ; 
				loopVariableForRow < totalRows - 1 && loopVariableForColumn  > 0 ;
					loopVariableForColumn--,loopVariableForRow++){
			
			if(board[loopVariableForRow+1][loopVariableForColumn-1] == 0){
				
				board[loopVariableForRow+1][loopVariableForColumn-1] = startRow+1;
			}
		}
		
		for(int i=0;i<totalRows;++i){
			for(int j=0;j<totalColumns;++j){
				
				System.out.print(board[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();

		int flag1 = 0;
		for(int i=0;i<totalRows;++i){
			for(int j=0;j<totalColumns;++j){
				
				if(board[i][j]  == 20){
					
					count2++;
				}
			}
		}
		
		if(count2 == 8){
			
			return ;
		}
		nQueen(board, startRow+1, startColumn, totalRows, totalColumns);
		
	}
	private int readNumberOfDisk(){
		
		while(true){
			
			try{
				
				System.out.println("Please enter the valid value for number of queens");
				
				int numOfQueens = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				while(numOfQueens <= 0){
					
					
					System.out.println("Please enter the valid value for number of disks");
					
					numOfQueens = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
					
				}
				
				return numOfQueens;
				
			}catch(Exception ex){
				
				System.out.println("invalid input: "+ex.getMessage());
			}
		}
	}

}