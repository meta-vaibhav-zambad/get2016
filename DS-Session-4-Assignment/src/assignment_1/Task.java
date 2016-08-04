package assignment_1;

class Task
{
    String job;
    int priority;
 
    /** Constructor **/
    public Task(String job, int priority)
    {
        this.job = job;
        this.priority = priority; 
    }
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() 
    {
        return "Job Name : "+ job +"\nPriority : "+ priority;
    }
}
