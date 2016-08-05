package assignment_2;

import java.util.LinkedList;

public class Queue<E> {
	
	LinkedList<E> linkedList = null;
	
	public Queue(){
		
		linkedList = new LinkedList<E>();
	}
	
	public boolean enqueue(E e){
		
		linkedList.addLast(e);
		
		return true;
	}

	public E Dequeue(){
		
		return linkedList.pollFirst();
		
	}
	
	public E peek(){
		
		return linkedList.peek();
	}
	
	public boolean isEmpty(){
		
		return linkedList.isEmpty();
		
	}
	
	public boolean clear(){
		
		linkedList.clear();
		
		return true;
	}
	
	public boolean contains(E e){
		
		return linkedList.contains(e);
	}
	
	public void print(){
		
		for (E e : linkedList) {
			
			System.out.println(e);
		}
	}
	
	public int getSize(){
		
		return linkedList.size();
	}
}