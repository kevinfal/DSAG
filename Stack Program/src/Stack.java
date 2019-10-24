

/**\
 * 
 * @author Kevin Falconett
 * 
 * Interface for a stack
 *
 * @param <E>
 */
public interface Stack<E> {
	
		
	/**
	 * 
	 * @return element at top of stack, removes from list
	 */
	public E pop();
	
	/**
	 * 
	 * @param added -- the element to add to the top of the stack
	 */
	public void push(E added);
	
	/**
	 * 
	 * @return the element at top of the stack
	 */
	public E peek();
	
	/**
	 * 
	 * @return true if stack is empty, false otherwise
	 */
	public boolean isEmpty();
	
	
}
