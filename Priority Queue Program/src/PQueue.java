
import java.util.*;

/**
 * @author kevin
 *
 * @param <E> object
 */
public class PQueue <E extends Comparable<E>> implements Queue<E>{


	ArrayList<E> queue;
	
	/**
	 * constructor
	 */
	public PQueue() {
		queue = new ArrayList<E>();
	}
	
	

	/**
	 * implementing enqueue
	 */
	public void enqueue(E added) {
		int index = queue.size();
		queue.add(added);
		while (index > 0 && queue.get(index).compareTo(queue.get((index-1)/2)) < 0) {
			E temp = queue.get(index);
			queue.set(index, queue.get((index-1)/2));
			queue.set((index-1)/2, temp);
			index = (index-1) /2;
		}
	}

	/**
	 * implementation of peek
	 */
	public E peek() {
		if (isEmpty())
			return null;
		else
			return queue.get(0);
	}

	/**
	 * implementation of dequeue
	 * @return item dequeued
	 */
	public E dequeue(){
		
		//base
		//queue empty
		if (isEmpty()) {
			System.out.println("Queue is empty ");
			return null;
		}
		else {
		//if only one element
		if (queue.size() == 1) {
			//return first element
			return queue.remove(0);
		}
		//end base
		
		E returned = this.peek();
		
		//get the top
		queue.set(0, queue.remove(queue.size()-1));
		//replace top with recently added
		int index = 0;
		int leftIndex = 1;
		
		while(leftIndex < queue.size()) {
			
			if (leftIndex + 1 < queue.size()) {
			//2 children	
				
				E left = queue.get(leftIndex);
				E right = queue.get(leftIndex+1);
				
				if (left.compareTo(right) > 0) {
					//if the right <
					index = checkSwap(index, leftIndex+1);
				} 
				else {
					//left <=
					
					index = checkSwap(index,leftIndex);
				}
			} 
			else {
				// 1 child
				index = checkSwap(index,leftIndex);
			}
			leftIndex = index * 2 + 1;
		}
	
		return returned;
		}
	}
	/**
	 * @return true if queue is empty
	 */
	public boolean isEmpty() {
		return queue.size() == 0;
	}
	
	/**
	 * checks for swap, swaps if so
	 * @param pIndex parent index
	 * @param cIndex child index
	 * @return index
	 */
	public int checkSwap(int pIndex, int cIndex) {
		E parent = queue.get(pIndex);
		
		if (parent.compareTo(queue.get(cIndex)) > 0) {
			//swap
			queue.set(pIndex, queue.get(cIndex));
			queue.set(cIndex, parent);
			return cIndex;
		} 
		else {
			
			return queue.size();
		}
	}

}
