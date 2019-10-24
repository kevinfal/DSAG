
import java.io.*;
/**
 * @author kevin
 *
 */
public class runner {
	public static void main(String[] argumentatives) throws IOException{
		
		File file = new File("Infix.txt");
		BufferedReader inFile = new BufferedReader(new FileReader(file));
		String input = inFile.readLine();
		Queue<String> queue = new LinkQ<String>();
		Queue<String> indexQ = new PQueue<String>();
		
		while(input != null) {
			queue.enqueue(input);
			
			String result = "";
			String postFix = Infix.toPostFix(input);
			String sum = Integer.toString(PostFix.sum(postFix));
			result +=("Original: " +input +"\n");
			
			result +=("PostFix: " +postFix +"\n");
			
			result +=("Answer: "+sum+"\n");
			indexQ.enqueue(result);
			
			input = inFile.readLine();
		
		}
		
		while(!indexQ.isEmpty()) {
			System.out.println(indexQ.dequeue());
		}
		System.out.println("Terminated");
	} 
	
}
//Queue Full
//Original: 9*(8-5)
//PostFix: 985-*
//Answer: 27
//
//Queue Full
//Original: (9-8)*5
//PostFix: 98-5*
//Answer: 5
//
//Queue Full
//Original: 3/(4*(5-(2+1)))
//PostFix: 3452-1+*/
//Answer: 0
//
//Queue Full
//Original: (9/3)/3
//PostFix: 93/3/
//Answer: 1
//
//Original: 9/(3/3)
//PostFix: 933//
//Answer: 9
//
//Original: (8+8*(4-2))*(3+5-6)
//PostFix: 8842-*+35+6-*
//Answer: 48
//
//Original: 5-(4+3/(2*1))
//PostFix: 54321/+-
//Answer: -1
//
//Original: 5/(4*(3-(2+1)))
//PostFix: 5432-1+*/
//Answer: 0
//
//Original: (8+8*(4-2))*(3+5-6)
//PostFix: 8842-*+35+6-*
//Answer: 48
//
//Terminated
