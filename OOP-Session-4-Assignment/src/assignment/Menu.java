/**
 * @author vaibhav zambad
 * 
 * Date : 25 July 2016
 * 
 * Aim : to apply the design of the menu to replace the main program with menu related classes
 *
 */
package assignment;


// abstract class for Menu implementing ActionMenu interface
public abstract class Menu implements ActionMenu{
	
	// name of menu
	protected String name;
	
	/**
	 * @param name
	 * constructor to set name
	 */
	public Menu(String name){
		
		this.name = name;
	}
	
	
	/**
	 * @return name
	 * return menu name
	 */
	public String getName(){
		
		return name;
	}
	
	// abstract method to addMenu
	public abstract void addMenu(Menu menu);
	
	// abstract method to getSize
	public abstract int getSize();
	
	public abstract void actionPerformed(int index);
	
	// abstract method to getObject of Menu
	public abstract Menu getObject(int index);
	
}
