package bibleApp;
/**
 * 
 * @author Faye Cutler, Hayley Billingham and Nameyka Myrie.
 * @version 1.0
 *
 */

public class Book {
	
	private String title;
	private String chapter;
	private String verse;
	private String description;
	
	/**

	public String search(){
		
	} */
	
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
	public String getChapter(){
		return chapter;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNextVerse(){
		return verse;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hasDescription(){
		if (description.equalsIgnoreCase("true") || description.equalsIgnoreCase("false")) {
		    Boolean.valueOf(description); {
		    	return true;
		    }
		    // do something   
		} else {
		    // throw some exception
			return false;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	
	/**
	 * 
	 */
	public String toString(){
		return title + " " + chapter + " " + verse + " " + description; 
	}
	

}
