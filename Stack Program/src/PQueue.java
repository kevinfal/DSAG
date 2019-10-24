/**
 * @author kevin
 *
 * index based queue
 * @param <E> object
 */
public class PQueue<E> implements Queue<E> {

	private E[] queue;
	private int count;
	private int front;
	private int back;
	
	private final int MAX_CAP = 5;
	
	
	public PQueue() {
		count = 0;
		queue = (E[]) new Object[MAX_CAP];
		front = 0;
		back = 0;
	}
	
	@Override
	public void enqueue(E e){
		if (count == MAX_CAP) {
			System.out.println("Queue Full");
			System.out.println(dequeue());
			queue[0] = e;
			
			
		}
		count++;
		queue[back] = e;
		back = (back + 1) % MAX_CAP;
	}
	@Override
	public E peek()  {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		return queue[front];
	}

	@Override
	public E dequeue(){
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		count--;
		int prev = front;
		front = (front + 1) % MAX_CAP;
		return queue[prev];
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	
	
}