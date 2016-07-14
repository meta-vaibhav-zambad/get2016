/**
 * 
 */
package pF_Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author admin
 *
 */
public class PF_Assignment4 {
	
	private BufferedReader br ; 
	
	private static PrintStream ps ;			
			
	private static int jobCount; 
			
	private static int[] jobArrivalTime;
	
	private static int[] jobSize;
	
	public PF_Assignment4(){
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		ps = new PrintStream(System.out);
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PF_Assignment4 fcfsSchedule = new PF_Assignment4();
		fcfsSchedule.readInput();
		
		int[][] output ;
		
		ps.println("Wait Time for Jobs are: ");
		
		output = fcfsSchedule.FCFS(jobArrivalTime, jobSize);
		
		for(int i=0;i<jobCount;++i){
			ps.println("Wait Time for job "+(i+1)+" : "+output[i][0]);
		}

	}
	
	public void readInput(){
		readJobCount();
		readArrivalTimeArray();
		readJobSizeArray();
	}
	
	public int[][] FCFS(int[] arrivalTime, int[] jobSize){
		
		int[][] tempArray = new int[arrivalTime.length][1];
		
		int jobWaitTime=0,jobStartAt,jobFinishedAt=0;
		
		for(int i=0;i<arrivalTime.length;++i){
			
			if(i==0){
				jobWaitTime = 0;
				jobStartAt  = arrivalTime[0];
			}
			else{
				jobWaitTime = jobFinishedAt - arrivalTime[i] + 1;
				if(jobWaitTime <= 0){
					jobWaitTime = 0;
					jobStartAt = arrivalTime[i];
				}
				else{
					jobStartAt = jobFinishedAt + 1;
				}
			}
			jobFinishedAt = jobStartAt+jobSize[i]-1;
			tempArray[i][0] = jobWaitTime;
		}
		/*for(int i=0;i<arrivalTime.length;++i){
			ps.println(tempArray[i][0]);
		}*/
		
		return tempArray;
	}
	
	private int getInputFromKeyboard(){
		while(true){
			try{
				return Integer.parseInt(br.readLine());
			}catch(Exception ex){
				ps.println("Please enter the correct number");
				try{
					br.readLine();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	private void readJobCount(){
		
		ps.println("Please enter the number of job count which must be greater than zero");
		jobCount = getInputFromKeyboard();
		while(jobCount<=0){
			ps.println("Please enter the number of job count which must be greater than zero");
			jobCount = getInputFromKeyboard();
		}
	}
	
	private void readArrivalTimeArray(){
		jobArrivalTime = new int[jobCount];
		for(int i=0;i<jobCount;++i){
			ps.println("Please enter the "+(i+1)+"th job arrival time");
			jobArrivalTime[i] = getInputFromKeyboard();
		}
	}
	
	private void readJobSizeArray(){
		jobSize = new int[jobCount];
		for(int i=0;i<jobCount;++i){
			ps.println("Please enter the "+(i+1)+"th job size");
			jobSize[i] = getInputFromKeyboard();
		}
	}

}
