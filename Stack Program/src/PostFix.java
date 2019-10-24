/**
 * 
 * @author kevin
 *
 */
public class PostFix {
	
	
	public PostFix() {}
	
	/**
	 * 
	 * @param expression
	 * @return answer of expression, but Integer.MIN_Value if expression is wrong
	 * @throws IllegalArgumentException 
	 */
	public static int sum(String expression) throws IllegalArgumentException {
		String[] input = new String[expression.length()];
		for(int x = 0; x<expression.length();x++) {
			input[x] = expression.substring(x,x+1);
		}
		Stacker<Integer> stack = new Stacker<Integer>();
		
		if (input.length == 0) {
			System.out.println("Empty");
			throw new IllegalArgumentException("Expression was empty");
		}
		
		for (int x = 0; x< input.length; x++) {
			if(isNum(input[x])) {
				stack.push(Integer.parseInt(input[x]));
			}
			else {
				
				
				Integer a = stack.pop();
				Integer b = stack.pop();
				try {
					stack.push(operate(a,b,input[x]));
				} catch (NullPointerException e) {
					throw new IllegalArgumentException("The expression had too many operations for the amount of numbers.");
				}
				catch(NumberFormatException e) {//bad expression
					x = expression.length();//end loop
					System.out.println("Bad Expression, cancelled");
					return Integer.MIN_VALUE;
				}
			}
		}
		Integer sum = stack.pop();
		
		
		
		return sum;
}
	
	/**
	 * operates according to the operator and returns the result
	 * @param num1
	 * @param num2
	 * @param operator - operator
	 * @return result of operation
	 * @throws IllegalArgumentException
	 */
	public static int operate(int num1, int num2, String operator) throws IllegalArgumentException {
		
		if(operator.contentEquals("*"))//multiplication
			return num1*num2;
		else if(operator.contentEquals("/")) {//division
			if(num1 == 0) {
				throw new NumberFormatException("Divide by Zero");
			}
			return num2/num1;
		}
		else if(operator.contentEquals("+"))//addition
			return num1+num2;
		else if(operator.contentEquals("-"))//operator is subtraction
			return num2-num1;
		else
			throw new IllegalArgumentException(operator +" Not a valid operator");
	}
	/**
	 * Tries to parse the string, if it fails then returns false
	 * @param tryNum - String to check if is a number
	 * @return true if String is number
	 */
	public static boolean isNum(String tryNum) {
		try{
			//try to convert to number
			Integer.parseInt(tryNum);
		} 
		catch (NumberFormatException e) {
			//if fails, not a number
			return false;
		}
		//passes 
		return true;
	}	
	
	
}
