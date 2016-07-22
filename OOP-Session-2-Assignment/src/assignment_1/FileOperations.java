/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


// class for all the file operations required
public class FileOperations {
	
	// objects to writer , read and print in file
	private FileInputStream fileInputStream;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	
	private List<String> data;
	
	public FileOperations(){
		
		try{
			
			// initialized objects
			fileInputStream = new FileInputStream("InputFile.txt");
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			printWriter = new PrintWriter("User-Answers.txt");
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	/**
	 * 
	 * @return List
	 * 
	 * to extract data from file
	 */
	public List<String> extractDataFromFile(){
		
		String strLine;
		
		data = new LinkedList<String> ();
		
		
		try{
			while( (strLine = bufferedReader.readLine()) != null){
				
				data.add(strLine);
				
			}
			
		}catch(Exception ex){
			
			System.out.println("Error Occured: "+ ex.getMessage());
		}
		
		return data;
	}
	
	/**
	 * 
	 * @param userAnswersList
	 * 
	 * to store in file 
	 */
	public void storeInFile(List<String> userAnswersList){
		
		try{
			
			for(int i=0;i < userAnswersList.size();++i){
				
				printWriter.println("Participant "+(i+1)+","+userAnswersList.get(i));
			}
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}finally{
			
			printWriter.close();
		}
		
	}
}
