
/**
 * reference based stack
 * @author Kevin
 *
 * @param <E>
 */
public class Stacker<E> implements Stack<E> {

	//I would override these methods but I don't have that time
	
	private Node<E> top;	
	
	/**
	 * constructor
	 */
	public Stacker() {	
	}
	
	/**
	 * @param added - element to add to stack
	 */
	public void push(E added) {
		
		Node<E> addNode;
		addNode = new Node<E>(added,null);

		if(top == null) {
			top = addNode;
		}
		
		else {
			addNode.setNext(top);
			top = addNode;
		}
		
	}
	
	/**
	 * @return element at top of stack, doesn't remove from stack
	 */
	public E peek() {
		
		if(top != null)
			return top.getData();
		else
			return null;
	}
	
	/**
	 * @return element at top of stack, removes from stack
	 */
	public E pop() {
		
		E returned = top.getData();
		
		top = top.getNext();
		
		return returned;
		
	}
	
	/**
	 * @return true if stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		if(top == null)
			return true;
		else
			return false;
	}
	
}
