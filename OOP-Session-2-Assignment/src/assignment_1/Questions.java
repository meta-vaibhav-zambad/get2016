/**
 * 
 */
package assignment_1;

/**
 * @author vaibhav
 *
 */
public class Questions {
	
	//FileOperations fileOperations = new FileOperations();
	
	//List<String> data = fileOperations.getData();
	
	private String questionString;
	private String questionType;
	private String questionChoices;
	
	public void setQuestionString(String questionString){
		
		this.questionString = questionString;
		
	}
	
	public String getQuestionString(){
		
		return questionString;
	}
	
	public void setQuestionType(String questionType){
		
		String modifiedQuestionType = questionType.trim();
		
		this.questionType = modifiedQuestionType;
		
	}
	
	public String getQuestionType(){
		
		return questionType;
		
	}
	
	public void setChoices(String questionChoices){
		
		String modifiedQuestionChoices = questionChoices.replace("(","").
							replace(")", "").trim();
		
		this.questionChoices = modifiedQuestionChoices;
		
	}
	
	public String getChoices(){
		
		return questionChoices;
		
	}
}
