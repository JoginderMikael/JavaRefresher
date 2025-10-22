package dataStructuresAndAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortALG {

	public static void main(String[] args) {
		
		/*
		 * Insertion Sort -> After comparing the elements to the left, shift to the right to make room to insert
		 * Quadratic time O(n^2)
		 * Decent for small datasets
		 * bad for larger datasets.
		 * 
		 * Less steps than bubble sort
		 * bat case for O(n) compared to selection sort O(n^2)
		 */
		
		int startTime;
		int endTime;
		int elapsedTime;
		
		startTime = (int) System.nanoTime();
		int[] array = new int[1000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10000);
		}
		
		System.out.println("unSorted array: " + Arrays.toString(array));
		
		insertionSort(array);
		//Arrays.sort(array);
		
		System.out.println("Sorted array: " + Arrays.toString(array));
		
		endTime = (int) System.nanoTime();
		elapsedTime = (endTime - startTime)/1000000;

		System.out.println("The program has taken " + elapsedTime + " ms");
	}

	private static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
		
	}

}
