package assignment_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import assignment_1.ArrayList;

public class CollegeCounselling {

	BufferedReader bufferedReader;

	public CollegeCounselling(){

		bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	}

	public static void main(String[] args) {

		System.out.println("Welcome to college counselling process");

		CollegeCounselling collegeCounselling = new CollegeCounselling();

		ArrayList<Integer> collegeSeats = collegeCounselling.createListOfColleges();

		Queue<Integer> candidates = collegeCounselling.createQueueOfCandidates();

		Map<Integer,Integer> assignedColleges = new HashMap<Integer,Integer>();

		assignedColleges = collegeCounselling.collegeCounsellingProcess(collegeSeats , candidates , assignedColleges);

		for(Map.Entry<Integer, Integer> entry : assignedColleges.entrySet()){

			System.out.println("candidate rank: "+entry.getKey()+" assigned college: "+entry.getValue());
		}
	}

	public Map<Integer,Integer> collegeCounsellingProcess(ArrayList<Integer> colleges , Queue<Integer> candidates ){

		try{

			int userInput = 0;

			int candidate = 0;
			
			String candidateName = "";

			while(candidates.getSize() != 0){

				candidateName = candidates.getFront().;

				userInput = getUserInput("Candidate: "+candidate + " Please enter the college you want to select");

				int seats = colleges.getElement(userInput - 1);

				if(seats > 0){

					candidate = candidates.dequeue();

					assignedColleges.put(candidate, (userInput - 1)+1);

					--seats;

					collegeSeats.overwriteElement(userInput - 1, seats);
				}

				else{

					System.out.println("The college you entered is already full. Please select another college");

					collegeCounsellingProcess(collegeSeats, candidates, assignedColleges);
				}
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
			
			collegeCounsellingProcess(collegeSeats, candidates, assignedColleges);
			
		}

		return assignedColleges;
	}


	public ArrayList<College> createListOfColleges(){
		
		College college1 = new College("Amity University", 1,1);
		College college2 = new College("LNMIIT", 2,2);
		College college3 = new College("JECRC",3,3);
		College college4 = new College("SKIT",4,4);
		College college5 = new College("Poornima University", 5,5);
		College college6 = new College("Jaipur University", 6,6);
		
		ArrayList<College> collegeLists = new ArrayList<College>();
		
		collegeLists.add(college1);
		collegeLists.add(college2);
		collegeLists.add(college3);
		collegeLists.add(college4);
		collegeLists.add(college5);
		collegeLists.add(college6);
		
		return collegeLists;
	}

	public Queue<Candidate> createQueueOfCandidates(){

		Queue<Candidate> candidates = new Queue<Candidate>();

		Candidate candidate1 = new Candidate("Vaibhav1", 1);
		Candidate candidate2 = new Candidate("Vaibhav2", 2);
		Candidate candidate3 = new Candidate("Vaibhav3", 3);
		Candidate candidate4 = new Candidate("Vaibhav4", 4);
		Candidate candidate5 = new Candidate("Vaibhav5", 5);
		Candidate candidate6 = new Candidate("Vaibhav6", 6);
		Candidate candidate7 = new Candidate("Vaibhav7", 7);
		Candidate candidate8 = new Candidate("Vaibhav8", 8);
		
		candidates.enqueue(candidate1);
		candidates.enqueue(candidate2);
		candidates.enqueue(candidate3);
		candidates.enqueue(candidate4);
		candidates.enqueue(candidate5);
		candidates.enqueue(candidate6);
		candidates.enqueue(candidate7);
		candidates.enqueue(candidate8);
		
		return candidates;
		
	}

	public int getUserInput(String message){

		int userInput = 0;

		try{

			System.out.println(message);

			userInput = Integer.parseInt(bufferedReader.readLine());

			while(userInput <= 0){

				getUserInput(message);
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());

			getUserInput(message);

		}
		return userInput;
	}
}