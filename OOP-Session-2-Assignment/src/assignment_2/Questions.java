/**
 * 
 */
package assignment_2;

/**
 * @author vaibhav
 *
 */
public class Questions implements Comparable{
	
	String questionString;
	
	public Questions(String questionString){
		
		this.questionString = questionString;
	}
	
	public int compareTo(Object obj){
		
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
		
		Questions question = (Questions)obj;
	
        int last = question.questionString.compareTo(questionString);
        
        return last == 0 ? question.questionString.compareTo(questionString) : last;
        
    }
	
	/*public static Comparator<Questions> QuestionTextComparator  = new Comparator<Questions>() {
		
		
		public int compare(Questions question1, Questions question2) {
			
			String questionText1 = question1.getQuestionString().toUpperCase();
			
			String questionText2 = question2.getQuestionString().toUpperCase();

			//ascending order
			return questionText1.compareTo(questionText2);
		}
	};*/
}