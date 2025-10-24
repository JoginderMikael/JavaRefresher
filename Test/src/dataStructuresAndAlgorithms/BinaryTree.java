package dataStructuresAndAlgorithms;

public class BinaryTree {

	public static void main(String[] args) {
		/*
		 * TREE DATA STRUCTURE
		 * A tree is a non-linear data structure where nodes are organized in a hierarchy
		 * An example is a family tree. 
		 * 
		 * It has nodes and edges, Node is some piece of data and edge is relationship between the data
		 * A tree data structure can be used in 
		 * -> File Explorer
		 * -> Databases
		 * -> DNS
		 * -> HTML DOM
		 * 
		 * Top of the tree is root node - Only have out going edge
		 * Nodes at the bottom of tree are leaf node - only have incoming edges
		 * Branch nodes are in the middle  - Have both outgoing and incoming edges.
		 * 
		 * Any node with outgoing edges is also known as parents. 
		 * Any node with incoming edges is known as a child node.
		 * some nodes are both parent and children
		 * Nodes sharing the same parent are called siblings. 
		 * Subtree is a smaller tree held within a larger tree
		 * 
		 * size of a tree is equal to number of nodes. 
		 * 
		 * depth of the tree is the number of ages below the root node. 
		 * 
		 * A root node has a depth of zero
		 * 
		 * Height of a node is the number of edges above farthest leaf node. 
		 * 
		 * 
		 * BINARY TREE
		 * A binary tree is a tree where each node has no more than two children. 
		 * 
		 * BINARY SEARCH TREE
		 * In a binary search tree the values are arranged in a specified order. 
		 * The root node should be greater than left child but less then the right child. 
		 * They are arranged this way for quick look up. 
		 * The Time complexity is O(n log n)
		 * worst case O(n)
		 * 
		 * Space complexity O(n)
		 * 
		 * 
		 */
		
		

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(new NodeB(5));
		tree.insert(new NodeB(1));
		tree.insert(new NodeB(9));
		tree.insert(new NodeB(2));
		tree.insert(new NodeB(7));
		tree.insert(new NodeB(3));
		tree.insert(new NodeB(6));
		tree.insert(new NodeB(4));
		
		
		tree.remove(3);
		
		
		tree.display();
		
		System.out.println(tree.search(5));
		
	
		
	}

}

class NodeB{
	
	int data;
	NodeB left;
	NodeB right;
	
	NodeB(int data){
		this.data = data;
	}
}

class BinarySearchTree{
	
	NodeB root;
	
	public void insert(NodeB node) {
		root = insertHelper(root, node);
	}
	
	private NodeB insertHelper (NodeB root, NodeB node) {
		
		int data = node.data;
		
		if (root == null) {
			root = node;
			return root;
		}else if(data < root.data) {
			root.left = insertHelper(root.left, node);
			
		}
		else {
			root.right = insertHelper(root.right, node);
		}
		return root;
	}
	
	public void display() {
		displayHelper(root);
	}
	
	private void displayHelper(NodeB root) {
		
		if(root != null) {
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
		}
	}
	
	public boolean search(int data) {
		return searchHelper(root, data);
	}
	
	private boolean searchHelper(NodeB root, int data) {
		
		if(root == null) {
			return false;
		}else if(root.data == data) {
			return true;
		}else if(root.data > data){
			return searchHelper(root.left, data);
		}else {
			return searchHelper(root.right, data);
		}
	}
	
	public void remove(int data) {
		
		if(search(data)) {
			removeHelper(root, data);
		}else {
			System.out.println(data + " Could not be found.");
		}
	}
	
	public NodeB removeHelper(NodeB root, int data) {
		
		if(root == null) {
			return root;

		}else if(data < root.data){
			root.left = removeHelper(root.left, data);
		}else if(data > root.data) {
			root.left = removeHelper(root.right, data);
		}else { //node found
			if(root.left == null && root.right == null) {
				root = null;
			}else if(root.right != null) {// find a successor to replace this node
				root.data = sucessor(root);
				root.right = removeHelper(root.right, root.data);
			}else { //find a predecessor to replace this node
				root.data = predecessor(root);
				root.left = removeHelper(root.left, root.data);
			}
		}
		return root;
	}
	
	private int sucessor(NodeB root) {//find the least value below the right child of this root node
		
		root = root.right;
		
		while(root.left != null) {
			root = root.left;
		}
		
		return root.data;
	}
	
	private int predecessor(NodeB root) { //find the greatest value below the left child of the root node
		
		root = root.left;
		
		while(root.right != null) {
			root = root.right;
		}
		return root.data;
	}
}
