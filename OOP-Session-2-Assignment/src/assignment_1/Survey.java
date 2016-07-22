/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

import java.util.LinkedList;
import java.util.List;

// Main Class 
public class Survey {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// object of user class
		Users user = new Users();
		
		// set number of users
		user.setNumberOfUsers();
		
		// object of ConsoleOperations class 
		ConsoleOperations consoleOperations = new ConsoleOperations();
		
		// object of FileOperations class
		FileOperations fileOperations = new FileOperations();
		
		// object of AnswerType class
		AnswerType answerType = new AnswerType();
		
		// object of percentage distribution class
		PercentageDistribution percentageDistribution = new PercentageDistribution();
		
		// list to store all data from file (here questions)
		List<String> data = fileOperations.extractDataFromFile();
		
		// list to store user answers
		List<String> userAnswersList = new LinkedList<String>();
		
		// list to store single select user answers for percentage distribution
		List<String> singleSelectUserAnswersList = new LinkedList<String>();
		
		// to store count of single select questions
		int singleSelectQuestionChoicesCount = 0;
		
		// display questions to user and get the answers from users
		for(int i=0;i < user.getNumberOfUsers() ;++i){
			
			System.out.println("Welcome User "+(i+1)+" Please enter your inputs");
			
			String userAnswers ="";
			
			for(int j=0;j < data.size() ; ++j){
				
				Question question = new Question();
				
				String str = data.get(j);
			
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
					
					System.out.println("Qu: "+(j+1)+":"+question.getQuestionString());
				}
				
				if (question.getQuestionType() != null){
					
					System.out.println("Qu Type: "+question.getQuestionType());
				}
				
				if(question.getChoices() != null){
					
					System.out.println("Qu Choices: "+question.getChoices());
				}
				
				if(question.getQuestionType().equals("Single Select")){
					
					userAnswers += answerType.getSingleSelectAnswer(question.getChoices());
					
					singleSelectQuestionChoicesCount = question.getChoices().split("/").length;
					
					singleSelectUserAnswersList.add(userAnswers);
					
					
				}
				
				if(question.getQuestionType().equals("Multi Select")){
					
					userAnswers +=","+answerType.getMultiSelectAnswer(question.getChoices());
				}
				
				if(question.getQuestionType().equals("Text")){
					
					userAnswers +=","+consoleOperations.getString();
				}
				
				if(j == data.size() -1 ){
					
					userAnswersList.add(userAnswers);
				}
				
			}
			
		}
		// store user answers in file
		fileOperations.storeInFile(userAnswersList);
		
		// to store percentage distribution
		List<String> percentageDistributionList = percentageDistribution.calculatePercentageDistribution(user.getNumberOfUsers(), singleSelectUserAnswersList,
				singleSelectQuestionChoicesCount);
		
		// print percentage distribution
		for(int i=0;i<percentageDistributionList.size();++i){
			
			System.out.println((i+1)+" - "+percentageDistributionList.get(i));
		}
	}
}