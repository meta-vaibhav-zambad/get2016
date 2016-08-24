/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Write a program to fetch all the books published by author, given the name of the author. 
 *		Return the books data (List of Titles).
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

// Main Class 
public class Library {

	// buffered reader object for input output stream
	BufferedReader bufferedReader = null;

	/**
	 * Sets the buffered reader object 
	 * Empty Library Constructor
	 */
	public Library(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
	}

	/**
	 * Entry method of the program
	 * 
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		Library library = new Library();

		Author author = new Author();

		// get DAO Manager single instance
		DAOManager daoManager = DAOManager.getInstance();

		// get user input for first name of author
		String firstNameOfAuthor = library.getUserInput("Please enter first name of author");

		// get user input for last name of author
		String lastNameOfAuthor = library.getUserInput("Please enter last name of author");
		
		author.setAuthorFName(firstNameOfAuthor);

		author.setAuthorLName(lastNameOfAuthor);

		// book dao object 
		BookDAO bookDao = new BookDAO(daoManager.getConnection());

		List<Book> bookList = bookDao.selectBooks(author);

		if(bookList != null && bookList.size() != 0){
			
			for(Book book : bookList){

				System.out.println("Title: "+book.getBookTitleName());
				System.out.println("Type: "+book.getBookType());
				System.out.println("Price: "+book.getBookPrice());
			}
		}
		else{
			
			System.out.println("No Books Found");
		}

		// close connection
		daoManager.closeConnection();


	}

	/**
	 * This method sets the user input
	 * 
	 * @param message
	 * @return user input
	 */
	public String getUserInput(String message){

		String userInput = "";

		while(true){

			try{

				System.out.println(message);

				userInput = bufferedReader.readLine();

				return userInput;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getLocalizedMessage());
			}
		}	
	}
}
