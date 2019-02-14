//Kevin Falconett

//uses bubble sort
public class Runner {
	public static void main(String[] args){
		Sorter s0 = new Sorter(10);
		s0.testQuick();
		s0.printSorter();
		/*
		Sorter s1 = new Sorter(5000);
		s1.test();

		Sorter s2 = new Sorter(50000);
		s2.test();
		*/
	}
}
/*
Before Sort
Size: 500
Random
Comparisons: 124750
Swaps: 63629
Ascending
Comparisons: 124750
Swaps: 0
Descending
Comparisons: 124750
Swaps: 124750

Size: 5000
Random
Comparisons: 12497500
Swaps: 6329045
Ascending
Comparisons: 12497500
Swaps: 0
Descending
Comparisons: 12497500
Swaps: 12497500

Descending
Size: 50000
Random
Comparisons: 1249975000
Swaps: 627924180
Ascending
Comparisons: 1249975000
Swaps: 0
Descending
Comparisons: 1249975000
Swaps: 1249975000
 * 
 */
