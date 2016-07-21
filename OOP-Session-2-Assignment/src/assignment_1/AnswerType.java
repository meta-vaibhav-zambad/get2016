/**
 * 
 */
package assignment_1;

/**
 * @author vaibhav
 *
 */
public class AnswerType {
	
	ConsoleOperations consoleOperations = new ConsoleOperations();
	
	Validations validations = new Validations();
	
	
	public String getSingleSelectAnswer(String choices){
		
		String userAnswer="";
		
		try{
		
			userAnswer = consoleOperations.getString("Please enter valid answer");
		
			if( ! (validations.validateUserInputForSingleSelect(userAnswer, choices) )){
				
				userAnswer = getSingleSelectAnswer(choices);
				
			}
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ex.getMessage());
		}
		
		return userAnswer;

	}
	
	public String getMultiSelectAnswer(String choices){
		
		String userAnswer="";
		
		try{
			
			userAnswer = consoleOperations.getString("Please enter valid answers with / seperated"
					+ " values");
			
			if(! (validations.validateUserInputForMultiSelect(userAnswer, choices))){
				
				userAnswer = getMultiSelectAnswer(choices);
			}
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return userAnswer;
	}
}