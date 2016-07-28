package assignment_4;


public class DoublyLinkedList<E> {

	Node<E> startNode;

	int size = 0;

	public DoublyLinkedList(){


	}

	public boolean add(int location, E item){

		Node<E> newNode = new Node<E>(item) ; 

		int tempPosition = 0;


		if(startNode == null){

			startNode = newNode;

			newNode.nextNode = null;
			
			newNode.prevNode = startNode;
		}

		else if(location > size){

			throw new IllegalArgumentException("Location is greater than size : "+
					"location: "+location+","+"Size: "+size);
		}
		else{
			
			location = location - 1;

			Node<E> tempNode = startNode;
			
			tempNode.nextNode = startNode;
			
			tempNode.prevNode = startNode;

			while(tempPosition != location){

				tempNode = tempNode.nextNode;

				tempPosition++;
			}
			
			newNode.prevNode = tempNode;
			
			newNode.nextNode = tempNode.nextNode;
			
			newNode.nextNode.prevNode = newNode;
			
			tempNode.nextNode = newNode;

		}
		
		size++;

		return true;	
	}

	public boolean remove(E value){

		if(startNode == null){

			System.out.println("Nothing to remove");
		}

		else{

			Node<E> tempPrevNode = startNode;

			Node<E> tempNextNode = startNode.nextNode;

			while(tempNextNode.nodeValue != value){

				tempPrevNode = tempPrevNode.nextNode;

				tempNextNode = tempNextNode.nextNode;
			}

			tempPrevNode = tempNextNode.nextNode;

			tempNextNode = null;
		}

		return true;

	}

	public boolean remove(int index){

		if(startNode == null){

			System.out.println("Nothing to remove");
		}

		else{
			
			int position = 0;

			Node<E> tempPrevNode = startNode;

			Node<E> tempNextNode = startNode.nextNode;

			while(position != index){

				tempPrevNode = tempPrevNode.nextNode;

				tempNextNode = tempNextNode.nextNode;
				
				position++;
			}

			tempPrevNode = tempNextNode.nextNode;

			tempNextNode = null;
		}
		
		return true;

	}
	
	public E get(int index){

		if(startNode == null){
			
			throw new IllegalArgumentException("List is empty");
		}
		
		Node<E> tempNode = startNode;
		
		int position = 0;
		
		while(position != index){
			
			tempNode = tempNode.nextNode;
			
			position++;
		}
		
		return tempNode.nodeValue;
	}
}
