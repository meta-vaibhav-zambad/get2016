/**
 * @author Vaibhav Zambad
 * 
 * Date : 03-August-2016
 *  
 * Aim : To write a program to allot rooms in guest house using Hash Table techniques for allocation.
 */
package assignment_2;

// class to define guest
public class Guest {
	
	// variable for guest name
	private String guestName;
	
	// variable for guest age
	private int guestAge;
	
	/**
	 * Parameterized constructor for setting guest name and guest age
	 * 
	 * @param guestName
	 * @param guestAge
	 */
	public Guest(String guestName , int guestAge){
		
		this.guestName = guestName;
		
		this.guestAge = guestAge;
	}
	
	// return guest name
	public String getGuestName(){
		
		return this.guestName;
	}
	
	// return guest age
	public int getGuestAge(){
		
		return this.guestAge;
	}

}
