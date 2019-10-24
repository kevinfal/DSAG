
import java.util.*;
import java.util.NoSuchElementException;

/**
 * <p>
 * This class represents an implementation of the Queue interface that prioritizes smaller values using compareTo -- Elements with a lower numerical priority are dequeued first.
 * </p>
 * @author kevin
 *
 * @param <E>
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {

	ArrayList<E> elements;//element in index i has children in indices 2*i and 2*i + 1
	//lower indexes have entered first if values are equal
	
	public PriorityQueue() {
		elements = new ArrayList<E>();
	}
	
	@Override
	public void enqueue(E e) {
		int index = size();
		elements.add(e);
		while (index > 0 && get(index).compareTo(get((index-1)/2)) < 0) {
			E temp = get(index);
			set(index, get((index-1)/2));
			set((index-1)/2, temp);
			index = (index-1) /2;
		}
	}

	@Override
	public E front() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException("Priority Queue is Empty!");
		else
			return get(0);
	}

	@Override
	public E dequeue() throws NoSuchElementException {
		
		if (isEmpty())
			throw new NoSuchElementException("Queue is Empty!");
		
		if (size() == 1)
			return elements.remove(0);
		
		E output = this.front();//Get the top of the heap
		set(0, elements.remove(size()-1));//replace the top of the heap with the most recently added node
		int index = 0;
		int leftI = 1;
		while(leftI < size()) {//parent still has children
			if (leftI + 1 < size()) {//Parent has 2 children
				E left = get(leftI);
				E right = get(leftI+1);
				if (left.compareTo(right) > 0) {//right is smaller
					index = swap(index, leftI+1);
				} else {//left is smaller or equal to right.
					index = swap(index,leftI);
				}
			} else {//parent has 1 child
				index = swap(index,leftI);
			}
			leftI = index*2 + 1;
		}
		return output;
	}
	
	@Override
	public boolean isEmpty() {
		return elements.size() == 0;
	}
	
	/**
	 * Helper method that checks whether a swap should occur, and performs one if it should.
	 * @param parentIndex index of the parent node
	 * @param childIndex index of the child node
	 * @return the index of the child node if a swap occured, and otherwise an invalid index to end the loop in deQueue
	 */
	private int swap(int parentIndex, int childIndex) {
		E parent = get(parentIndex);
		if (parent.compareTo(get(childIndex)) > 0) {
			set(parentIndex, get(childIndex));
			set(childIndex, parent);
			return childIndex;
		} else {
			return size();//exit and finish cascade
		}
	}
	
	/**
	 * helper method to reduce need to type out elements over and over
	 * @param index index of element in arraylist Elements
	 * @return the element held at that index
	 */
	private E get(int index) {
		return elements.get(index);
	}
	
	/**
	 * helper method to reduce need to type out elements over and over
	 * @param index index to set element at in 'Elements'
	 * @param element element to add
	 */
	private void set(int index, E element) {
		elements.set(index, element);
	}
	
	/**
	 * helper method to reduce need to type out elements over and over
	 * @return size of queue
	 */
	private int size() {
		return elements.size();
	}
	
//	public String toString() {
//		String out = "[";
//		for (E e : elements) {
//			out+=e.toString() + " | ";
//		}
//		return out + "\n";
//	}
}
