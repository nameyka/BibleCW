/**
 * 
 */
package collections;

import java.util.NoSuchElementException;

/**
 * @author 3Dots
 *
 */
public interface ListADT<T> extends Iterable<T> {
	
	/**                                   
	 * 
	 * @param position
	 * @param element
	 * @throws NoSuchElementException
	 */
	void add(T book) 
			throws NoSuchElementException;
	

	/*
	 * 
	 */
	int size();
	
	/**
	 * 
	 * @return
	 */
	String toString();

}