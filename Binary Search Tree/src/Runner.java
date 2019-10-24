
/**
 * 
 * @author kevin
 *
 */
import java.io.*;
public class Runner{
	
	//private data
	private BinarySearchTree<Integer> tree;
	private boolean terminated = false;
	private String help = "Add: add new" +"/n"
							+"Delete: remove node " +"\n"
							+"PreOrder: traverse tree preOrder " +"\n"
							+"PostOrder: traverse tree PostOrder " +"\n"
							+"InOrder: traverse tree InOrder " +"\n"
							+"Quit: terminate Program " +"\n";
	/**
	 * Constructor 
	 */
	public Runner() {
		tree = new BinarySearchTree<Integer>();
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
		else if(command.contentEquals("delete")) {
			Delete();
		}
		else if(command.contentEquals("preorder")) {
			PreOrder();
		}
		else if(command.contentEquals("postorder")) {
			PostOrder();
		}
		else if(command.contentEquals("inorder")) {
			InOrder();
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
		int inputNum = Integer.parseInt(prompt("Number to add: "));
		tree.add(inputNum);
	}
	/**
	 * delete from tree
	 * @throws IOException
	 */
	public void Delete() throws IOException{
		int inputNum = Integer.parseInt(prompt("Number to remove: "));
		tree.remove(inputNum);
	}
	/**
	 * preorder traversal call
	 */
	public void PreOrder() {
		tree.preOrder();
	}
	/**
	 * postorder traversal call
	 */
	public void PostOrder() {
		tree.postOrder();
	}
	/**
	 * inorder traversal call
	 */
	public void InOrder() {
		tree.inOrder();
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
preorder
Tree is empty
Command : 
add
Number to add:  : 
13
Added successfully
Command : 
add
Number to add:  : 
10
Add successful
Command : 
add
Number to add:  : 
20
Add successful
Command : 
add
Number to add:  : 
12
Add successful
Command : 
add
Number to add:  : 
15
Add successful
Command : 
add
Number to add:  : 
5
Add successful
Command : 
preorder
 { 13 } 
 { 10 } 
 { 5 } 
 { 12 } 
 { 20 } 
 { 15 } 
Command : 
inorder
 { 5 } 
 { 10 } 
 { 12 } 
 { 13 } 
 { 15 } 
 { 20 } 
Command : 
postorder
 { 5 } 
 { 12 } 
 { 10 } 
 { 15 } 
 { 20 } 
 { 13 } 
Command : 
delete
Number to remove:  : 
5
deleted
Command : 
add
Number to add:  : 
30
Add successful
Command : 
add
Number to add:  : 
40
Add successful
Command : 
add
Number to add:  : 
11
Add successful
Command : 
delete
Number to remove:  : 
18
Not in tree
Command : 
add
Number to add:  : 
35
Add successful
Command : 
add
Number to add:  : 
50
Add successful
Command : 
delete
Number to remove:  : 
0
Not in tree
Command : 
delete
Number to remove:  : 
20
deleted
Command : 
inorder
 { 10 } 
 { 11 } 
 { 12 } 
 { 13 } 
 { 15 } 
 { 30 } 
 { 35 } 
 { 40 } 
 { 50 } 
Command : 
delete
Number to remove:  : 
50
deleted
Command : 
add
Number to add:  : 
2
Add successful
Command : 
add
Number to add:  : 
2
 { 2 }  currently in tree
Command : 
delete
Number to remove:  : 
13
Deleted Successfuly
Command : 
delete
Number to remove:  : 
100
Not in tree
Command : 
delete
Number to remove:  : 
10
deleted
Command : 
delete
Number to remove:  : 
2
deleted
Command : 
inorder
 { 11 } 
 { 12 } 
 { 15 } 
 { 30 } 
 { 35 } 
 { 40 } 
Command : 
delete
Number to remove:  : 
15
deleted
Command : 
delete
Number to remove:  : 
12
Deleted Successfuly
Command : 
delete
Number to remove:  : 
30
deleted
Command : 
delete
Number to remove:  : 
35
deleted
Command : 
delete
Number to remove:  : 
40
deleted
Command : 
postorder
 { 11 } 
Command : 
add
Number to add:  : 
10
Add successful
Command : 
add
Number to add:  : 
15
Add successful
Command : 
add
Number to add:  : 
20
Add successful
Command : 
add
Number to add:  : 
5
Add successful
Command : 
preorder
 { 11 } 
 { 10 } 
 { 5 } 
 { 15 } 
 { 20 } 
Command : 
inorder
 { 5 } 
 { 10 } 
 { 11 } 
 { 15 } 
 { 20 } 
Command : 
postorder
 { 5 } 
 { 10 } 
 { 20 } 
 { 15 } 
 { 11 } 
Command : 
quit
Terminated
*/
