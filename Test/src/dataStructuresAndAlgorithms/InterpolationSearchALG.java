package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class InterpolationSearchALG {

	public static void main(String[] args) {
		/*
		 * Interpolation search is an improvement of binary search for "Uniformly" distributed "guesses"
		 * where a value might be based on calculated proble results. 
		 * if a probe is incorrect, search is narrowed, and a new probe is calculated. 
		 * 
		 * average case: O(log(log(n)))
		 * worst case: O(n) -- situations where values increase exponentially. 
		 * 
		 * 
		 */
		
		int[] array = new int [100];
		
		for (int i = 0; i < array.length ; i++) {
			array[i] = i*i;
		}
		
		int index = interpolationSearch(array, 6400);
		
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		if(index != -1) System.out.println("Element found at index " + index);
		else System.out.println("Element not found.");

	}

	private static int interpolationSearch(int[] array, int value) {
		
		int high = array.length - 1;
		int low = 0;
		
		while(value >= array[low] && value <= array[high] && low <= high) {
			
			int probe = low + (high - low ) * (value - array[low]) / (array[high] - array[low]);
			System.out.println("Probe : " + probe);
			
			if (array[probe] == value) return probe;
			else if(array[probe] < value) low = probe + 1;
			else high = probe - 1;
		}
		return -1;
	}

}
