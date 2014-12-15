/**
 * 
 */
package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Faye
 *
 */
public class TrieTree<T> implements Iterable<T> {
	public TreeNode<T> root;

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Constructs an empty tree
	public TrieTree() {
		root = null;
	}
	
	//Constructs a tree with just a root node
	public TrieTree(T element) {
		root = new TreeNode<T>(element);
	}
	
	// reset tree to empty state
	public void clear() {
		root = null;
	}
	
	public int size(T root) { // the total number of nodes on the tree
		return size(root);
		
	}
	
	/**protected int size(TreeNode<T> node) {
		if(node == null)
			return 0; //base case
		else
			return 1 +size(node.) + size(node.right); //recursive case
		
	}*/
	
	//inner class TreeNode static nested class
	protected static class TreeNode<E> {
		private E element;
		private List<TreeNode<E>> children;
		
		/** Constructor for creating a node */
		public TreeNode(E element) {
			this.element = element;
			children = new LinkedList<TreeNode<E>>(); // no words
		}
		
		/** Constructor for creating a parent node */
		public TreeNode(E element, List<TreeNode<E>> children) {
			this.element = element;
			this.children = children;
		}
		
		/** Adds a list of new words to this node */
		public void addWords(List<TreeNode<E>> newChildren) {
			if(children.size() > 0) {
				this.children.addAll(newChildren);
			}
			else {
				children = newChildren;
			}
		}
		
		/** Returns all element kept in this node and its descendants */
		public List<E> allData() {
			
			List<E> result = new LinkedList<E>(); // the result list
			
			//Add the element in this node to the result list
			result.add(element);
			
			// Add elements in all descendant nodes to the result list
			for (TreeNode<E> child : children) {
				// addAll appends all elements to the end of the list
				result.addAll(child.allData()); //Deph-first search
				
			}
			
			return result;
			
			}
		}
	
		
		
	}
	    
	   

