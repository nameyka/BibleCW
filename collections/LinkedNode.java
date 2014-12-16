/**
 * 
 */
package collections;





/**
 * @author 3Dots
 *
 */
public class LinkedNode<T> {
	
	private T book;
	private LinkedNode<T> next;
	
	/**
	 * Constructor
	 * @param content
	 */
	public LinkedNode(T book) {
		this.book = book;
		next = null;
	}
	
	/**
	 * 
	 * @param book
	 * @return
	 */
	public LinkedNode<T> add(T book) {
		return next;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int size()
	{
		
		if(next == null)
			
			return 1; // base case
		else
			
			return 1 + next.size(); // recursive case
	}
	
	/**
	 * 
	 */
	public String toString() {
		if(this.getNext() != null)
		{
			
			return book + "\n" + next.toString(); //base case
		}
		else
					
			return book.toString(); //recursive case
	}
	
	/**
	 * 
	 * @param node
	 */
	public void setNext(LinkedNode<T> node)
	{
		this.next = node;
	}
	
	/**
	 * 
	 * @return
	 */
	public LinkedNode<T> getNext()
	{
		return next;
	}
	
	/**
	 * 
	 * @return
	 */
	public T getBook()
	{
		return book;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
