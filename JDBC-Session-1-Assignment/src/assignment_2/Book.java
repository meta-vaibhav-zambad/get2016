/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Given the name of the book, to be issued by an existing member.
 * 		Return flag to indicate whether the book has been issued or not.	
*/
package assignment_2;

//pojo (Plain Old Java Object) book class
//getter setter for book class
public class Book {
	
	
	private String bookTitleName;
	private boolean isBookIssued;
	
	/**
	 * Empty constructor for Book class
	 */
	public Book(){
		
		this.bookTitleName = null;
		this.isBookIssued = true;
	}
	
	/**
	 * Parameterized constructor for book
	 * 
	 * @param bookTitleName
	 * @param isBookIssued
	 * @param bookAccessionNumber
	 */
	public Book(String bookTitleName , boolean isBookIssued , int bookAccessionNumber){
		
		this.bookTitleName = bookTitleName;
		this.isBookIssued = isBookIssued;
		
	}
			
	/**
	 * @return the bookTitleName
	 */
	public String getBookTitleName() {
		return bookTitleName;
	}

	/**
	 * @param bookTitleName the bookTitleName to set
	 */
	public void setBookTitleName(String bookTitleName) {
		this.bookTitleName = bookTitleName;
	}

	/**
	 * @return the isBookIssued
	 */
	public boolean isBookIssued() {
		return isBookIssued;
	}

	/**
	 * @param isBookIssued the isBookIssued to set
	 */
	public void setBookIssued(boolean isBookIssued) {
		this.isBookIssued = isBookIssued;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		return "Name: "+this.bookTitleName+"Issued: "+this.isBookIssued;
	}
}