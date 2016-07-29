package assignment_3;

public final class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList<String> singlyLinkedList= new SinglyLinkedList<String>();
		
		singlyLinkedList.add(0, "vaibhav1");
		singlyLinkedList.add(1, "vaibhav2");
		singlyLinkedList.add(2, "vaibhav3");
		singlyLinkedList.add(3, "vaibhav4");
		
		singlyLinkedList.reverse();
		
		singlyLinkedList.print();

	}

}
