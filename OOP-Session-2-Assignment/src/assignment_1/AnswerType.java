/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;



// to define the answer type selected by user such as single type or multiple type
public class AnswerType {
	
	// object of console operations class
	ConsoleOperations consoleOperations = new ConsoleOperations();
	
	// object of validation class
	Validations validations = new Validations();
	
	
	/**
	 * 
	 * @param choices
	 * @return user answer
	 * 
	 * to get single select answer given by user
	 */
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
	
	/**
	 * 
	 * @param choices
	 * @return user answer
	 * 
	 * to get multiple select answer given by user
	 */
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