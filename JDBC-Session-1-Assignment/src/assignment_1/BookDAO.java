package assignment_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class BookDAO {
	
	private List<Book> listOfBooks;
	private Connection connection;
	
	Author author = new Author();
	
	public BookDAO(Connection connection){
		
		this.connection = connection;
	}
	
	public List<Book> selectBooks(){
		
		String sqlQuery = "SELECT t.title_name , t.title_type ,"
				+ " t.title_price FROM Authors a "
				+ "INNER JOIN title_author ta ON ta.author_id = a.author_id "
				+ "INNER JOIN Titles t ON t.title_id = ta.title_id;";
		
		PreparedStatement prepareStatement;
		
		try{
			
			prepareStatement = this.connection.prepareStatement(sqlQuery);
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()){
				
				Book book = new Book();
				book.setBookTitleName(resultSet.getString(1));
				book.setBookType(resultSet.getDate(2));
				book.setBookPrice(resultSet.getDouble(3));
				listOfBooks.add(book);
			}
			
		}catch(Exception ex){
			
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		
		return listOfBooks;
	}
}