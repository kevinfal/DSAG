
/**
 * 
 * @author kevin
 *
 *Node class for binary search tree
 *
 * @param <E> Object
 */
public class TreeNode<E extends Comparable<E>>
				implements Comparable<TreeNode<E>> {
	
	//private data
	private TreeNode<E> left;
	private TreeNode<E> right;
	private E data;
	
	/**
	 * constructor with only data
	 * @param data
	 */
	public TreeNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	/**
	 * constructor with left right and data
	 * @param data
	 * @param left 
	 * @param right
	 */
	public TreeNode(E data, TreeNode<E> left, TreeNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	//Getters
	/**
	 * 
	 * @return node's data
	 */
	public E getData() {
		return data;
	}
	/**
	 *@return node's left 
	 */
	public TreeNode<E> getLeft() {
		return left;
	}
	/**
	 * 
	 * @return node's right
	 */
	public TreeNode<E> getRight() {
		return right;
	}
	
	//Sets
	/**
	 * data setter
	 * @param data
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * left setter
	 * @param left
	 */
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
	/**
	 * right setter
	 * @param right
	 */
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	
	/**
	 * compareTo implementation
	 * @param compared - to be compared
	 */
	public int compareTo(TreeNode<E> compared) {
		return data.compareTo(compared.getData());
	}
	
	/**
	 * string representation
	 *@return the node in string form
	 */
	public String toString() {
		String returned = " { " +data.toString() +" } ";
		return returned;
	}
}
