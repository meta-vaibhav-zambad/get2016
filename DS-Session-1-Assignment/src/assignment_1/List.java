package assignment_1;


public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(0,3);
		
		arrayList.add(1,4);
		
		arrayList.add(2,5);
		
		arrayList.overwriteElement(0, 2);
		
		System.out.println(arrayList.getElement(0));

	}

}
