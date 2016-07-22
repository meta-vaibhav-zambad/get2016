/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;


public class Question {
	
	private String questionString;
	private String questionType;
	private String questionChoices;
	
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
	 * 
	 * @param questionType
	 * 
	 */
	public void setQuestionType(String questionType){
		
		String modifiedQuestionType = questionType.trim();
		
		this.questionType = modifiedQuestionType;
		
	}
	
	/**
	 * 
	 * @return questionType
	 */
	public String getQuestionType(){
		
		return questionType;
		
	}
	/**
	 * 
	 * @param questionChoices
	 */
	public void setChoices(String questionChoices){
		
		String modifiedQuestionChoices = questionChoices.replace("(","").
							replace(")", "").trim();
		
		this.questionChoices = modifiedQuestionChoices;
		
	}
	/**
	 * 
	 * @return questionChoices
	 */
	public String getChoices(){
		
		return questionChoices;
		
	}
}
