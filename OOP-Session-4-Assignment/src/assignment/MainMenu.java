/**
 * @author vaibhav zambad
 * 
 * Date : 25 July 2016
 * 
 * Aim : to apply the design of the menu to replace the main program with menu related classes
 *
 */


package assignment;

import java.io.IOException;
import java.util.Scanner;

// Main class 
public class MainMenu {

	// scanner object for input
	static Scanner scanner = new Scanner(System.in);

	// entry method of Program
	public static void main(String[] args) throws IOException {

		// object of same class (MainMenu)
		MainMenu mainMenu = new MainMenu();

		// object of menu class dynamically binded to MenuItem class
		Menu menuItem = new MenuItem("Main");

		// method is called to make menu
		menuItem = mainMenu.makeMenu("Main",menuItem);

		System.out.println("The main menu is: ");

		// action method to print the menu list
		menuItem.action();

		// print method to print the submenus and menus
		mainMenu.printMenu(menuItem);

		System.out.println("Program Exited");


	}

	/**
	 * 
	 * @param menuItem
	 * 
	 * method to print menus
	 */
	public void printMenu(Menu menuItem){

		try{

			// if there are submenus inside a menu 
			if(menuItem.getSize() > 0){

				System.out.println("Press 0 to exit");

				System.out.println("Please enter your choice in number: ");

				// take user input for choice
				int userInput = scanner.nextInt();

				// to exit the program
				if(userInput == 0){

					return;
				}

				// actionPerformed is called to print the submenus at that index
				menuItem.actionPerformed(userInput-1);

				// recursion to repeat again
				printMenu(menuItem.getObject(userInput-1));

			}

			// return if there are no submenus
			return;

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}

	}

	/**
	 * 
	 * @param menuName
	 * @param menuItem
	 * @return Menu
	 * 
	 * taking user input to set a menu
	 */
	public Menu makeMenu(String menuName,Menu menuItem ){

		try{

			// variable to check if the menu is composite
			char isComposite = '\0';

			// variable for total choices
			int totalChoices = 0;

			System.out.println("Please enter total number of choices in "+menuName +" menu");

			// taking user input
			totalChoices = scanner.nextInt();


			// for loop to take total choices
			for(int i=0;i < totalChoices ;++i){

				System.out.println("Please enter menu name ");

				// menu name as input
				menuName = scanner.next();

				System.out.println("Press y or Y if menu is composite or press any key");

				// user input for composite (Yes or No) 
				isComposite = (char)scanner.next().charAt(0);

				if(isComposite != 'Y' && isComposite != 'y'){

					// not composite so LeafMenuItem is created
					LeafMenuItem leafMenuItem = new LeafMenuItem(menuName);

					// added into existing menu item
					menuItem.addMenu(leafMenuItem);
				}
				else{

					// composite so new MenuItem is created
					MenuItem menuItems = new MenuItem(menuName);

					// added into existing menu item
					menuItem.addMenu(menuItems);

					// called recursively to repeat
					makeMenu(menuName,menuItems);
				}
			}

		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
			
		}
		
		// the head of menuItem is returned
		return menuItem;
	}
}