/**
 * 
 */
package assignment_1;

import java.util.List;

/**
 * @author admin
 *
 */
public class UserInterface {
	
	public void display(){
		
		try{
			
			ConsoleOperations consoleOperations = new ConsoleOperations();
				
			FileOperations fileOperations = new FileOperations();
			
			AnswerType answerType = new AnswerType();
			
			fileOperations.setData();
		
			List<String> data = fileOperations.getData();
			
			String userAnswers ="";
			
		
			for(int i=0; i < data.size();++i){
				
				Questions question = new Questions();
			
				String str = data.get(i);
			
				String[] fileText = str.split(",");
				
				int index = fileText.length;
				
				if(index != 0){
					
					question.setQuestionString(fileText[0]);
					index--;
				}
				
				if(index != 0){
					
					question.setQuestionType(fileText[1]);
					index--;
				}
				
				if(index != 0){
					
					question.setChoices(fileText[2]);
					index--;
				}
				
				if( question.getQuestionString() != null){
					
					System.out.println("Qu: "+(i+1)+":"+question.getQuestionString());
				}
				
				if (question.getQuestionType() != null){
					
					System.out.println("Qu Type: "+question.getQuestionType());
				}
				
				if(question.getChoices() != null){
					
					System.out.println("Qu Choices: "+question.getChoices());
				}
				
				if(question.getQuestionType().equals("Single Select")){
					
					
					userAnswers += answerType.getSingleSelectAnswer(question.getChoices());
					
				}
				
				if(question.getQuestionType().equals("Multi Select")){
					
					userAnswers +=","+answerType.getMultiSelectAnswer(question.getChoices());
				}
				
				if(question.getQuestionType().equals("Text")){
					
					userAnswers +=","+consoleOperations.getString();
				}
				
			}
			
			fileOperations.storeInFile(userAnswers);
			
			
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
	}
}
