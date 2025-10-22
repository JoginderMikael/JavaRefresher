package dataStructuresAndAlgorithms;

public class Recursion {

	public static void main(String[] args) {
		/*
		 * RECURSION -> Apply the results of a procedure to the procedure. 
		 * 
		 * A recursive method calls itself. 
		 * Can be substituted for iteration. 
		 * Divide a problem into sub-problems of the same type as the original. 
		 * Commonly used with advanced sorting algorithms and navigating trees.
		 * 
		 * advantages
		 * easier to read and write
		 * easier to debug
		 * 
		 * 
		 * disadvantages
		 * sometimes slower
		 * uses more memory
		 * 
		 */

		walk(5);
	}

	private static void walk(int steps) {
		
		/* iterative way
		for(int i = 0; i <= steps; i++) {
			System.out.println("You take a step!");
		}
	*/
		
		//recursive
		
		if(steps < 1) return; //base case
		System.out.println("You take a step!");
		walk(steps - 1); //recursive case
		
		
	}

}
