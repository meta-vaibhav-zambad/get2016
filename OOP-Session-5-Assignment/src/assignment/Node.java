/**
 * @author vaibhav zambad
 * 
 * Date : 25 July 2016
 * 
 * Aim :  to define , scope and design a solution for a Social Network
 *
 */
package assignment;

import java.util.ArrayList;
import java.util.List;

// Node class to create a node and add entities to nodes
public class Node {

	// list of connections
	private List<Connection> friend;
	
	private Entity entity;

	// constructor of node to set variables	
	public Node(Entity entity) {

		this.entity = entity;
		this.friend = new ArrayList<Connection>();
	}

	/**
	 * @param connection
	 * 
	 * add node to list connection
	 */
	public void addFriend(Connection connection) {

		if (this.friend.contains(connection)) {

			return;
		}

		this.friend.add(connection);
	}

	/**
	 * 
	 * @param other
	 * @return true or false
	 * 
	 * checks if list already contains the node
	 */
	public boolean containsFriend(Connection other) {

		return this.friend.contains(other);

	}

	/**
	 * 
	 * @param index
	 * @return connection object at particular index
	 */
	public Connection getFriends(int index) {

		return this.friend.get(index);
	}

	/**
	 * @param index
	 * @return connection object at particular index
	 * 
	 *  removes connection at particular index
	 */
	public Connection removeConnection(int index) {

		return this.friend.remove(index);
	}

	/**
	 * @param connection
	 * 
	 * remove friend connection using connection object
	 */
	public void removeFriend(Connection connection) {

		this.friend.remove(connection);
	}
	
	/**
	 * 
	 * @return size of friend connections
	 */
	public int getFriendsCount() {

		return this.friend.size();
	}
	
	/**
	 * 
	 * @return entity of either person or organization
	 */
	public Entity getEntity() {

		return this.entity;
	}
	
	/**
	 * returns name of entity
	 */
	public String toString() {

		return entity.getName();
	}
	
	/** 
	 * @return hashcode of entity
	 */
	public int hashcode() {

		return this.entity.hashCode();
	}
	
	/**
	 * compares one object with other
	 */
	public boolean equals(Object other) {

		if (!(other instanceof Node)) {

			return false;
		}

		Node node = (Node) other;

		return this.entity.equals(node);
	}
	
	/**
	 * @return array list of friends
	 */
	public ArrayList<Connection> getFriends() {
		return new ArrayList<Connection>(this.friend);
	}
}