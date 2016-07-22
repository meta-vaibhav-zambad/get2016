/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to sort questions based on question string
*/
package assignment_2;


public class Question implements Comparable<Question>{
	
	String questionString;
	/**
	 * 
	 * @param questionString
	 */
	public Question(String questionString){
		
		this.questionString = questionString;
	}
	
	/**
	 * 
	 * @param questionString
	 */
	public void setQuestionString(String questionString){
		
		this.questionString = questionString;
	}
	
	/**
	 * 
	 * @return questionString
	 */
	public String getQuestionString(){
		
		return questionString;
	}
	
	/**
	 * method for comparable interface
	 */
	@Override
	public int compareTo(Question other){
		
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
		
	
        int last = this.questionString.compareTo(other.questionString);
        
        return last == 0 ? this.questionString.compareTo(other.questionString) : last;
        
    }
}