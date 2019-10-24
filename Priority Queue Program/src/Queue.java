/**
 * 
 * @author kevin
 *
 * @param <E> object
 */
public interface Queue<E> {

	/**
	 * 
	 * @param added - the element to be added
	 */
	public void enqueue(E added);
	
	/**
	 * 
	 * @return object at front, null if empty
	 */
	public E peek();
	
	/**
	 * @return item dequeued
	 */
	public E dequeue();
	
	/**
	 * @return true if the queue is empty
	 */
	public boolean isEmpty();
	
}
