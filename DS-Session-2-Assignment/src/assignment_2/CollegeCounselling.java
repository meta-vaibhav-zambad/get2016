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

		Map<Integer,Integer> assignedColleges = collegeCounselling.collegeCounsellingProcess();

		for(Map.Entry<Integer, Integer> entry : assignedColleges.entrySet()){

			System.out.println("candidate rank: "+entry.getKey()+" assigned college: "+entry.getValue());
		}
	}

	public Map<Integer,Integer> collegeCounsellingProcess(){

		CollegeCounselling collegeCounselling = new CollegeCounselling();

		ArrayList<Integer> collegeSeats = collegeCounselling.createListOfColleges();

		Queue<Integer> candidates = collegeCounselling.createQueueOfCandidates();

		Map<Integer,Integer> assignedColleges = new HashMap<Integer,Integer>();

		int collegeSeatsIndex = 0;

		while(collegeSeatsIndex < collegeSeats.size() && candidates.size() != 0){

			int seats = collegeSeats.getElement(collegeSeatsIndex);

			if(seats > 0){

				int candidate = candidates.dequeue();

				assignedColleges.put(candidate, (collegeSeatsIndex+1));

				--seats;

				collegeSeats.overwriteElement(collegeSeatsIndex, seats);

				collegeSeatsIndex = 0;
			}

			else{

				++collegeSeatsIndex;
			}
		}


		return assignedColleges;
	}
	
	public ArrayList<Integer> createListOfColleges(){

		int numberOfColleges = getUserInput("Please enter valid number of colleges taking part in counselling");

		ArrayList<Integer> collegeSeats = new ArrayList<Integer>();

		for(int i = 0 ;i < numberOfColleges ;++i){

			int numberOfSeats = getUserInput("Please enter number of seats in rank "+(i+1)+" college");

			collegeSeats.add(i, numberOfSeats);
		}

		return collegeSeats;
	}

	public Queue<Integer> createQueueOfCandidates(){

		int numberOfCandidates = getUserInput("Please enter valid number of candidates taking part in conselling");

		Queue<Integer> candidates = new Queue<Integer>();

		for(int i = 0 ;i < numberOfCandidates ;++i){

			candidates.enqueue(i+1);
		}

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