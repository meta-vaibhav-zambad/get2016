/**
 * @author vaibhav zambad
 * 
 * Date : 29 July 2016
 * 
 * Aim : To perform infix to postFix operation using stack
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// class operations to perform the various operations on stack
public class Operations {

	// buffered reader global object for input
	BufferedReader bufferedReader;

	/**
	 * Empty Constructor
	 */
	public Operations(){

		// initialized buffered reader object
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	// entry point for the program
	public static void main(String[] args) {

		// object of operations class
		Operations operations = new Operations();

		// variable for user input
		String userInput = "";
		
		// exception handling
		try{

			do{
				
				// taking user input for infix notation
				userInput = operations.getUserInput("Please enter infix notation: ");

				// printing the resultant PostFix notation
				System.out.println("Postfix notation is: "+operations.infixToPostFix(userInput));
				
				// taking user input to continue or not
				userInput = operations.getUserInput("press Y or y to continue else press any other key to exit");

			}while(userInput.equals("y") || userInput.equals("Y")); // checking condition to continue or not

			// program ends
			System.out.println("Program Ends");
			
		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

		}finally{

			try{
				
				// closing the input stream
				operations.bufferedReader.close();

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
				
			}
		}

	}
	
	/**
	 * this method converts the infix string into PostFix String and return it
	 * 
	 * it uses the following algorithm to do it:
	 * 1. if opening brace found then add into stack
	 * 2. if closing brace found then pop from stack until opening brace is not found 
	 * 	  and add it into PostFix String 
	 * 3. if digit or alphabet is found then add it into PostFix String
	 * 4. if operator found then :
	 * 		check if operator is already present :
	 * 			if yes then check precedence 
	 * 				if the precedence of current character is greater than stack character then push it into stack
	 * 				else add both to PostFix String
	 * 			else add operator into stack
	 * 5. repeat until stack is not empty
	 *  
	 * @param infixString
	 * @return PostFix String
	 */
	public String infixToPostFix(String infixString){

		// variable for PostFix string
		String postfixString = "";

		// a temporary stack to perform operations
		Stack<Character> tempStack = new Stack<Character>();

		// running a loop for getting each character from infix string
		for(int i = 0 ; i < infixString.length() ; ++i){

			// a variable for current character in infix string
			char currentChar = infixString.charAt(i);

			// if currentChar is an alphabet (lower case or upper case both ) or a digit
			// add it into PostFix string
			if( (currentChar >= 65 && currentChar <= 90) ||
					currentChar >= 97 && currentChar <= 122 || currentChar >= 48 && currentChar <= 56 ){

				postfixString += currentChar;
			}
			
			// if currentChar is opening brace
			else if(currentChar == 40){

				tempStack.push(currentChar);

			}
			
			// if currentChar is closing brace
			else if(currentChar == 41){

				while(tempStack.getTop() != 40){

					postfixString += tempStack.pop();
				}
				
				// to remove opening brace
				tempStack.pop();

			}
			
			// if currentChar is operator
			else if(currentChar == 37 || currentChar == 42 || currentChar == 43 || currentChar == 45 
					|| currentChar == 47 || currentChar == 94){

				// a flag to check is there is any operator already present in stack
				boolean operatorFlag = false;

				if(tempStack.isEmpty()){

					tempStack.push(currentChar);
				}

				else{

					for(int j = tempStack.getSize() - 1 ;j >=0 ;--j){

						char stackChar = tempStack.get(j);

						if(stackChar == 37 || stackChar == 42 || stackChar == 43
								|| stackChar == 45 || stackChar == 47 || stackChar == 94){

							operatorFlag = true;

							break;
						}
						
						// if currentChar is opening brace then break
						else if(stackChar == 40){

							break;
						}
					}
					
					// if operator is already present in stack
					if(operatorFlag){
						
						// if precedence of current operator is greater than stack operator
						if(precedence(currentChar) > precedence(tempStack.getTop())){

							tempStack.push(currentChar);
						}
						
						// else add both to postFix string
						else{

							postfixString += currentChar ;
							postfixString += tempStack.pop();

						}
					}
					
					// else push operator to stack
					else{

						tempStack.push(currentChar);
					}
				}
			}
		}

		// while stack is not empty pop each element and add it to postFix string
		while(! tempStack.isEmpty()){

			postfixString += tempStack.pop();
		}

		return postfixString;
	}

	/**
	 * this method takes input as a character which is an operator 
	 * and returns the precedence value of it .
	 * Greater the value , greater the precedence
	 * 
	 * @param operator
	 * @return precedence of operator (integer)
	 */
	public int precedence(char operator){

		switch(operator){

		case '+': case '-':

			return 0;

		case '*':case '/':case '%':

			return 1;

		case '^':

			return 2;

		default:

			throw new IllegalArgumentException("Operator is unknown: "+operator);
		}
	}

	/**
	 * this method takes user input and returns it
	 * 
	 * @param message
	 * @return userInput
	 */
	public String getUserInput(String message){
		
		// variable for user input
		String userInput = "";

		try{
			
			System.out.println(message);
			
			// taking user input
			userInput = bufferedReader.readLine();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserInput(message);

		}

		return userInput;
	}
}