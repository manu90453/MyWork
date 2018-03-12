package com.main.java.tree;
/*
 * Tree Structure
 * 				20
 * 			10       30
 * 		  5	  15   25   40 
 * 
 * 
 */
public class BinaryTreeImpl {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node("20");
		tree.root.left = new Node("10");
		tree.root.right = new Node("30");
		tree.root.left.left = new Node("5");
		tree.root.left.right = new Node("15");
		tree.root.right.left = new Node("25");
		tree.root.right.right = new Node("40");
		System.out.println("Leaf Nodes : ");
		tree.printLeaves(tree.root);
		
		System.out.println();
		System.out.println("Boundary node from left : ");
		tree.printBoundaryFromLeft(tree.root);
	}
}


class Node {
	public String data;
	Node left, right;
	public Node(String data) {
		this.data = data;
		left = right = null;
	}
	
}

class BinaryTree {
	Node root;
	void printLeaves(Node node) {
		if (node != null) {
			printLeaves(node.left);
			if(node.left == null && node.right == null) {
				System.out.print(" " + node.data);
			}
			printLeaves(node.right);
		}
	}
	
	void printBoundaryFromLeft(Node node) {
		if(node != null) {
			if (node.left != null) {
				System.out.println(" " + node.data);
				printBoundaryFromLeft(node.left);
			} /*else if (node.right != null) {
				System.out.println(" " + node.data);
				printBoundaryFromLeft(node.right);
			}*/
		}
	}
	
	void printBoundaryFromRight(Node node) {
		if(node != null) {
			if (node.right != null) {
				System.out.println(" " + node.data);
				printBoundaryFromLeft(node.right);
			} /*else if (node.right != null) {
				System.out.println(" " + node.data);
				printBoundaryFromLeft(node.right);
			}*/
		}
	}
		
	void printBoundary(Node node) {
		if(node != null) {
			
		}
	}
}