package assignment_4;

public class List {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> doublyLinkedList =  new DoublyLinkedList<String>();
		
		doublyLinkedList.add(0, "vaibhav1");
		doublyLinkedList.add(1, "vaibhav2");
		doublyLinkedList.add(2, "vaibhav3");
		
		doublyLinkedList.add(3, "vaibhav4");
		
		//System.out.println(doublyLinkedList.size());
		
		doublyLinkedList.reverse();
		
		doublyLinkedList.print();
		
		
		
		//doublyLinkedList.remove("vaibhav4");
		
		//doublyLinkedList.remove("vaibhav2");
		
		//doublyLinkedList.print();
		
		//System.out.println(doublyLinkedList.get(0));
		//System.out.println(doublyLinkedList.get(1));
		//System.out.println(doublyLinkedList.get(2));

	}

}
