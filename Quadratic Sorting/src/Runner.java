//Kevin Falconett

//uses bubble sort
public class Runner {
	public static void main(String[] args){
		Sorter s0 = new Sorter(500);
		
		Sorter sorted = new Sorter(10);
		System.out.println("Before Sort");
		sorted.fillRandom();
		sorted.printSorter();
		System.out.println("After Sort");
		sorted.sort();
		sorted.printSorter();
		System.out.println("Random");

		s0.fillRandom();
//		System.out.println("Before Sort");
//		s0.printSorter();
		s0.sort();
//		System.out.println("After Sort");
//		s0.printSorter();
		System.out.println("Ascending");

		Sorter s1 = new Sorter(5000);
		s1.fillAscending();
//		System.out.println("Before Sort");
//		s1.printSorter();
		s1.sort();
//		System.out.println("After Sort");
//		s1.printSorter();

		System.out.println("Descending");
		Sorter s2 = new Sorter(50000);
		s2.fillDescending();
//		System.out.println("Before Sort");
//		s2.printSorter();
		s2.sort();
		//System.out.println("After Sort");
		
		
	}
}
/*
Before Sort
10 2 7 0 7 4 5 8 9 0 
After Sort
Comparisons: 45
Swaps: 22
0 0 2 4 5 7 7 8 9 10 
Random
Comparisons: 124750
Swaps: 61489
Ascending
Comparisons: 12497500
Swaps: 0
Descending
Comparisons: 1249975000
Swaps: 1249975000

 * 
 */
