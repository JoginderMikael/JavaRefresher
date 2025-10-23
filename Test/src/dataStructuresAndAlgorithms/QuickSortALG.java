package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class QuickSortALG {

	public static void main(String[] args) {
		/*
		 * QUICK SORT
		 * Moves smaller elements to left of a pivot recursively divide arrat in 2 paritions. 
		 * 
		 * Runtime complexity
		 * Best case O(n log(n))
		 * Average case O(n log(n))
		 * Worst case O(n^2) if already sorted.
		 * 
		 * 
		 * Space complexity -> O(log(n)) due to recursion
		 */
		
		int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1 };
		
		quickSort(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));
		
		

	}

	private static void quickSort(int[] array, int start, int end) {
		
		//Base Case
		if(end <= start) return;
		
		//recursive case
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1);
		quickSort(array, start + 1, end);
		
	}
	
	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		
		int i = start - 1;
		
		for(int j = start; j <= end -1; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
		
	}

}
