package dataStructuresAndAlgorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {
		// PRIORITY QUEUE - A FIFO data structure where each element has a priority.
		// Elements with higher priority are served before elements with lower priority.
		
		
		//declare
		Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap Priority Queue
		
		priorityQueue.offer(5.5);
		priorityQueue.offer(1.2);
		priorityQueue.offer(3.8);
		priorityQueue.offer(4.4);
		priorityQueue.offer(2.1);
		
		/*
		 * The priority queue now looks like this (not necessarily in this order): | 1.2
		 * | 3.8 | 4.4 | 5.5 |
		 */
		
		while (!priorityQueue.isEmpty()) {
			// Processing items based on priority
			System.out.println("Processing item with priority: " + priorityQueue.poll());
		}
		
		
	}

}
