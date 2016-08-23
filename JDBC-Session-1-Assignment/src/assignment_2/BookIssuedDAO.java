/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Given the name of the book, to be issued by an existing member.
 * 		Return flag to indicate whether the book has been issued or not.	
*/
package assignment_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Data Access Object class for book
//contains all queries related to books issued
public class BookIssuedDAO {

	private Connection connection = null;

	public BookIssuedDAO(Connection connection){

		this.connection = connection;
	}

	/**
	 * This method sets true or false for whether the book
	 * is available for issue or not
	 * 
	 * @param book
	 */
	public void isBookIssued(Book book){

		String sqlQuery = "SELECT COUNT(*) from books b"
				+ " INNER JOIN Titles t ON b.title_id = t.title_id "
				+ "LEFT JOIN book_issue bi ON b.accession_number = bi.accession_number "
				+ "LEFT JOIN book_return br ON b.accession_number = br.accession_number"
				+ " WHERE t.title_name = ? "
				+ "AND (bi.issue_date is NULL || (bi.issue_date is not NULL && br.return_date is not NULL));";

		PreparedStatement prepareStatement = null;

		try{

			prepareStatement = this.connection.prepareStatement(sqlQuery);

			prepareStatement.setString(1, book.getBookTitleName());

			ResultSet resultSet = prepareStatement.executeQuery();

			if(resultSet != null){
				
				while(resultSet.next()){

					if(resultSet.getInt(1) > 0){

						book.setBookIssued(true);
					}
					else{
						book.setBookIssued(false);
					}
				}
			}
			else{
				
				book.setBookIssued(false);
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}

	}
}