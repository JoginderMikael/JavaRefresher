package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class BinarySearchALG {

	public static void main(String[] args) {
		/*
		 * Binary search algorithm finds the position of a target value within a sorted array. 
		 * Half of the array is eliminated during each step.
		 * Time Complexity: O(log n)
		 * Space Complexity: O(1)
		 * It is fantastic for large datasets due to its efficiency.
		 *
		 *     
		 */
		
		int[] arr = new int[100];
		int target = 42;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i ; // Filling the array with even numbers
		}
		
		int index = Arrays.binarySearch(arr, target); //using the inbuilt method
		
		 
		if(index == -1) {
			System.out.println("Element" + target + " not found.");
		}else {
			System.out.println("Element found at : " + index);
		}
		
	}

	
}
