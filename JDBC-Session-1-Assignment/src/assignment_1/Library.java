package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class Library {
	
	BufferedReader bufferedReader = null;
	
	public Library(){
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in)); 
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Library library = new Library();
		
		DAOManager daoManager = DAOManager.getInstance();
		
		String firstNameOfAuthor = library.getUserInput("Please enter first name of author");
		
		String lastNameOfAuthor = library.getUserInput("Please enter last name of author");
		
		BookDAO bookDao = new BookDAO(daoManager.getConnection());
		
		bookDao.selectBooks();
		
		daoManager.closeConnection();
	}
	
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
