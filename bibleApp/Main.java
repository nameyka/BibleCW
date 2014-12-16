package bibleApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    ArrayList<Book> Books;
    ReadFiles rf;
    Scanner scan;
    
    public Main() throws FileNotFoundException, IOException{
        rf = new ReadFiles();
        Books = new ArrayList<Book>();
        File[] f = rf.getFiles();
        int count = 0;
        for(File file: f){
            Books.add(Book.setBook(rf.getFile(file.getName())));
            String name = file.getName().substring(0, file.getName().length()-4);
            System.out.println(name);
            Books.get(count).setName(name);
            count++;
        }
        displayWelcomeMenu();
        char choice;
        
        //System.out.println(Books.size());
        while(true){
            scan = new Scanner(System.in);
            choice = scan.next().charAt(0);
            option(choice);
            System.out.println();
            System.out.print("Choose an option or M to display the menu: ");
        }
        
    }
    
    private void listBooks(){
        for(int i = 0; i < Books.size(); i++){
            System.out.println((i+1)+": " + Books.get(i).getName());
        }
    }
    
    private void searchBooks(String keyword){
        int count;
        for(Book b: Books){
            count = b.search(keyword);
            if(count > 0){
                System.out.println(count + " occurances in: " + b.getTitle());
            }
        }
    }
    
    private void readFromStart(){
        int currentPos = 0;
        
        for(int i = 0; i < Books.size(); i++){
            if(!choseReadBook(++currentPos)){
                break;
            }
        }
    }
    
    private boolean choseReadBook(int c){
        Book b = Books.get(c-1);
        System.out.println("Book: " + b.getTitle());
        System.out.println();
        System.out.println(b.getNextVerse());
        System.out.print("N for next, M for menu or chose an option: ");
        char opt = scan.next().charAt(0);
        String verse = "";
        while(opt == 'N' || opt == 'n'){
            verse = b.getNextVerse();
            if(verse == null){
                System.out.println("End of book");
                break;
            }
            System.out.println(verse);
            System.out.print("N for next, M for menu or chose an option: ");
            opt = scan.next().charAt(0);
            System.out.println();
        }
        if(verse != null){
            System.out.println("Your reading position has been lost");
            System.out.println();
            option(opt);
            return false;
        }
        //never gonna get here
        return true;
    }
    
    private void view(String pos){
        boolean wrongFormat = false;
        String[] spil = pos.split(" ");
        String bookName = "";
        int chapter = 0, v1 = 0, v2 = 0;
        //Get book name
        System.out.println(spil.length+ pos);
        if(spil.length == 2){
            bookName = spil[0];
            
            spil = spil[1].split(":");
            
            //Get chapter
            if(spil.length == 2){
                chapter = Integer.parseInt(spil[0]);
                
                spil = spil[1].split("-");
                    
                //get verses
                if(spil.length == 2){
                    v1 = Integer.parseInt(spil[0]);
                    v2 = Integer.parseInt(spil[1]);
                } else if(spil.length == 1){
                    v1 = Integer.parseInt(spil[0]);
                    v2 = Integer.parseInt(spil[0]);
                }
            } else wrongFormat = true;
        } else wrongFormat = true;
        
        //if(wrongFormat) System.out.println("Information in the wrong format");
        
        for(Book b: Books){
            String view = b.show(bookName, chapter, v1, v2);
            if(view != null){
                System.out.println(view);
                break;
            }
        }
        
        //Get chapter
    }
    
    private void option(char command){
	//System.out.println("THIS WORKS" + command);
        //System.out.print("Enter option: ");
        switch(command){
                
            case 'R':
            case 'r':
		readFromStart();
                break;
                        
                case 'B':
                case 'b':
                    listBooks();
                    int book = scan.nextInt();
                    choseReadBook(book);
                    displayMenu();
                    break;
                    
                case 'S':
                case 's':
                    System.out.println("Enter word to search for");
                    String word = scan.next();
                    searchBooks(word);
                    break;
                    
                case 'Q':
                case 'q':
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                
                case 'M':
                case 'm':
                    displayMenu();
                    break;
                
                case 'P':
                case 'p':
                    System.out.println("Enter goto position");
                    System.out.println("Format: book name chapter:end verse-end verse");
                    System.out.println("Example: [James 3:5-7]");
                    String place = scan.next() + " " + scan.next();
                    view(place);
                    break;
                       
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
        	System.out.println("\t\t=========================================");
		System.out.println("\t\t|Read from beginning.................[R]|");
		System.out.println("\t\t|Select from List of Books...........[B]|");
		System.out.println("\t\t|Search Keyword......................[S]|");
                System.out.println("\t\t|Go to position......................[P]|");
		System.out.println("\t\t|Quit Bible Works....................[Q]|");
		System.out.println("\t\t=========================================");
		System.out.println();

		System.out.print("\t\t\tPLEASE enter a menu option: ");
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        new Main();
    }

}