package assignment;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	// the game board
	private Board board;        

	// the current state of the game (of Enumeration GameState)
	private GameState currentState; 

	// the current player (of Enumeration Seed)
	private Seed currentPlayer; 

	// random class object for computer
	private Random random;

	// scanner class for input
	private Scanner scanner = new Scanner(System.in);


	/** Initialize the game-board contents and the current states */
	public void initGame() {
		board.init();  // clear the board contents
		currentPlayer = Seed.CROSS;       // CROSS plays first
		currentState = GameState.PLAYING; // ready to play
	}

	/** The player with "theSeed" makes one move, with input validation.
    Update Cell's content, Board's currentRow and currentCol. */

	public  void playerMove(Seed theSeed) throws IOException {
		boolean validInput = false;  // for validating input
		do {
			if (theSeed == Seed.CROSS) {
				System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): ");
			} else {
				System.out.println("Player 'O', enter your move (row[1-3] column[1-3]): ");
			}

			int row = scanner.nextInt() - 1;
			int col = scanner.nextInt() - 1;

			if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLUMNS
					&& board.cells[row][col].content == Seed.EMPTY) {
				board.cells[row][col].content = theSeed;
				board.currentRow = row;
				board.currentColumn = col;
				validInput = true; // input okay, exit loop
			} else {
				System.out.println("This move at (" + (row + 1) + "," + (col + 1)
						+ ") is not valid. Try again...");
			}
		} while (!validInput);   // repeat until input is valid
	}

	/**
	 *  The computer with "theSeed" makes one move, with input validation.
	 *	Update Cell's content, Board's currentRow and currentCol. 
	 */

	public void computerMove(Seed theSeed) throws IOException{

		random = new Random();


		// for validating input
		boolean validInput = false;

		do{


			int randomRow = random.nextInt((2 - 0)+1)+0; 
			int randomColumn = random.nextInt((2 - 0)+1)+0;

			if (randomRow >= 0 && randomRow < Board.ROWS && randomColumn >= 0 && randomColumn < Board.COLUMNS
					&& board.cells[randomRow][randomColumn].content == Seed.EMPTY) {

				if(theSeed == Seed.CROSS){

					System.out.println("Computer 'X' Played ");
				}
				else{

					System.out.println("Computer 'O' Played");
				}
				board.cells[randomRow][randomColumn].content = theSeed;
				board.currentRow = randomRow;
				board.currentColumn = randomColumn;
				validInput = true; // input okay, exit loop

			}

		}while(!validInput); // repeat until input is valid
	}

	/** Update the currentState after the player with "theSeed" has moved */
	public void updateGame(Seed theSeed) {
		if (board.hasWon(theSeed)) {  // check for win
			currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
		} else if (board.isDraw()) {  // check for draw
			currentState = GameState.DRAW;
		}
		// Otherwise, no change to current state (still GameState.PLAYING).
	}

	public void playGameForUser() throws IOException{

		// allocate game-board 
		board = new Board();  


		// Initialize the game-board and current status
		initGame();

		// Play the game once. Players CROSS and NOUGHT move alternately.
		do {

			// update the content, currentRow and currentColumn
			playerMove(currentPlayer); 

			// ask the board to paint itself
			board.drawBoard();

			// update currentState
			updateGame(currentPlayer);

			// Print message if game-over
			if (currentState == GameState.CROSS_WON) {
				System.out.println("'X' won! Thank you for playing");
			} else if (currentState == GameState.NOUGHT_WON) {
				System.out.println("'O' won! Thank you for playing");
			} else if (currentState == GameState.DRAW) {
				System.out.println("It's Draw! Thank you for playing");
			}

			// Switch player
			currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;

		} while (currentState == GameState.PLAYING);  // repeat until game-over

	}


	public void playGameForComputer() throws IOException{

		// allocate game-board 
		board = new Board();  


		// Initialize the game-board and current status
		initGame();

		// Play the game once. Players CROSS and NOUGHT move alternately.
		int chance = 0;
		do {

			// update the content, currentRow and currentColumn
			if(chance % 2==0){

				playerMove(currentPlayer);
			} 

			else{

				computerMove(currentPlayer);

			}

			// ask the board to paint itself
			board.drawBoard();

			// update currentState
			updateGame(currentPlayer);

			// Print message if game-over
			if (currentState == GameState.CROSS_WON) {
				System.out.println("'X' won! Thank you for playing");
			} else if (currentState == GameState.NOUGHT_WON) {
				System.out.println("'O' won! Thank you for playing");
			} else if (currentState == GameState.DRAW) {
				System.out.println("It's Draw! Thank you for playing");
			}

			// Switch player
			currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;

			chance++;

		} while (currentState == GameState.PLAYING);  // repeat until game-over


	}

	/** The entry main() method */
	public static void main(String[] args) throws IOException {

		ConsoleOperations consoleOperations = new ConsoleOperations();

		char userInput = '\0';

		do{

			TicTacToe ticTacToe = new TicTacToe();

			int inputNumber = consoleOperations.getPositiveInteger("Press 1 to play with another User"+"\n"+
					"Press 2 to play with computer");

			if(inputNumber == 1){

				ticTacToe.playGameForUser();
			}
			else{

				ticTacToe.playGameForComputer();
			}

			System.out.println("Do you want to continue ? Press Y or y for Yes Otherwise press any key to exit");

			userInput = consoleOperations.getChar();

		}while(userInput == 'Y' || userInput == 'y');
	}
}