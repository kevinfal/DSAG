
import java.util.*;
import java.io.*;

/**
 * 
 * @author kevin
 *
 */
public class Runner {

	private PQueue<Patient> queue;
	private boolean terminated = false;
	
	private String help = "Add: add new" +"\n"
							+"Delete: remove node " +"\n"
							+"Quit: terminate Program " +"\n";
	/**
	 * Constructor 
	 */
	public Runner() {
		queue = new PQueue<Patient>();
	}
	
	/**
	 * 
	 * @return terminate
	 */
	public boolean getTerminated(){
		return terminated;
	}
	
	/**
	 * Central Command Station
	 * @param command - to execute
	 */
	public void commands(String command) throws IOException{
		command = command.toLowerCase();
		if(command.contentEquals("add")) {
			Add();
		}
		else if(command.contentEquals("dq")) {
			Dq();
		}
		else if(command.contentEquals("quit")) {
			terminated = true;
		}
		else {
			System.out.println(help);
		}
	}
	
	/**
	 * general prompt method
	 * @param prompted - what needs to be prompted
	 * @return the response
	 * @throws IOException
	 */
	public String prompt(String prompted) throws IOException{
		System.out.println(prompted +" : ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		return input.readLine();
	}

	/**
	 * adds node
	 * @throws IOException
	 */
	public void Add() throws IOException{
		String inputString = prompt("Patient to add: ");
		StringTokenizer token = new StringTokenizer(inputString);
		String[] tokens = new String[3];
		for(int i = 0;token.hasMoreTokens(); i++) {
			tokens[i] = token.nextToken();
		}
		
		int priority = Integer.parseInt(tokens[2]);
		String first = tokens[0];
		String last = tokens[1];
		Patient added = new Patient(first,last,priority);
		
		queue.enqueue(added);
		System.out.println("Patient added: " +first +" " +last +" Priority: " +priority);
	}

	public void Dq() throws IOException{
		
		System.out.println("Seeing: " +queue.dequeue());
	}
		
	public static void main(String[] argumentatives) throws IOException{
		Runner r0 = new Runner();
		String command;
		while(!r0.getTerminated()) {
			
			command = r0.prompt("Command");
			r0.commands(command);
		}
		System.out.println("Terminated");
	}
}
/*
Command : 
add
Patient to add:  : 
zoe field 10
Patient added: zoe field Priority: 10
Command : 
add
Patient to add:  : 
suzy queue 5
Patient added: suzy queue Priority: 5
Command : 
add
Patient to add:  : 
ura nerd 9
Patient added: ura nerd Priority: 9
Command : 
add
Patient to add:  : 
cal kulate 5
Patient added: cal kulate Priority: 5
Command : 
add
Patient to add:  : 
closda windoes 1
Patient added: closda windoes Priority: 1
Command : 
add
Patient to add:  : 
blaise pascal 2
Patient added: blaise pascal Priority: 2
Command : 
add
Patient to add:  : 
sally field 3
Patient added: sally field Priority: 3
Command : 
add
Patient to add:  : 
qwerty keys 4
Patient added: qwerty keys Priority: 4
Command : 
add
Patient to add:  : 
linc list 9
Patient added: linc list Priority: 9
Command : 
ima geek 1
Add: add new
Delete: remove node 
Quit: terminate Program 

Command : 
add
Patient to add:  : 
ima geek 1
Patient added: ima geek Priority: 1
Command : 
dq
Seeing: closda windoes, Pain Level: 1
Command : 
dq
Seeing: ima geek, Pain Level: 1
Command : 
dq
Seeing: blaise pascal, Pain Level: 2
Command : 
dq
Seeing: sally field, Pain Level: 3
Command : 
dq
Seeing: qwerty keys, Pain Level: 4
Command : 
dq
Seeing: suzy queue, Pain Level: 5
Command : 
dq
Seeing: cal kulate, Pain Level: 5
Command : 
add
Patient to add:  : 
electromagnetic field 8
Patient added: electromagnetic field Priority: 8
Command : 
add
Patient to add:  : 
zoe guest 7
Patient added: zoe guest Priority: 7
Command : 
add
Patient to add:  : 
sally guest 2
Patient added: sally guest Priority: 2
Command : 
add
Patient to add:  : 
april field 1
Patient added: april field Priority: 1
Command : 
add
Patient to add:  : 
asdfgh keys 10
Patient added: asdfgh keys Priority: 10
Command : 
add
Patient to add:  : 
mike rochip 10
Patient added: mike rochip Priority: 10
Command : 
add
Patient to add:  : 
amy rochip 10
Patient added: amy rochip Priority: 10
Command : 
add
Patient to add:  : 
didja windoes 8
Patient added: didja windoes Priority: 8
Command : 
add
Patient to add:  : 
data field 4
Patient added: data field Priority: 4
Command : 
add
Patient to add:  : 
howard yadoing 3
Patient added: howard yadoing Priority: 3
Command : 																	//first dequeue
dq
Seeing: april field, Pain Level: 1
Command : 
dq
Seeing: sally guest, Pain Level: 2
Command : 
dq
Seeing: howard yadoing, Pain Level: 3
Command : 
dq
Seeing: data field, Pain Level: 4
Command : 
dq
Seeing: zoe guest, Pain Level: 7
Command : 
add
Patient to add:  : 
alice ardvaark 6
Patient added: alice ardvaark Priority: 6
Command : 
add
Patient to add:  : 
genevieve stapos 10
Patient added: genevieve stapos Priority: 10
Command : 
add
Patient to add:  : 
abe ardvaark 1
Patient added: abe ardvaark Priority: 1
Command : 
add
Patient to add:  : 
doyour math 2
Patient added: doyour math Priority: 2
Command : 
add
Patient to add:  : 
iluv math 2
Patient added: iluv math Priority: 2
Command : 
dq	
Seeing: abe ardvaark, Pain Level: 1
Command : 
dq
Seeing: doyour math, Pain Level: 2
Command : 
dq
Seeing: iluv math, Pain Level: 2
Command : 
add
Patient to add:  : 
sally pascal 9
Patient added: sally pascal Priority: 9
Command : 
dq
Seeing: alice ardvaark, Pain Level: 6
Command : 
dq
Seeing: didja windoes, Pain Level: 8
Command : 
dq
Seeing: electromagnetic field, Pain Level: 8
Command : 
dq
Seeing: sally pascal, Pain Level: 9
Command : 
dq
Seeing: ura nerd, Pain Level: 9
Command : 
dq
Seeing: linc list, Pain Level: 9
Command : 
dq
Seeing: amy rochip, Pain Level: 10
Command : 
dq
Seeing: genevieve stapos, Pain Level: 10
Command : 
dq
Seeing: mike rochip, Pain Level: 10
Command : 
dq
Seeing: asdfgh keys, Pain Level: 10
Command : 
dq
Seeing: zoe field, Pain Level: 10
Command : 
dq
Queue is empty 
Seeing: null
Command : 
quit
Terminated
*/