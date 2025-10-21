package dataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedLists {

	public static void main(String[] args) {
		/*
		 * 	ARRAY LIST VS LINKED LISTS
		 *      * 	ArrayList:
		 *      - Backed by a dynamic array.
		 *      - Provides O(1) time complexity for accessing elements by index.
		 *      - Insertion and deletion at arbitrary positions can be costly (O(n)) due to the need to shift elements.
		 *      - Good locality of reference, which improves cache performance.
		 *      - Better for scenarios with frequent access to elements by index.
		 *      
		 *      *      * 	LinkedList:
		 *      - Backed by a doubly linked list.	
		 *      - Provides O(n) time complexity for accessing elements by index, as it requires traversal from the head to the desired index.
		 *      - Insertion and deletion at arbitrary positions are more efficient (O(1)) since they involve updating pointers.
		 *      - Poorer locality of reference compared to ArrayLists.
		 *      - Better for scenarios with frequent insertions and deletions at arbitrary positions.
		 *      
		 */
		
		//LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		long startTime, endTime, elapsedTime;
		
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		// ****************LinkedList Access Time****************
		
		startTime = System.nanoTime();
		
		//linkedList.get(500000);
		linkedList.remove(500000);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		System.out.println("LinkedList Access Time: " + elapsedTime + " nanoseconds");
		
		//******************ArrayList Access Time****************
		startTime = System.nanoTime();
		
		//arrayList.get(500000);
		arrayList.remove(500000);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		System.out.println("ArrayList Access Time: " + elapsedTime + " nanoseconds");
	}

	/*
	 * CONCLUSION:
	 * - ArrayLists provide faster access times due to their underlying array structure, allowing O(1) time complexity for accessing elements by index.
	 * - LinkedLists have slower access times (O(n)) because they require traversal from the head to the desired index.
	 * - Therefore, for applications requiring frequent access to elements by index, ArrayLists are preferred.
	 * - However, LinkedLists may be more efficient for applications with frequent insertions and deletions at arbitrary positions, as they do not require shifting elements like ArrayLists do.
	 * 
	 */
}
