/**
 * 
 */
package assignment_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * @author vaibhav
 *
 */
public class FileOperations {
	
	private FileInputStream fileInputStream;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	
	private List<String> data;
	
	public FileOperations(){
		
		try{
			
			fileInputStream = new FileInputStream("InputFile.txt");
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			printWriter = new PrintWriter("User-Answers.txt");
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	public void setData(){
		
		String strLine;
		
		data = new LinkedList<String> ();
		
		
		try{
			while( (strLine = bufferedReader.readLine()) != null){
				
				data.add(strLine);
				
			}
			
		}catch(Exception ex){
			
			System.out.println("Error Occured: "+ ex.getMessage());
		}
	}
	
	public List<String> getData(){
		
		return data;
	}
	
	public void createNewFile(String fileName){
		
		try{
			File file = new File(fileName);
		
			file.createNewFile();
			
			System.out.println("file created");
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	public void storeInFile(String userAnswers){
		
		try{
			
			printWriter.println(userAnswers);
			
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}finally{
			
			printWriter.close();
		}
		
	}
	
	
}
