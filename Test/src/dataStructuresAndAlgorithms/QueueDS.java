package dataStructuresAndAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String[] args) {
		// QUEUE - is a FIFO data structure. First-In First-Out
		// stores objects in a sort of 'horizontal line'
		// add() or offer() to add to the back
		// remove() or poll() to remove from the front

		// declare

		Queue<String> queue = new LinkedList<>(); //Queue is an interface, so we use LinkedList as the implementation
		queue.offer("Karen");
		queue.offer("Bob");
		queue.offer("Alice");
		queue.offer("John");
		/*
		 * The queue now looks like this: Front -> | Karen | Bob | Alice | John | <-
		 * Back
		 */
		
		System.out.println("The queue is empty (True/false): " + queue.isEmpty()); // checking if the queue is empty
		System.out.println(queue.size() + " items are in the queue"); // checking the size of the queue)
		System.out.println(queue.contains("Alice")); // checking if an item is in the queue
		System.out.println(queue.peek() + " is at the front of the queue"); //peeking the front item without removing it.
		queue.poll(); //removing the front item
		queue.remove(); //removing the front item again
		System.out.println(queue); //printing the whole queue
		
		
		//When to use queues:
		//1. Keyboard input buffering(letters appear in the order they are typed)
		//2. Print queue (documents are printed in the order they are added)
		//3. Task scheduling (tasks are executed in the order they are added)
		//4. linked lists (queues can be used to implement linked lists)
		//

		

	}

}
