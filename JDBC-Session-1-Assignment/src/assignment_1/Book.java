/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Write a program to fetch all the books published by author, given the name of the author. 
 *		Return the books data (List of Titles).
*/
package assignment_1;

//pojo (Plain Old Java Object) book class
//getter setter for book class
public class Book {
	
	// variable for book title name
	private String bookTitleName;
	
	// variable for book type
	private String bookType;
	
	// variable for book price
	private double bookPrice;

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
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * @return the bookPrice
	 */
	public double getBookPrice() {
		return bookPrice;
	}

	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}	
}