package bibleApp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Faye Cutler, Hayley Billingham and Nameyka Myrie.
 * @version 1.0
 *
 */

public class Book {
	
	private String title;
	private String chapter;
	private ArrayList<String> verse;
	private String description;
        private int currentVerse = 0;
	
	public Book(){
            title = null;
            chapter = null;
            verse = new ArrayList<String>();
            description = null;
        }
        
        public int search(String word){
            int amount = 0;
            String[] arr;
            //Has to be a word
            if(title != null){
                arr = title.split(" ");
                for(int i = 0; i < arr.length; i++){
                    if(arr[i].toLowerCase().equalsIgnoreCase(word)) amount++;
                }
            }
            
            for(String s: verse){
            
                arr = s.split(" ");
                for(int i = 0; i < arr.length; i++){
                    if(arr[i].toLowerCase().equalsIgnoreCase(word)) amount++;
                }
            }
            return amount;
        }
	
	/**
	 * 
	 * @return
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getChapter(){
		return verse;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNextVerse(){
            if(currentVerse == verse.size()){
                return null;
            }
		return verse.get(currentVerse++);
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasDescription(){
            return (description != null);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescription(){
		return description;
	}
        
        public void setTitle(String t){
            title = t;
        }
        
        public void setDesc(String d){
            description = d;
        }
        
        public void addVerse(String v){
            verse.add(v);
        }
	
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
	 * 
	 */
	public String toString(){
		return title + " " + chapter + " " + verse + " " + description; 
	}
	

}
