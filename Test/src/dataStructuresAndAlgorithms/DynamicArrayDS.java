package dataStructuresAndAlgorithms;

import java.util.ArrayList;

public class DynamicArrayDS {

	public static void main(String[] args) {
		/*
		 * DYNAMIC ARRAY - is a data structure that can grow and shrink in size.
		 * STATIC ARRAY - is a data structure that has a fixed size.
		 * Dynamic arrays are more flexible than static arrays because they can change size as needed.
		 * Dynamic arrays implement automatic resizing when the array is full.
		 * 
		 * ADVANTAGES OF DYNAMIC ARRAYS:
		 * 1. Random Access: Dynamic arrays provide O(1) time complexity for accessing elements by index.
		 * 2. Good locality of Reference: Dynamic arrays store elements in contiguous memory locations, which improves cache performance.
		 * 3. Easy to insert and delete elements at the end of the array.
		 * 4. Flexibility: Dynamic arrays can grow and shrink in size as needed.
		 * 
		 * DISADVANTAGES OF DYNAMIC ARRAYS:
		 * 1. waste of memory: Dynamic arrays may allocate more memory than needed to accommodate future growth, leading to wasted space.
		 * 2. Insertion and Deletion at arbitrary positions can be costly (O(n)) due to the need to shift elements.
		 * 3. Resizing Overhead: When a dynamic array needs to resize, it involves allocating new memory and copying existing elements, which can be time-consuming.
		 */
		
		//declare
		
		//ArrayList<String> dynamicArray = new ArrayList<>(); 
		
			DynamicArray dynamicArray = new DynamicArray(4);
			//System.out.println("Initial size of dynamic array: " + dynamicArray.capacity);
			dynamicArray.add("Item 1");
			dynamicArray.add("Item 2");
			dynamicArray.add("Item 3");
			dynamicArray.add("Item 4");
			dynamicArray.add("Item 5");
			dynamicArray.add("Item 6");
			dynamicArray.add("Item 7");
			
			
			dynamicArray.delete("Item 2");
			dynamicArray.delete("Item 4");
			dynamicArray.delete("Item 6");
			dynamicArray.delete("Item 7");
			
			/*
			dynamicArray.insert(1, "Item 1.5");

			System.out.println(dynamicArray.search("Item 3"));
			
			*/
			
			System.out.println("Dynamic Array: " + dynamicArray);
			System.out.println("Size of dynamic array: " + dynamicArray.size);
			System.out.println("Capactiy: " + dynamicArray.capacity);
			System.out.println("Is the dynamic array empty? " + dynamicArray.isEmpty());
			
			
			//NOTE: Java's built-in ArrayList class is a dynamic array implementation.

	}

}
