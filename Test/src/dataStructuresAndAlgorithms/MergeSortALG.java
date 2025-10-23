package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class MergeSortALG {

	public static void main(String[] args) {
		/*
		 * MergeSort
		 * Divide and conquer algorithm. Recursively divide array in 2, sort, re-combine
		 * It is a recursive function.
		 * Has a runtime complexity of O(n log n) - quasilinear time.
		 * Space complexity O(n) linear space
		 */
		
		int[] array = {8, 2, 5, 7, 6, 1, 9};
		
		mergeSort(array);
		System.out.println(Arrays.toString(array));
		
	}

	private static void mergeSort(int[] array) {
		int length = array.length;
		
		//base case
		if(length <= 1) return;
		
		//recursive case
		int middle = length/2;
		
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	//Helper method
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		
		int i = 0, l  = 0, r = 0;
		
		//conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
		
	}

}
