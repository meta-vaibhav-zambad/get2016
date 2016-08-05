package assignment_1;

import java.util.LinkedList;
import java.util.List;

public class Concordance {

	public static void main(String[] args) {

		Concordance concordance = new Concordance();

		concordance.createConcordance("Hello World Welcome");

	}

	public void createConcordance(String userString){

		@SuppressWarnings("unchecked")
		List<Integer>[] concordanceList = new LinkedList[128];

		boolean flag = false;

		for(int loopVariable = 0 ; loopVariable <= 127 ; ++loopVariable){

			concordanceList[loopVariable] = new LinkedList<Integer>();
		}

		for(int loopVariable = 0 ; loopVariable < userString.length() ; ++loopVariable){

			if(userString.charAt(loopVariable) != 32){

				if(flag == true){
					
					concordanceList[userString.charAt(loopVariable)].add(loopVariable-1);
				}

				else{
					
					concordanceList[userString.charAt(loopVariable)].add(loopVariable);
				}
			}

			else{

				flag = true;
			}
		}

		int charIndex = 0;

		for (List<Integer> list : concordanceList) {

			if(! list.isEmpty()){

				System.out.print((char)charIndex+":");

				System.out.println(list);
			}

			charIndex++;
		}
	}
}
