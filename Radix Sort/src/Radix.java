//Kevin Falconett
import java.util.*;
public class Radix {

	
	private int[] arr = new int[50];
	
	/**
	 * Constructor
	 */
	public Radix(){}
	
	private int loops = 0;
	
	/**
	 * 
	 * @param baseDigits the highest amount of digits in a number in list
	 * @param changedDigits should always start at 1
	 * @param arr the array[] to be sorted
	 */
	public void radixSort(int baseDigits, int changedDigits,int[] arr){
		
		
		int[] tempArr = arr;
		     
		
		if(changedDigits == baseDigits+1){
			
			this.arr = arr;
			
		}
		
		else{
			
			
			
			
			//creating the buckets
			ArrayList<Integer>[] newBuckets = new ArrayList[10];

			
			for(int i = 0; i<newBuckets.length; i++){
				
				newBuckets[i] =  new ArrayList<Integer>();
			
				
			}
			
			
			int mod = (int)Math.pow(10, changedDigits);
			
			
			
			
			//filling Buckets
			for(int x: tempArr){
				
				int toSort = x % mod;				
				String sortString = Character.toString(Integer.toString(toSort).charAt(0));
				toSort = Integer.parseInt(sortString.toString());
				
				//because a (number < 10) % 100 = number
				//must set its location to zero when mod is not 10
				if(x< 10 && mod > 10) {
					toSort = 0;
				}
				else if(x < 100 && mod > 100) {
					toSort = 0;
				}
				

				
				newBuckets[toSort].add(x);
				
				
			}
			
			changedDigits++;
		
			//debug print buckets
			/*
			for(List x : newBuckets) {
				System.out.println(x);
			}
			*/
			
			
			
			int[]newArr = radixMerge(newBuckets);
			
			radixSort(baseDigits, changedDigits, newArr);
			
		}
		
		
	}
	
	/**
	 * 
	 * @param separated a list of "buckets", for a list of arrayLists
	 * @return a merged array
	 */
	public int[] radixMerge(ArrayList<Integer>[] separated){
		
		int[] newArr = new int[arr.length];
		
		int pointer = 0;//points to the new array, where to put the numbers
		//int secondPointer = 0;
		for(int i = 0; i<separated.length; i++){
			
			
			//finding the number to insert
			
			 for(int i2 = 0; i2<separated[i].size(); i2++){
				
				 
				 if(separated[i].get(i2) != null){
					 
					 
					 
					 newArr[pointer] = separated[i].get(i2);
					
					 pointer++;
					 
				 }
				 
				 
			 }
			
		}
		
		
		return newArr;
	}
	
	/**
	 * Tests the radix sort
	 */
	public void testRadix(){
		System.out.print("Before: ");
		fillRandom();
		printList(arr);
		System.out.print("After: " );
		radixSort(findLargest(), 1,arr );
		printList(arr);
		
		
	}
	
	/**
	 * @return the longest amount of digits in a number in the list
	 * 
	 */
	public int findLargest(){
		
		int largest = -1;
		
		for(int x: arr){
			if(x>= largest){
				largest = x;
			}
		}
		
		return Integer.toString(largest).length();
	}
	
	/**
	 * fills arr with random integers
	 */
	public void fillRandom(){
		int max = 999;
		
		for(int i = 0; i<arr.length; i++){
			arr[i]= (int) (Math.random()*max);
		}
	}
	
	/*
	 * @param arr any list
	 * 
	 * prints out any list into a readable format
	 */
	public void printList(int[] arr){
		
		for(int i : arr){
			System.out.print(i +" ");
		}
		System.out.println("");
	}
	
}
