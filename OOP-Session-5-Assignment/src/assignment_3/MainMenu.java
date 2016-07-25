package assignment_3;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

	//static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ConsoleOperations consoleOperations = new ConsoleOperations();
		
		char isComposite = '\0';
		
		String menuName = "";

		MenuItem menuItem = new MenuItem("Main Menu");

		ActionableMenuItem actionableMenuItem;
		
		int totalChoices = 0;

		do{
			
			//System.out.println("Please enter total number of choices in menu or submenu");
			
			//totalChoices = scanner.nextInt();

			 totalChoices = consoleOperations.getPositiveInteger("Please enter total number of choices in menu or submenu");

			for(int i=0;i < totalChoices ;++i){

				System.out.println("Please enter menu name");

				menuName = scanner.next();

				System.out.println("Press y or Y if menu is composite or press any key");

				isComposite = (char)scanner.next().charAt(0);

				if(isComposite != 'Y' && isComposite != 'y'){

					actionableMenuItem = new ActionableMenuItem(menuName);
					menuItem.addMenu(actionableMenuItem);
				}
				else{
					menuItem = new MenuItem(menuName);
				}
			}
			
		}while(isComposite == 'Y' || isComposite == 'y');


		menuItem.action();
			//}

			/*MenuItem menu1 = new MenuItem("main menu");

		MenuItem menuItem1 = new MenuItem("1. Notes And Assignment");

		MenuItem menuItem2 = new MenuItem("2. Session Feedback");

		ActionableMenuItem menuItem3 = new ActionableMenuItem("3. Exit");

		menu1.addMenu(menuItem1);

		menu1.addMenu(menuItem2);

		menu1.addMenu(menuItem3);


		MenuItem submenuItem1 = new MenuItem("1. Programming Fundamentals");

		MenuItem submenuItem2 = new MenuItem("2. Object Oriented Design");

		ActionableMenuItem submenuItem3 = new ActionableMenuItem("3. back");

		menuItem1.addMenu(submenuItem1);

		menuItem1.addMenu(submenuItem2);

		menuItem1.addMenu(submenuItem3);



		menu1.action();



		int userInput = consoleOperations.getPositiveInteger("Please enter valid choice");

		menu1.actionPerformed(userInput-1);*/



	}
}