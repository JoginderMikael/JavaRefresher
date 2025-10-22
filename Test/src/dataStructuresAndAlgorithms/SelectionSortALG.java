package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class SelectionSortALG {

	public static void main(String[] args) {
		/*
		 * Selection sort -> search algorithm through an array and keep track of the minimum value during each iteration. 
		 * At the end of each iteraction, we swap variables.
		 * Quadratic time O(n^2)
		 * Small data set -> OK
		 * Large data set -> NO 
		 */
		
		int[] array = {8, 7, 9, 3, 1, 5, 4, 6};
		
		selectionSort(array);
		//Arrays.sort(array); //better way
		System.out.println(Arrays.toString(array));

	}

	private static void selectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
	}

}



