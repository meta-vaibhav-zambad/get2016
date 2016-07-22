/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to sort questions based on question string
*/
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// main class
public class Operations {
	
	BufferedReader bufferedReader;

	public Operations(){
		
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// list to store questions
		List<Question> questions = new ArrayList<Question>();
		
		// objects of question
		Question question1 = new Question("Overall Rating");
		
		Question question2 = new Question("Area of improvement");
		
		Question question3 = new Question("Feedback");
		
		questions.add(question1);
		
		questions.add(question2);
		
		questions.add(question3);
		
		// sort question
		Collections.sort(questions);
		
		// display sorted questions
		System.out.println("Sorted Questions: ");
		
		for(Question temp : questions){
			
			System.out.println(temp.getQuestionString());
			
		}

	}
}