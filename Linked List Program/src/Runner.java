//Kevin Falconett
import java.io.*;
import java.util.*;
public class Runner{
	
	
	private LinkedList linked = new LinkedList();
	
	/**
	 * the current linkedList
	 * @return
	 */
	public LinkedList getLinked() {
		return linked;
	}
	
	
	/**
	 * 
	 * @return text file inputted
	 * @throws IOException
	 */
	public String promptFile()throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("File: ");
		String fileInputted = input.readLine();
		return fileInputted;
	}
	
	/**
	 * 
	 * @param file
	 * @throws IOException
	 */
	public void read(String file) throws IOException{
		
		
		
		FileReader readFile = new FileReader(file); 
		
		BufferedReader inFile = new BufferedReader(readFile);

		String inputString = inFile.readLine();
		
		StringTokenizer token = new StringTokenizer(inputString);
		
		if(inputString != null) {
		String fName = token.nextToken(); //firstname
		String lName = token.nextToken();//last name
		String employer = token.nextToken();//employer
		
		Person p0 = new Person(fName, lName, employer);
		
		char firstLetter = lName.charAt(0);
		
		ListNode<Person> personNode = new ListNode<Person>(p0,null);
		
		if(Character.compare(firstLetter, 'm') >= 0) {
			linked.addFront(personNode);
		}
		else {
			linked.addBack(personNode);
		}
		
		}
		
		inputString = inFile.readLine();
		
		while (inputString != null){
				
		
		
		token = new StringTokenizer(inputString);
		
		if(inputString != null) {
		String fName = token.nextToken(); //firstname
		String lName = token.nextToken();//last name
		String employer = token.nextToken();//employer
		
		Person p0 = new Person(fName, lName, employer);
		
		char firstLetter = lName.charAt(0);
		
		ListNode<Person> personNode = new ListNode<Person>(p0,null);
		
		if(Character.compare(firstLetter, 'm') >= 0) {
			linked.addFront(personNode);
		}
		else {
			linked.addBack(personNode);
		}
		
		}
		
		inputString = inFile.readLine();
		
		}
		
		inFile.close();
		
	}
	
	
	/**
	 * @return LinkedList
	 */
	public String toString() {
		return linked.toString();
	}
	/**
	 * 
	 * @param arguments
	 * @throws IOException
	 */
	public static void main(String[] arguments) throws IOException{
				
		Runner run = new Runner();
		
		run.read(run.promptFile());
		
		//printing out so it's readable
		
		LinkedList<Person> l0 = run.getLinked();
		
		ListNode<Person> current = l0.getFront();
		
		while(current!= null) {
			System.out.println(current);
			current = current.getNext();
		}
		
	
	}
}

/*
 
 File: 
PersonList.txt
[ Name: Abe Ardvaark Employer: IBM |Name: Alice Ardvaark Employer: IBM]
[ Name: Alice Ardvaark Employer: IBM |Name: April Field Employer: APL]
[ Name: April Field Employer: APL |Name: Data Field Employer: APL]
[ Name: Data Field Employer: APL |Name: Electromagnetic Field Employer: APL]
[ Name: Electromagnetic Field Employer: APL |Name: Sally Field Employer: APL]
[ Name: Sally Field Employer: APL |Name: Zoe Field Employer: APL]
[ Name: Zoe Field Employer: APL |Name: Ima Geek Employer: DGT]
[ Name: Ima Geek Employer: DGT |Name: Sally Guest Employer: DGT]
[ Name: Sally Guest Employer: DGT |Name: Zoe Guest Employer: APL]
[ Name: Zoe Guest Employer: APL |Name: Asdfgh Keys Employer: DGT]
[ Name: Asdfgh Keys Employer: DGT |Name: Qwerty Keys Employer: IBM]
[ Name: Qwerty Keys Employer: IBM |Name: Cal Kulate Employer: DGT]
[ Name: Cal Kulate Employer: DGT |Name: Linc List Employer: APL]
[ Name: Linc List Employer: APL |Name: Doyour Math Employer: DGT]
[ Name: Doyour Math Employer: DGT |Name: Iluv Math Employer: DGT]
[ Name: Iluv Math Employer: DGT |Name: Ura Nerd Employer: IBM]
[ Name: Ura Nerd Employer: IBM |Name: Blaise Pascal Employer: APL]
[ Name: Blaise Pascal Employer: APL |Name: Sally Pascal Employer: FCA]
[ Name: Sally Pascal Employer: FCA |Name: Suzy Queue Employer: IBM]
[ Name: Suzy Queue Employer: IBM |Name: Amy Rochip Employer: IBM]
[ Name: Amy Rochip Employer: IBM |Name: Mike Rochip Employer: DGT]
[ Name: Mike Rochip Employer: DGT |Name: Genevieve Stapos Employer: DGT]
[ Name: Genevieve Stapos Employer: DGT |Name: Closda Windoes Employer: APL]
[ Name: Closda Windoes Employer: APL |Name: Didja Windoes Employer: APL]
[ Name: Didja Windoes Employer: APL |Name: Howard Yadoing Employer: DGT]
[ Name: Howard Yadoing Employer: DGT |null]
 
 */


