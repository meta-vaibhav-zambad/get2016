package assignment_1;

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
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() 
    {
        return "priority : "+ priority;
    }
}
