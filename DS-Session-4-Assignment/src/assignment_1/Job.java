package assignment_1;

<<<<<<< HEAD
// class to define job
class Job
{
	// private variable for priority
    private int priority;
 
    /**
     * parameterized constructor to set priority
     * @param priority
     */
    public Job(int priority) {
    	
        this.priority = priority; 
    }
    
    /**
     * @return priority
     */
    public int getJobPriority() {
    	
    	return this.priority;
    }
    
=======
class Job
{
    int priority;
 
    /** Constructor **/
    public Job(int priority)
    {
        this.priority = priority; 
    }
    
    public int getJobPriority(){
    	
    	return this.priority;
    }
>>>>>>> 99828929f97313a6311c9a7fe05d85439724d9b5
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
<<<<<<< HEAD
    public String toString() {
    	
=======
    public String toString() 
    {
>>>>>>> 99828929f97313a6311c9a7fe05d85439724d9b5
        return "priority : "+ priority;
    }
}
