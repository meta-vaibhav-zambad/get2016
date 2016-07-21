/**
 * 
 */
package assignment_1;

/**
 * @author vaibhav
 *
 */
public class Validations {
	
	public boolean validateUserInputForSingleSelect(String userInput,String choices){
		
		boolean result = false;
		
		try{
		
			String[] choiceArray = choices.split("/");
		
			for(int i=0; i < choiceArray.length;++i){
			
				if(userInput.equals(choiceArray[i])){
					
					result = true;
					break;
				}
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return result;
	}
	
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
