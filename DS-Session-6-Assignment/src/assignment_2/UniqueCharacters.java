/**
 * @author vaibhav zambad
 * 
 * Date : 04 August 2016
 * 
 * Aim :  Write a program that takes a string and returns the number of unique characters in the string
*/
package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// class to define unique characters
public class UniqueCharacters {

	// buffered reader object for input stream
	private BufferedReader bufferedReader = null;

	/**
	 * constructor to initialize buffered reader object
	 */
	public UniqueCharacters(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	// entry method for program
	public static void main(String[] args){

		boolean flagNotToEndProgram = true;

		while(flagNotToEndProgram){

			// object of main class
			UniqueCharacters uniqueCharacters = new UniqueCharacters();

			try{

				// variable for user permission
				char userPermission = '\0';

				// cache map to store the string and the count of unique characters in string
				Map<String,Integer> cacheMap = new HashMap<String,Integer>();

				// variable to count unique characters
				int countOfUniqueCharacters = 0;

				do{

					// getting user string from user
					String userString = uniqueCharacters.getUserStringInput("Please enter a string");

					// if map already contains the string print its value
					if(cacheMap.containsKey(userString)){

						System.out.println("The count of unique characters in string is : "+cacheMap.get(userString));
					}

					// else compute the count
					else{

						countOfUniqueCharacters = uniqueCharacters.getCountOfUniqueCharacters(userString);

						// put it in the map
						cacheMap.put(userString, countOfUniqueCharacters);

						System.out.println("The count of unique charcters is string is : "
								+countOfUniqueCharacters);
					}

					// take user permission to continue or not
					userPermission = uniqueCharacters.getUserStringInput("Press Y or y to continue").charAt(0);

				}while(userPermission == 'y' || userPermission == 'Y');

				flagNotToEndProgram = false;

				System.out.println("Program Ended");

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());

			}finally{

				try{

					// close the input stream
					uniqueCharacters.bufferedReader.close();

				}catch(Exception ex){

					System.out.println("Something went wrong: "+ex.getMessage());
				}
			}
		}
	}

	/**
	 * This method uses a list ,set count to 0 for every characters
	 * if user string contains the character , increment the count at its position 
	 * increment the countOfUniqueCharacters if count of a character is 1
	 * 
	 * @param userString
	 * @return count of unique characters
	 */
	public int getCountOfUniqueCharacters(String userString){

		// list of count of characters
		List<Integer> countOfCharactersList = new ArrayList<Integer>();

		// variable for count of unique characters
		int countOfUniqueCharacters = 0;

		// variable to set count of each character
		int countOfCharacter = 0;

		// loop to set values to zero
		for(int loopVariable = 0 ; loopVariable <= 127 ; ++loopVariable){

			countOfCharactersList.add(loopVariable, 0);
		}

		// increment the count of character at its index
		for(int loopVariable = 0 ; loopVariable < userString.length() ; ++loopVariable){

			countOfCharacter = countOfCharactersList.get((int)userString.charAt(loopVariable));

			countOfCharactersList.set((int)userString.charAt(loopVariable), ++countOfCharacter);
		}

		// for each count if count is 1 then increment the countOfUniqueCharacters
		for (int count : countOfCharactersList) {

			if(count == 1){

				countOfUniqueCharacters++;
			}
		}

		return countOfUniqueCharacters;
	}

	/**
	 * 
	 * @param message
	 * @return user input (string)
	 */
	public String getUserStringInput(String message){			
		// variable for user input
		String userInput = "";

		while(true){
			
			try{

				System.out.println(message);

				// taking user input
				userInput = bufferedReader.readLine();
				
				while(userInput.length() == 0){
					
					System.out.println(message);

					// taking user input
					userInput = bufferedReader.readLine();
					
				}
				
				return userInput;

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
				getUserStringInput(message);

			}
		}
	}
}