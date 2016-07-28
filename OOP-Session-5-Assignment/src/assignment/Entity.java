/**
 * @author vaibhav zambad
 * 
 * Date : 25 July 2016
 * 
 * Aim :  to define , scope and design a solution for a Social Network
 *
 */
package assignment;

// abstract class to define entity -- Person and Organization
public abstract class Entity{
	
	public abstract String getName();

	public abstract void setName(String Name);

	public abstract String getContactNumber();

	public abstract void setContactNumber(String ContactNumber);

	public abstract String getEmailID();

	public abstract void setEmailID(String EmailID);
	
	
}
