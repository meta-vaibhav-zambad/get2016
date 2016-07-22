/**
 * 
 * @author vaibhav Zambad
 * 
 * Date : 21 July 2016
 * 
 * Aim : to design console based survey system
*/
package assignment_1;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

// class to calculate percentage distribution
public class PercentageDistribution {
	
	/**
	 * 
	 * @param noOfUsers
	 * @param singleSelectUserAnswersList
	 * @param singleSelectQuestionChoicesCount
	 * @return List
	 * 
	 * this method returns percentage distribution of all the single select choices
	 */
	public List<String> calculatePercentageDistribution(int noOfUsers , List<String> singleSelectUserAnswersList,
			int singleSelectQuestionChoicesCount){
		
		List<String> percentageDistributionList = new LinkedList<String>();
		
		int[] count = new int[singleSelectQuestionChoicesCount];
		
		try{
		
			for(int i=0;i<singleSelectUserAnswersList.size();++i){
			
				if(singleSelectUserAnswersList.get(i).trim().equals("1")){
				
					count[0]++;
				}
			
				else if(singleSelectUserAnswersList.get(i).trim().equals("2")){
				
					count[1]++;
				}
				else if(singleSelectUserAnswersList.get(i).trim().equals("3")){
	
					count[2]++;
				}
			
				else if(singleSelectUserAnswersList.get(i).trim().equals("4")){
				
					count[3]++;
				}

				else if(singleSelectUserAnswersList.get(i).trim().equals("5")){
	
					count[4]++;
				}	
			}
		
			for(int i=0;i<singleSelectQuestionChoicesCount;++i){
			
				double value = ((double)count[i] / (double)noOfUsers) * 100 ;
			
				percentageDistributionList.add(new DecimalFormat("##.##").format(value)+"%");
			}	
		
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
		
		return percentageDistributionList;
	}
}