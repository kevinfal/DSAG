/**
 * 
 * @author kevin
 *
 */
public class Infix {
	
	public Infix() {}
	
	/**
	 * converts expression to postFix
	 * @param expression - expression to convert
	 * @return expression in postFix as string
	 */
	public static String toPostFix(String expression) {
		String[] input = new String[expression.length()];
		for(int x = 0; x<expression.length();x++) {
			input[x] = expression.substring(x,x+1);
		}
		
		//Index based stack
		ArrStack<String> operators = new ArrStack<String>();
		
		String postFix = "";
		for (int x = 0; x < input.length; x++) {
			if (PostFix.isNum(input[x])) {
				postFix+=input[x];
			} else if (!input[x].equals("")) {
				while(priority(input[x],operators.peek())) {
					
					if(operators.peek().contentEquals("(")) {
						postFix += "";
					}
					else {
						postFix += operators.pop();
					}
					
				}
				if (!operators.isEmpty() && input[x].contentEquals(")")) {
					if (operators.peek().contentEquals("(")) {
						operators.pop();
					}
				}
				if (!input[x].equals(")"))
					operators.push(input[x]);
			}
		}
		while (!operators.isEmpty() && !operators.peek().contentEquals("("))
			postFix+=operators.pop();
		
		return postFix;
	}
	
	/**
	 * @param operator
	 * @param top
	 * @return true if the operator has a higher or equal priority, false otherwise;
	 */
	private static boolean priority(String operator, String top) {
		
		//base
		
		//top is empty
		if (top == null) 
			return false;
		//top is "("
		if (top.equals("(")) 
			return false;
		
		
		int p1 = findPriority(operator);
		int p2 = findPriority(top);
		
		return p1 >= p2;
	}
	
	/**
	 * returns the priority of the operator in question
	 * @param operator - operator 
	 * @return the priority level of the operator
	 */
	private static int findPriority(String operator) {
		
		if(operator.contentEquals("("))
			return 0;
		else if(operator.contentEquals("/") || operator.contentEquals("*"))
			return 1;
		else if(operator.contentEquals("+") || operator.contentEquals("-"))
			return 2;
		else if(operator.contentEquals(")"))
			return 3;
		else {
			return -1;
		}
	}
}