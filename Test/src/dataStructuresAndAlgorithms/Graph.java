package dataStructuresAndAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//main class is AdjacencyMatrix
public class Graph {

	ArrayList<Node> nodes;
	int[][] matrix;
	
	Graph(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}
	
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	public void addEdge(int src, int dst) {
		matrix[src][dst] = 1;
	}
	
	public boolean checkEdge(int src, int dst) {
		if(matrix[src][dst] == 1) return true;
		else return false;
	}
	
	public void print() {
		
		System.out.print("  ");
		
		for(Node node : nodes) {
			System.out.print(node.data + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(nodes.get(i).data + " ");
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * depth first search Algorithm
	 * 
	 * Pick a route, keep going. 
	 * If you reach a dead end, or an already visited node, 
	 * backtrack to previous node with unvisited adjacent neighbors. 
	 * Navigates using a stack
	 * 
	 * More popular for games/puzzles
	 */
	public void depthFirstSearch(int src) {
		boolean[] visited = new boolean[matrix.length];
		dFSHelper(src, visited);
	}

	private void dFSHelper(int src, boolean[] visited) {
		if(visited[src]) {
			return;
		}else {
			visited[src] = true;
			System.out.println(nodes.get(src).data + " = Visited");
		}
		
		for(int i = 0; i < matrix[src].length; i++) {
			if(matrix[src][i] == 1) {
				dFSHelper(i, visited);
			}
		}
		
		return;
	}
	
	/*
	 * BREADTH FIRST SEARCH
	 * Traverses a graph level by level
	 * Utilizes a queue
	 * Better if destination is on average close to start
	 * Siblings are visited before children
	 */
	
	public void breadthFirstSearch(int src) {
		Queue<Integer> queue = new LinkedList<>();
		
		boolean[] visited = new boolean[matrix.length];
		queue.offer(src);
		visited[src] = true;
		
		while(queue.size() != 0) {
			src = queue.poll();
			System.out.println(nodes.get(src).data + " = Visited");
			
			for(int i = 0; i < matrix[src].length; i++) {
				if(matrix[src][i] == 1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
