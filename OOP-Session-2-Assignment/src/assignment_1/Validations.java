/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

// validation class to apply validations on user ansers
public class Validations {
	
	/**
	 * 
	 * @param userInput
	 * @param choices
	 * @return boolean result
	 * 
	 * checks whether the user answer matches the given choices for single select
	 */
	public boolean validateUserInputForSingleSelect(String userInput,String choices){
		
		boolean result = false;
		
		try{
		
			String[] choiceArray = choices.split("/");
		
			for(int i=0; i < choiceArray.length;++i){
			
				if(userInput.trim().equals(choiceArray[i].trim())){
					
					result = true;
					break;
				}
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param userInput
	 * @param choices
	 * @return boolean result
	 * 
	 * checks whether the user answer matches the given choices for multi select
	 */
	public boolean validateUserInputForMultiSelect(String userInput , String choices){
		
		boolean result = true;
		
		int flag = 0;
		
		try{
			
			String[] userInputArray = userInput.split("/");
			
			String[] choiceArray = choices.split("/");
			
			if( choiceArray.length < userInputArray.length){
				
				result = false;
			}
			
			else{
				
				for(int i=0;i < userInputArray.length ;++i){
					
					for(int j=0; j < choiceArray.length ;++j){
						
						if( userInputArray[i].trim().equals(choiceArray[j].trim())){
							
							flag = 0;
							break;
						}
						else{
							
							flag = 1;
						}
					}
					
					if(flag == 1){
						
						result = false;
						break;
					}
				}
				
				
				
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return result;
	}
}
