package com.implement.ds.tree;


public class BinarySearchTree {
	
	Node root, leftRoot, rightRoot;
	static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public static Node getNode(int data) {
			return new Node(data);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(27);
		bst.insert(21);
		bst.insert(28);
		bst.insert(33);
		bst.insert(5);
		bst.insert(22);
		bst.insert(30);
		
		System.out.println(bst.root.data);
		System.out.println(bst.search(22, bst.root));
		System.out.println(bst.search(21, bst.root));
	}
	
	void insert(int data) {
		root = addNode(data, root);
	}
	
	Node addNode(int data, Node node) {
		if(node == null) {
			node = Node.getNode(data);
			System.out.println(node.data);
		} else if(data < node.data ){
			node.left = addNode(data, node.left);
		} else
			node.right = addNode(data, node.right);
		return node;
	}
	
	boolean search(int data, Node searchNode) {
		if(searchNode.data == data)
			return true;
		else if (searchNode.data > data)
			return search(data, searchNode.left);
		else if (searchNode.data < data)
			return search(data, searchNode.right);
		else 
			return false;
	}
}
