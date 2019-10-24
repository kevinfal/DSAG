/**
 * Array stack
 * @author kevin
 *
 * @param <E>
 */
public class ArrStack<E> implements Stack<E>{
	
	private E[] stack;
	private int topIndex = -1;
	public static final int CAP = 5;
	public ArrStack() {
		stack = (E[]) new Object[CAP];
	}
	@Override
	public void push(E pushed) {
		
		if(topIndex == stack.length-1)
			expand();
		else {
		topIndex++;
		stack[topIndex] = pushed;
		}
	}
	
	@Override
	public E pop(){
	
	
		if(isEmpty())
			return null;
		else {
			E returned = stack[topIndex];
			topIndex --;
			
			return returned;
		}
	}
	
	@Override
	public boolean isEmpty() {
		return (topIndex == -1);
	}
	
	@Override
	public E peek() {
		if(isEmpty()) {
			return null;
		}
		else {
			return stack[topIndex];
		}
		
	}
	
	public void expand() {
		
		E[] temp = (E[]) new Object[2*stack.length];
		System.arraycopy(stack, 0, temp, 0, stack.length);
		
		stack = temp;
	}
	
}
