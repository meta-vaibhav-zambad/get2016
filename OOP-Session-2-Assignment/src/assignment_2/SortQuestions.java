/**
 * 
 */
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author vaibhav
 *
 */
public class SortQuestions {
	
	BufferedReader bufferedReader;

	public SortQuestions(){
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> questionsList = new ArrayList<String>();
		
		SortQuestions sortQuestions = new SortQuestions();
		
		int numberOfQuestions = sortQuestions.getPositiveInteger("Please enter number of questions");
		
		for(int i=0;i < numberOfQuestions ;++i){
			
			questionsList.add(sortQuestions.getString("Please enter "+(i+1)+ " question: "));
		}
		
		Collections.sort(questionsList);
		
		Iterator iterator = questionsList.iterator();
		
		while(iterator.hasNext()){
			
			Questions question = (Questions) iterator.next();
			
			System.out.println(question.questionString);
		}

	}
	
	public String getString(String message){
		
		String inputString="";
		
		try{
			
			System.out.println(message);
			
			inputString = bufferedReader.readLine();
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}
		
		return inputString;
		
	}
	
	public int getPositiveInteger(String message){
		
		int inputNumber = 0;
		
		try{
			
			System.out.println(message);
			
			inputNumber = Integer.parseInt(bufferedReader.readLine());
			
			if(inputNumber <= 0){
				
				inputNumber = getPositiveInteger(message);
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong"+ ex.getMessage());
			
			inputNumber = getPositiveInteger(message);
		}
		
		return inputNumber;
		
	}

}
