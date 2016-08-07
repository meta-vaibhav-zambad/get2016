package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

	private BufferedReader bufferedReader = null;

	public UniqueCharacters(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args){

		UniqueCharacters uniqueCharacters = new UniqueCharacters();

		try{

			char userPermission = '\0';

			Map<String,Integer> cacheMap = new HashMap<String,Integer>();
			
			int countOfUniqueCharacters = 0;

			do{

				String userString = uniqueCharacters.getUserStringInput("Please enter a string");

				if(cacheMap.containsKey(userString)){

					System.out.println("The count of unique charcters is string is : "+cacheMap.get(userString));
				}

				else{
					
					countOfUniqueCharacters = uniqueCharacters.getCountOfUniqueCharacters(userString);
					
					cacheMap.put(userString, countOfUniqueCharacters);

					System.out.println("The count of unique charcters is string is : "
							+countOfUniqueCharacters);
				}

				userPermission = uniqueCharacters.getUserStringInput("Press Y or y to continue").charAt(0);

			}while(userPermission == 'y' || userPermission == 'Y');
			
			System.out.println("Program Ended");

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

		}finally{

			try{

				uniqueCharacters.bufferedReader.close();

			}catch(Exception ex){

				System.out.println("Something went wrong: "+ex.getMessage());
			}
		}
	}


	public int getCountOfUniqueCharacters(String userString){

		List<Integer> countOfCharactersList = new ArrayList<Integer>();

		int countOfUniqueCharacters = 0;

		int countOfCharacter = 0;

		for(int loopVariable = 0 ; loopVariable <= 127 ; ++loopVariable){

			countOfCharactersList.add(loopVariable, 0);
		}

		for(int loopVariable = 0 ; loopVariable < userString.length() ; ++loopVariable){

			countOfCharacter = countOfCharactersList.get((int)userString.charAt(loopVariable));

			countOfCharactersList.set((int)userString.charAt(loopVariable), ++countOfCharacter);
		}

		for (int count : countOfCharactersList) {

			if(count == 1){

				countOfUniqueCharacters++;
			}
		}

		return countOfUniqueCharacters;
	}

	public String getUserStringInput(String message){			
		// variable for user input
		String userInput = "";

		try{

			System.out.println(message);

			// taking user input
			userInput = bufferedReader.readLine();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
			getUserStringInput(message);

		}

		return userInput;
	}
}