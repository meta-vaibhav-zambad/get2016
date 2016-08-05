package assignment_1;

import java.util.ArrayList;
import java.util.List;

/** Class PriorityQueue **/
class PriorityQueue{

	private List<Job> jobList;

	private int heapSize;

	public PriorityQueue(){

		jobList = new ArrayList<Job>();

		heapSize = 0;

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
	}
}