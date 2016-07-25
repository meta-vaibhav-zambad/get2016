package assignment_3;

import java.util.Iterator;

public class ActionableMenuItem extends Menu{
	
	
	public ActionableMenuItem(String name){
		
		super(name);
	}
	
	@Override
	public void addMenu(Menu menu){
		// nothing to do
	}
	
	public void action(){
		
		System.out.println(getName());
	}
}
