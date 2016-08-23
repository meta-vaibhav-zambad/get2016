/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Delete all those books which were not issued in last 1 year. 
 * 			Return the number of books deleted.	
*/
package assignment_3;

import java.sql.SQLException;

import assignment_1.DAOManager;

//Main Class 
public class Library {

	// entry method for program
	public static void main(String[] args) throws ClassNotFoundException, SQLException{


		DAOManager daoManager = DAOManager.getInstance();

		BookIssuedDAO bookIssueDAO = new BookIssuedDAO(daoManager.getConnection());

		bookIssueDAO.BookIssuedDelete();

		daoManager.closeConnection();
	}
}