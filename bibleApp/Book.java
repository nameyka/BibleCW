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
        private String name;
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
	
        public String show(String bookName, int chapter, int v1, int v2){
            int c = getChapterPos(chapter);
            String show = "";
            System.out.println("b Bookname");
            if(name.equalsIgnoreCase(bookName)){
                System.out.println("Bookname");
                if(c > -1){
                    System.out.println("No c");
                    return null;
                } else {
                    System.out.println("C");
                    currentVerse = c;
                    if(v1 > v2){
                        while(v1 > v2){
                            show += getNextVerse();
                            v1--;
                        }
                    } else {
                        v1--;
                        while(v1 < v2){
                            show += getNextVerse();
                            v1++;
                        }
                    }
                }
            } else return null;
            return show;
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
        
        public void setName(String n){
            name = n;
        }
        
        public String getName(){
            return name;
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
	
        public int getChapterPos(int chapter){
            for(int i = 0; i < verse.size(); i++){
                if(verse.get(i).equalsIgnoreCase("CHAPTER "+chapter)){
                    return i;
                }
            }
            return -1;
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
