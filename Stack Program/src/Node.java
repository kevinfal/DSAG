/**
 * 
 * @author kevin
 *
 * @param <E>
 */
public class Node<E>{

	private E data;
	private Node<E> next;

	
	/**
	 * 
	 * @param data -- value of the node
	 * @param next -- what node it links to
	 */
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	/**
	 * 
	 * @return current data
	 */
	public E getData() {
		return data;
	}
	/**
	 * 
	 * @return what a node links to 
	 */
	public Node<E> getNext(){
		return next;
	}

	
	
	/**
	 * 
	 * @param new data to change
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * 
	 * @param next -- changes what a node links to
	 */
	public void setNext(Node<E> next) {
		this.next = next;
		
	}

	
	/**
	 * @return Node in string form
	 */
	public String toString() {
		if(next == null) {
		return "[ "+data+" |" +next+"]";
		}
		else {
			return "[ "+data+" |" +next.getData()+"]";
		}
	}
	
}
