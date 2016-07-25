package assignment_3;

public abstract class Menu implements ActionMenu{
	
	protected String name;
	
	public Menu(String name){
		
		this.name = name;
	}

	public String getName(){
		
		return name;
	}
	
	public abstract void addMenu(Menu menu);
	
	
	
	//public abstract Iterator<Menu> iterator();
}
