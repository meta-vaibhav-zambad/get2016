package assignment_1;

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
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
    	
        return "priority : "+ priority;
    }
}
