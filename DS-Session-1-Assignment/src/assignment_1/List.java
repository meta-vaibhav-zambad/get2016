package assignment_1;


public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//arrayList.add("hello");
		arrayList.add("hello");
		arrayList.add("welcome");
		arrayList.add("vaibhav");

		arrayList.sort();
		//arrayList.reverseList();
		
		//arrayList.clearList();
		
		for(int i = 0 ;i < arrayList.size() ; ++i){
			
			System.out.println(arrayList.getElement(i));
		}
	

	}

}
