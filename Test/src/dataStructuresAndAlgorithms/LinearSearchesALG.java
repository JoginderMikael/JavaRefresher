package dataStructuresAndAlgorithms;

public class LinearSearchesALG {

	public static void main(String[] args) {
		/*
		 * Linear Search Algorithm - Iterates through each element at a time in a list to find a target value.
		 * The runtime Time Complexity: O(n)
		 * Space Complexity: O(1)
		 * 
		 * Disadvantages:
		 * 1. Inefficient for large datasets - slow
		 * 2. Not suitable for sorted data - binary search is better
		 * 
		 * Advantages:
		 * 1. Faster for small datasets
		 * 2. Simple to implement
		 * 3. Works on unsorted data
		 * 4. No additional memory required
		 * 5. Useful for data structures that do not have random access like linked list. 
		 */
		
		int[] array = {34, 2, 10, -9, 5, 67, 23};
		int index = linearSearch(array, 2);
		
		if(index != -1) {
			System.out.println("Element Found at index " + index);
		}else {
			System.out.println("Element Not found");
		}

	}

	private static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	

}
