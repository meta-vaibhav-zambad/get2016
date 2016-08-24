/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Write a program to fetch all the books published by author, given the name of the author. 
 *		Return the books data (List of Titles).
*/
package assignment_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Data Access Object class for book
// contains all queries related to books
public class BookDAO {

	private List<Book> listOfBooks = null; 
	private Connection connection = null;

	/**
	 * Parameterized Constructor for BookDAO
	 * @param connection
	 */
	public BookDAO(Connection connection){

		this.connection = connection;
		listOfBooks = new ArrayList<Book>();
	}
	
	/**
	 * This method runs a query on book class
	 * Set the book parameters after executing query 
	 * 
	 * @param author
	 * @return List of books on query
	 */
	public List<Book> selectBooks(Author author){

		String sqlQuery = "SELECT t.title_name , t.title_type , t.title_price FROM Authors a "
				+ "INNER JOIN title_author ta ON ta.author_id = a.author_id "
				+ "INNER JOIN Titles t ON t.title_id = ta.title_id "
				+ "WHERE a.author_lname = ? AND a.author_fname = ?;";

		PreparedStatement prepareStatement = null;

		try{

			prepareStatement = this.connection.prepareStatement(sqlQuery);

			prepareStatement.setString(1, author.getAuthorLName());
			prepareStatement.setString(2, author.getAuthorFName());

			ResultSet resultSet = prepareStatement.executeQuery();

			if(resultSet != null){

				while(resultSet.next()){

					Book book = new Book();
					book.setBookTitleName(resultSet.getString(1));
					book.setBookType(resultSet.getString(2));
					book.setBookPrice(resultSet.getDouble(3));
					listOfBooks.add(book);
				}
			}

		}catch(Exception ex){

			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}

		return listOfBooks;
	}
}