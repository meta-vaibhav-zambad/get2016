/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To implement College Counseling Process using ArrayList and Queue
*/
package assignment_2;

// college class 
public class College {
	
	private String collegeName;
	
	private int collegeRank , collegeSeats;
	
	/**
	 * empty constructor
	 */
	public College(){
		
		
	}
	
	/**
	 * Parameterized constructor for setting up the name , rank and seats of college
	 * 
	 * @param collegeName
	 * @param collegeRank
	 * @param collegeSeats
	 */
	public College(String collegeName , int collegeRank , int collegeSeats){
		
		this.collegeName = collegeName;
		
		this.collegeRank = collegeRank;
		
		this.collegeSeats = collegeSeats;
	}
	
	/**
	 * 
	 * @param collegeName
	 */
	public void setCollegeName(String collegeName){
		
		this.collegeName = collegeName;
	}
	
	/**
	 * 
	 * @return collegeName
	 */
	public String getCollegeName(){
		
		return this.collegeName;
	}
	
	/**
	 * 
	 * @param collegeRank
	 */
	public void setCollegeRank(int collegeRank){
		
		this.collegeRank = collegeRank;
	}
	
	/**
	 * 
	 * @return collegeRank
	 */
	public int getCollegeRank(){
		
		return this.collegeRank;
	}
	
	/**
	 * 
	 * @param collegeSeats
	 */
	public void setCollegeSeats(int collegeSeats){
		
		this.collegeSeats = collegeSeats;
	}
	
	/**
	 * 
	 * @return collegeSeats
	 */
	public int getCollegeSeats(){
		
		return this.collegeSeats;
	}
}