package dataStructuresAndAlgorithms;

import java.util.LinkedList;

public class LinkedListsDS {

	public static void main(String[] args) {
		/* LINKED LIST - is a linear data structure where elements are stored in nodes.
		 Each node contains data and a reference (link) to the next node in the sequence.
		arrayLists vs linked lists: 
		1. Dynamic Size: Linked lists can grow and shrink in size dynamically, whereas arrayLists have a fixed size.
		2. Memory Allocation: Linked lists use non-contiguous memory allocation, while arrayLists use contiguous memory allocation.
		3. Insertion/Deletion - O(1): Linked lists allow for efficient insertion and deletion of elements at any position, while arrayLists require shifting elements.
		4. Access Time: ArrayLists provide faster access to elements by index, while linked lists require traversal from the head node.
		
		 singly linked list vs doubly linked list:
		1. Node Structure: In a singly linked list, each node contains data and a reference to the next node only. In a doubly linked list, each node contains data, a reference to the next node, and a reference to the previous node.
		2. Traversal: Singly linked lists can only be traversed in one direction (forward), while doubly linked lists can be traversed in both directions (forward and backward).
		3. Memory Usage: Doubly linked lists require more memory per node due to the additional reference to the previous node.
		*/
		//declare
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		
		//Linked list can mimic stack and queue behaviors
		
		linkedList.push("Node 1"); //adds to the front (head)
		linkedList.add("Node 2"); //adds to the end (tail)
		linkedList.add("Node 3");
		linkedList.addFirst("Node 0"); //adds to the front (head)
		linkedList.addLast("Node 4"); //adds to the end (tail)
		
		linkedList.add(2, "Node 1.5"); //adds at index 2
		
		linkedList.remove(3); //removes at index 3
		
		linkedList.pop(); //removes from the front (head)
		
		System.out.println("First Node: " + linkedList.getFirst()); //getting the first node
		System.out.println("Last Node: " + linkedList.peekLast()); //getting the last node
		
		System.out.println("The linked list is: " + linkedList); //printing the whole linked list
		
		/*
		 * Other Methods in linkedList: linkedList.size() - returns the size of the
		 * linked list linkedList.contains("Node X") - checks if the linked list
		 * contains "Node X" linkedList.clear() - clears the linked list
		 * linkedList.indexOf("Node X") - returns the index of "Node X"
		 * linkedList.set(index, "Node X") - sets the value at index to "Node X"
		 * linkedList.toArray() - converts the linked list to an array
		 * linkedList.iterator() - returns an iterator for the linked list
		 * linkedList.listIterator() - returns a list iterator for the linked list
		 * linkedList.reverse() - reverses the linked list
		 * linkedList.sort() - sorts the linked list
		 * linkedList.clone() - creates a shallow copy of the linked list
		 * linkedList.subList(fromIndex, toIndex) - returns a sublist from fromIndex to toIndex
		 * linkedList.removeFirstOccurrence("Node X") - removes the first occurrence of "Node X"
		 */
		
		/* when to use linked List:
		 * 1. Dynamic Size: When the number of elements is unknown or changes frequently.
		 * 2. Frequent Insertions/Deletions: When there are frequent insertions and deletions of elements, especially at the beginning or middle of the list.
		 * 3. Memory Efficiency: When memory usage is a concern, as linked lists can be more memory-efficient for certain use cases compared to arrays.
		 * 4. Implementing Stacks and Queues: Linked lists can be used to implement stack and queue data structures efficiently.
		 * 5. GPS Navigation Systems: Linked lists can represent routes with waypoints that can be dynamically added or removed.
		 * 6. Music Playlists: Linked lists can manage dynamic playlists where songs can be added or removed easily.
		 */
		
	}

}
