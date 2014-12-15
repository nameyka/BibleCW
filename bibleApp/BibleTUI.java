package bibleApp;

import java.util.Scanner;

public class BibleTUI {

	private String comm;
	private Scanner inComm;

	public static void main(String[] args){

		BibleTUI x = new BibleTUI();
		x.displayMenu();
	}

	public BibleTUI()
	{
		displayMenu();
		inComm = new Scanner(System.in);
		comm = inComm.nextLine();
		System.out.println(comm);
		execute(comm);
	}
	private void displayMenu(){
		System.out.println();
		System.out.println("                       Welcome to the BibleApp");
		System.out.println("The BibleApp allows you search through the bible, allowing you to read through verses");
		System.out.println("                     Type 'h' if you need help.");
		System.out.println();
		System.out.println("	 	     ...........     ............ ");
		System.out.println("                ,..,\'           \',.,\'            \',..,");
		System.out.println("              ,' ,'               :                ', ',)");
		System.out.println("            ,' ,'                 :                  ', ',");
		System.out.println("          ,' ,'                   :                    ', ',");
		System.out.println("        ,' ,'                     :                      ', ',");
		System.out.println("      ,' ,'                       :                        ', ',");
		System.out.println("    ,' ,'.......................  :  ........................', ',");
		System.out.println("  ,' ,'                         ',:,'                          ', ',");
		System.out.println(",'  '........................     '     .........................'  ',");
		System.out.println("''''''''''''''''''''''''''''';''''''';''''''''''''''''''''''''''''''");
		System.out.println("   							  '''''''								");
		System.out.println("                           Bible Works                  ");
		System.out.println("               =========================================");
		System.out.println("               |Read from beginning.................[R]|");
		System.out.println("               |Select from List of Books...........[B]|");
		System.out.println("               |Search Keyword......................[K]|");
		System.out.println("               |Quit Bible Works....................[Q]|");
		System.out.println("               =========================================");
		System.out.println();
		System.out.println("                       PLEASE enter a menu option:");
	}
	//switch statements
	private void execute(String command){
		System.out.println("THIS WORKS" + command);

		if(command.equals("R"))
		{
			System.out.println("You choose R");
			//bookStart();
		}
		else if(command.equals("B"))
		{
			System.out.println("You choose B");
			//listBooks();
		}
		else if(command == "S")
		{
			System.out.println("You choose S");
			//searchBible();
		}
		else if(command == "Q")
		{
			System.out.println("You chose Q");
			//quit();
		}
	}
}

