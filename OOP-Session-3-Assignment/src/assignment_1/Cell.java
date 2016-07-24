package assignment_1;

/**
 * 
 * The cell class models each individual cell of the game board
 */
public class Cell {

	// content of this cell of type Seed
	// take a value of Seed.EMPTY , Seed.CROSS , Seed.NOUGHT
	Seed content;

	//row and column of this cell
	int row , column;

	/**Constructor to initialize this cell */
	public Cell(int row,int column){

		this.row = row;
		this.column = column;
		clear();
	}

	/** Clear the cell content to EMPTY */
	public void clear(){

		content = Seed.EMPTY;
	}

	/** place the required symbols on the screen*/
	public void drawSymbols(){

		switch(content){

		case CROSS: System.out.print(" X "); break;
		case NOUGHT: System.out.print(" O "); break;
		case EMPTY: System.out.print("   "); break;

		}
	}
}
