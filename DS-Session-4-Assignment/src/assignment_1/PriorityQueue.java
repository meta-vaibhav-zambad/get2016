package assignment_1;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
// class for priority queue
class PriorityQueue{

	// list of type jobs
	private List<Job> jobList = null;

	// variable to define heapSize
	private int heapSize;

	/**
	 * default constructor 
	 * initialize job list and heap size
	 */
=======
/** Class PriorityQueue **/
class PriorityQueue{

	private List<Job> jobList;

	private int heapSize;

>>>>>>> 99828929f97313a6311c9a7fe05d85439724d9b5
	public PriorityQueue(){

		jobList = new ArrayList<Job>();

		heapSize = 0;

<<<<<<< HEAD
		// add first element as null to start indexing from 1
		jobList.add(null);
	}
	
	/**
	 * This method brings the largest element to root node recursively
	 * 
	 * @param jobList
	 * @param parentIndex
	 */
	public void maxHeapify(List<Job> jobList ,  int parentIndex){

		try{

			// variable for index of largest element
			int largestElementIndex = parentIndex;

			// variable for index of left child 
			int leftChildIndex = 2*parentIndex;

			// variable for index of right child
			int rightChildIndex = 2*parentIndex+1;

			// if left child index is less than heap Size and its priority is greater than its parent 
			// set largest to it
			if(leftChildIndex <= heapSize){

				if(jobList.get(leftChildIndex).getJobPriority() < jobList.get(parentIndex).getJobPriority()){

					largestElementIndex = leftChildIndex;
				}
			}

			// if right child index is less than heap size and its priority is greater than the largest 
			// set largest to it
			if(rightChildIndex <= heapSize){

				if(jobList.get(rightChildIndex).getJobPriority() < jobList.get(largestElementIndex).getJobPriority()){

					largestElementIndex = rightChildIndex;
				}
			}

			if(largestElementIndex == parentIndex){

				return;
			}

			// swap largest with root
			swap(largestElementIndex , parentIndex);
 
			maxHeapify(jobList , largestElementIndex);

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}

	}
	
	/**
	 * This method inserts job to job list
	 * 
	 * @param priority
	 */
	public void insertJob(int priority){

		try{

			Job newJob = new Job(priority);

			jobList.add(newJob);

			heapSize++;

			for(int i = heapSize/2 ; i > 0 ;--i){

				maxHeapify(jobList,i);
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	/**
	 * This method prints job queue with largest priority first
	 */
	public void printJobQueue(){

		try{

			for(int i = jobList.size()-1 ; i > 1;--i){

				swap(1,i);

				heapSize = heapSize	- 1;

				maxHeapify(jobList, 1);
			}

			if(jobList.size() == 1){

				System.out.println("No jobs to execute");
			}

			for (Job job : jobList) {

				if(job!= null){

					System.out.println(job);
				}
			}

			// make list empty after executing all jobs
			makeJobListEmpty();

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}

	/**
	 * This method makes the job list empty
	 */
	private void makeJobListEmpty(){

		try{

			jobList = new ArrayList<Job>();

			jobList.add(null);

			heapSize = 0;

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
	
	/**
	 * This method swaps the element
	 * 
	 * @param index1
	 * @param index2
	 */
	private void swap(int index1 , int index2){

		try{

			Job tempJobObject = jobList.get(index1);

			jobList.set(index1 , jobList.get(index2));

			jobList.set(index2, tempJobObject);
			
		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}
=======
		jobList.add(null);
	}

	public void maxHeapify(List<Job> jobList ,  int parentIndex){

		int largestElementIndex = parentIndex;

		int leftChildIndex = 2*parentIndex;

		int rightChildIndex = 2*parentIndex+1;

		if(leftChildIndex <= heapSize){

			if(jobList.get(leftChildIndex).getJobPriority() < jobList.get(parentIndex).getJobPriority()){

				largestElementIndex = leftChildIndex;
			}
		}

		if(rightChildIndex <= heapSize){

			if(jobList.get(rightChildIndex).getJobPriority() < jobList.get(largestElementIndex).getJobPriority()){

				largestElementIndex = rightChildIndex;
			}
		}

		if(largestElementIndex == parentIndex){

			return;
		}

		swap(largestElementIndex , parentIndex);

		maxHeapify(jobList , largestElementIndex);

	}

	public void insertJob(int priority){

		Job newJob = new Job(priority);

		jobList.add(newJob);

		heapSize++;

		for(int i = heapSize/2 ; i > 0 ;--i){

			maxHeapify(jobList,i);
		}
	}

	public void printJobQueue(){

		for(int i = jobList.size()-1 ; i > 1;--i){

			swap(1,i);

			heapSize = heapSize	- 1;

			maxHeapify(jobList, 1);
		}
		
		if(jobList.size() == 1){
			
			System.out.println("No jobs to execute");
		}

		for (Job job : jobList) {
			
			if(job!= null){

				System.out.println(job);
			}
		}
		
		makeJobListEmpty();
	}
	
	public void makeJobListEmpty(){
		
		jobList = new ArrayList<Job>();
		
		jobList.add(null);
		
		heapSize = 0;
	}

	public void swap(int index1 , int index2){

		Job tempJobObject = jobList.get(index1);

		jobList.set(index1 , jobList.get(index2));

		jobList.set(index2, tempJobObject);
>>>>>>> 99828929f97313a6311c9a7fe05d85439724d9b5
	}
}