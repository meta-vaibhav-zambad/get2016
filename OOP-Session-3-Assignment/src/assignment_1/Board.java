package assignment_1;

/**
 * 
 * The board class models the game board
 *
 */

public class Board {

	// Named constants for the dimensions

	public static final int ROWS = 3;
	public static final int COLUMNS = 3;

	// object of class Cell
	// a board composes of Rows and Columns cell instances
	Cell[][] cells;

	// the current seed's row and column
	int currentRow,currentColumn;

	/** Constructor to initialize the game board*/
	public Board(){

		// allocate the array
		cells = new Cell[ROWS][COLUMNS];

		for(int row = 0; row < ROWS ;++row){

			for(int column = 0;column < COLUMNS;++column){

				// allocate elements of the array
				cells[row][column] = new Cell(row, column);
			}
		}
	}

	/** Initialize (or re-initialize) the contents of the game board*/

	public void init(){

		for(int row = 0; row < ROWS ; ++row){
			for(int column = 0;column < COLUMNS;++column){
				// clear the cell content
				cells[row][column].clear();
			}
		}
	}

	/** Return true if it is a draw (i.e., no more EMPTY cell) */
	public boolean isDraw() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLUMNS; ++col) {
				if (cells[row][col].content == Seed.EMPTY) {
					return false; // an empty seed found, not a draw, exit
				}
			}
		}
		return true; // no empty cell, it's a draw
	}

	/**
	 * Return true if the player with "theSeed" has won after placing at (currentRow , currentColumn)
	 */
	public boolean hasWon(Seed theSeed) {
		return (cells[currentRow][0].content == theSeed         // 3-in-the-row
				&& cells[currentRow][1].content == theSeed
				&& cells[currentRow][2].content == theSeed
				|| cells[0][currentColumn].content == theSeed      // 3-in-the-column
				&& cells[1][currentColumn].content == theSeed
				&& cells[2][currentColumn].content == theSeed
				|| currentRow == currentColumn            // 3-in-the-diagonal
				&& cells[0][0].content == theSeed
				&& cells[1][1].content == theSeed
				&& cells[2][2].content == theSeed
				|| currentRow + currentColumn == 2    // 3-in-the-opposite-diagonal
				&& cells[0][2].content == theSeed
				&& cells[1][1].content == theSeed
				&& cells[2][0].content == theSeed);
	}

	/** to make the board */
	public void drawBoard() {
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLUMNS; ++col) {
				cells[row][col].drawSymbols();  // each cell draw symbols itself
				if (col < COLUMNS - 1) System.out.print("|");
			}
			System.out.println();
			if (row < ROWS - 1) {
				System.out.println("-----------");
			}
		}
	}
}