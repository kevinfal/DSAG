In this assignment, you will be implementing a quadratic sorting algorithm of your choice, and demonstrating its running time on various sets of data.

 

In order to do this, you should create a class with fields of an array of integers, and integer variables to keep track of the number of swaps and the number of comparisons that take place in the sort.

Your constructor should take a parameter to intitalize the array, so that you can easily construct new objects in main() with arrays of different lengths.

You should have three different methods to fill the array.  One that fills the array with integers in ascending order, one that fills the array with integers in descending order, and one that fills the array with random integers ranging from 0 to array.length.

In the sorting method that you choose to implement, you should increment the comparison and swap counters in the correct locations of the algorithm so that all comparisons/swaps are counted.

 

In order to run this program, create a separate runner class.

Test your filling and sorting methods by creating a small array (10 elements will work), and ensuring that it fills and sorts correctly by outputting the array.

You will be making arrays of lengths 500, 5000, and 50000 through the use of three different objects in main() (you do not need to print out the contents once you have verified that the methods work).  For each array, you should fill and sort it three times (once with ascending starting values, once with descending starting values, and once with random starting values).

The numbers of comparisons and swaps should be outputted for each array (in a well-formatted output).

 

No comments or Exception Handling is required in this program.  Make sure to include the output of the program as a comment at the bottom of the runner class (you do not need to include any tests that printed out the entire array).
