/**
 * 
 */
package collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author 3Dots
 *
 */
public class LinkedList<T> implements ListADT<T>{

	private LinkedNode<T> firstBook;
	
	/**
	 * Constructor for an empty linked list.
	 */
	public LinkedList() {
		firstBook = null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see collections.ListADT#add(java.lang.Object)
	 */
	public void add(T book) throws NoSuchElementException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * returns the size of the list
	 */
	public int size() {
	
		if(firstBook == null)
			{
				/*empty list. */
				return 0;
			}
		else
			{
				
			return firstBook.size();
			}
		}
	
	
	/**
	 * 
	 */
	public String toString() {
		String output = "";
		
			if(firstBook != null)
			{
			output += firstBook.toString();
			}
		
			return output;
	}

}
