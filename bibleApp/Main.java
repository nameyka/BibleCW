package bibleApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    ArrayList<Book> Books;
    ReadFiles rf;
    Scanner scan;
    
    public Main() throws FileNotFoundException{
        rf = new ReadFiles();
        Books = new ArrayList<Book>();
        File[] f = rf.getFiles();
        for(File file: f){
            Books.add(Book.setBook(rf.getFile(file.getName())));
        }
        displayWelcomeMenu();
        char choice;
        
        //System.out.println(Books.size());
        while(true){
            scan = new Scanner(System.in);
            choice = scan.next().charAt(0);
            option(choice);
            System.out.println("Choose an option or M to display the menu");
        }
        
    }
    
    private void listBooks(){
        for(int i = 0; i < Books.size(); i++){
            System.out.println((i+1)+": " + Books.get(i).getTitle());
        }
    }
    
    private String choseReadBook(int c){
        Book b = Books.get(c-1);
        System.out.println(b.getNextVerse());
        System.out.println("N for next or chose an option");
        char opt = scan.next().charAt(0);
        while(opt == 'N' || opt == 'n'){
            System.out.println(b.getNextVerse());
            System.out.println("N for next or chose an option");
            opt = scan.next().charAt(0);
        } 
        option(opt);
        return "";
    }
    
    private void option(char command){
	//System.out.println("THIS WORKS" + command);
        //System.out.print("Enter option: ");
        switch(command){
                
            case 'R':
            case 'r':
                System.out.println("You choose R");
		//bookStart();
                break;
                        
                case 'B':
                case 'b':
                    System.out.println("You choose B");
                    listBooks();
                    int book = scan.nextInt();
                    choseReadBook(book);
                    break;
                    
                case 'S':
                case 's':
                    System.out.println("You choose S");
                    //searchBible();
                    break;
                    
                case 'Q':
                case 'q':
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                
                case 'M':
                case 'm':
                    displayMenu();
                       
                default:
                    System.out.println("Your choice was not recognised");
                    //recursion here
                    break;
		}
    }

    private void displayWelcomeMenu(){
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
		displayMenu();
	}
    
    private void displayMenu(){
        	System.out.println("               =========================================");
		System.out.println("               |Read from beginning.................[R]|");
		System.out.println("               |Select from List of Books...........[B]|");
		System.out.println("               |Search Keyword......................[K]|");
		System.out.println("               |Quit Bible Works....................[Q]|");
		System.out.println("               =========================================");
		System.out.println();

		System.out.println("                       PLEASE enter a menu option:");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        new Main();
    }

}