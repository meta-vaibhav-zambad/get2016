/**
 * @author vaibhav zambad
 * 
 * Date : 23 August 2016
 * 
 * Aim :  Write a program to fetch all the books published by author, given the name of the author. 
 *		Return the books data (List of Titles).
*/
package assignment_1;

// pojo (Plain Old Java Object) author class
// getter setter for author class
public class Author {

	// author first name
	private String authorLName;
	
	// author last name
	private String authorFName;
	
	/**
	 * Constructor for author
	 */
	public Author(){
		
		this.authorLName = null;
		this.authorFName = null;
	}
	
	/**
	 * Parameterized Constructor for author
	 */
	public Author(String authorLName,String authorFName){

		this.authorLName = authorLName;
		this.authorFName = authorFName;

	}
	
	/**
	 * @return the authorLName
	 */
	public String getAuthorLName() {
		return authorLName;
	}

	/**
	 * @param authorLName the authorLName to set
	 */
	public void setAuthorLName(String authorLName) {
		this.authorLName = authorLName;
	}

	/**
	 * @return the authorFName
	 */
	public String getAuthorFName() {
		return authorFName;
	}

	/**
	 * @param authorFName the authorFName to set
	 */
	public void setAuthorFName(String authorFName) {
		this.authorFName = authorFName;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		return this.authorLName+" "+this.authorFName;
	}
}