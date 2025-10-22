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
		
		int[] arr = new int[1000000000];
		int target = 500000;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i ; // Filling the array with even numbers
		}
		
		//int index = Arrays.binarySearch(arr, target); //using the inbuilt method
		
		int index = binarySearch(arr, target); //creating own method for search. 
		if(index == -1) {
			System.out.println("Element" + target + " not found.");
		}else {
			System.out.println("Element found at : " + index);
		}
		
	}

	private static int binarySearch(int[] arr, int target) {
		
		int low = 0; 
		int high = arr.length -1;
		
		while(low <= high) {
			int middle = low + (high -low)/2; //find the middle index
			int value = arr[middle];
			System.out.println("Middle: " + value); //check number of step
			
			if(value < target) low = middle + 1;
			else if (value > target) high = middle - 1;
			else return middle; //target is found.
		}
		return -1;
	}

}
