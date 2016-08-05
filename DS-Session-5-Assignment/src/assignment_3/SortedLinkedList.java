package assignment_3;

import java.util.LinkedList;

public class SortedLinkedList<E> implements Comparable {
	
	LinkedList<E> sortedLinkedList = null;

	public SortedLinkedList(){
		
		sortedLinkedList = new LinkedList<E>();
	}
	
	public boolean insert(E e){
	
		if(sortedLinkedList.size() == 0){
			
			sortedLinkedList.add(e);
		}
		
		else{
			
			if(e.toString().compareTo(sortedLinkedList.get(sortedLinkedList.size()-1).toString()) > 1 ){
				
				sortedLinkedList.addLast(e);
				
			}
			else{
				
				sortedLinkedList.addFirst(e);
			}
		}
		
		return true;
	}
	
	public void print(){
		
		
	}

	@Override
	public int compareTo(Object other) {
		
		int last = this.compareTo(other);
		
		return last;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(E e){
		
		return e.toString();
	}
}