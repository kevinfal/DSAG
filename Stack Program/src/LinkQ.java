
/**
 * 
 * @author kevin
 *
 * @param <E>
 */
public class LinkQ<E> implements Queue<E> {

	private Node<E> front;
	private Node<E> back;
	
	public LinkQ() {
		front = null;
		back = null;
	}
	
	@Override
	public void enqueue(E added) {
		if (isEmpty()) {
			
			front = new Node<E>(added,null);
			back = front;
		} 
		else {
			
			back.setNext(new Node<E>(added,null));
			back = back.getNext();
			
		}
	}

	@Override
	public E peek() {
		if (!this.isEmpty())
			return front.getData();
		
		System.out.println("Queue is empty");
		return null;
	}

	@Override
	public E dequeue() {
		
		if (!this.isEmpty()) {
			
			E data = front.getData();
			front = front.getNext();
			
			if (front == null)
				back = null;
			
			return data;
		}
		
		System.out.println("Queue is Empty!");
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return back==null;
		
	}

	
	
}
