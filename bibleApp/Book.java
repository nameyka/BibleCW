package bibleApp;

import java.util.ArrayList;


/**
 * Sets up the layout of the book for when it comes searching for the title, chapter and verse(s).
 * @author Faye Cutler, Hayley Billingham and Nameyka Myrie.
 * @version 1.0
 *
 */

public class Book {
	
	private String title;
    private String name;
	private String chapter; // not currently used
	private ArrayList<String> verse;
	private String description;
    private int currentVerse = 0;
    
	/**
	 * sets the title, chapter and description to null.
	 * verse is entered into an ArrayList.
	 */
	public Book(){
            title = null;
            //chapter = null;
            verse = new ArrayList<String>();
            description = null;
        }
        /**
         * Searches how many times the given word is located in all 66 books. 
         * Is iterated through the main class.
         * @param word
         * @return amount 
         */
        public int search(String word){
            int amount = 0;
            String[] arr;
            //Has to be a word
            if(title != null){
                arr = title.split(" ");
                for(int i = 0; i < arr.length; i++){
                    if(arr[i].equalsIgnoreCase(word)) amount++;
                }
            }
            
            for(String s: verse){
            
                arr = s.split(" ");
                for(int i = 0; i < arr.length; i++){
                    if(arr[i].equalsIgnoreCase(word)) amount++;
                }
            }
            return amount;
        }
	
	/**
	 * Retrieves the title of the book.
	 * @return title
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * Retrieves the chapter of the book.
	 * @return
	 */
	public ArrayList<String> getChapter(){
		return verse;
	}
	
	/**
	 * 
	 * @returns the next verse of the book.
	 */
	public String getNextVerse(){
            if(currentVerse == verse.size()){
                return null;
            }
		return verse.get(currentVerse++);
	}
		/**
		 * shows the book, chapters and/or verses.
		 * @param bookName
		 * @param chapter
		 * @param v1
		 * @param v2
		 * @returns the book and chapters and/or verses.
		 */
        public String show(String bookName, int chapter, int v1, int v2){
            int c = getChapterPos(chapter);
            String show = "";
   
            if(name.equalsIgnoreCase(bookName)){
                if(c < 0){
                    return null;
                } else {
                    if(v1 == 0 && v2 == 0){
                        v1 = c;
                        v2 = getChapterPos(chapter++);
                    } 
                        currentVerse = c;
                        if(v1 > v2){
                            v1++;
                            while(v1 > v2){
                                show += getNextVerse()+"\n";
                                v1--;
                            }
                        } else {
                            v1--;
                            while(v1 < v2){
                                show += getNextVerse()+"\n";
                                v1++;
                            }
                        }
                    
                }
            } else return null;
            return show;
        }
        
	/**
	 * 
	 * @return description: checks if the book has a description.
	 */
	public boolean hasDescription(){
            return (description != null);
	}
	
	/** 
	 * @return description of the book.
	 */
	public String getDescription(){
		return description;
	}
        /** 
         * sets the name of book. 
         */
        public void setName(String n){
            name = n;
        }
        
        /** 
         * returns the name of the book.
         */
        public String getName(){
            return name;
        }
        
        /** 
         * sets the title of the book. 
         */
        public void setTitle(String t){
            title = t;
        }
        
        /** 
         * sets the description of the book, if it has one.
         */
        public void setDesc(String d){
            description = d;
        }
        
        /** 
         * When needed in the setBook method it adds all the verses using addVerse(). 
         * In the Main it iterates over it. 
         */
        public void addVerse(String v){
            verse.add(v);
        }
        
        /** 
         * Retrieves the chapter position. Is used in the String show method.
         */
        public int getChapterPos(int chapter){
            
            for(int i = 0; i < verse.size(); i++){
                if(verse.get(i).equalsIgnoreCase("CHAPTER "+chapter)){
                    return i;
                }
            }
            return -1;
        }
        
        /** 
         * Sets the book one at a time by using the iterator in the main class.
         */
        public static Book setBook(ArrayList<String> arr){
            Book b = new Book();
            for (String line : arr) {
                if(line.length() > 0){
                    if(b.getTitle() == null){
                        b.setTitle(line);
                    } else {
                        b.addVerse(line);
                    }
                }
            }
            return b;
        }
            
        
	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * returns the title + chapter+ verse and the description of a book(s).
	 * The main class iterates through this method to return all 66 books information.
	 */
	public String toString(){
		return title + " " + chapter + " " + verse + " " + description; 
	}
	

}
