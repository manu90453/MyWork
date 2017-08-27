package com.implement.ds.tree.bst;

public class BinarySearchTree {
	
	Node root, node;
	int size;
	
	public void add(int data) {
		root = add(root, data);
	}
	
	public Node add(Node node, int data) {	
		if(node == null) {
			size++;
			node = new Node(data, null, null);
		} else if(node.getData() > data) {
			node.left = add(node.getLeft(),data);
		} else {
			node.right = add(node.getRight(),data);
		}
		
		return node;
	}
	
	public void inOrderTraversal() {
		inOrderTraversal(root);
		System.out.println();
	}
	
	public void inOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.print(node.getData() + " ");
		inOrderTraversal(node.getRight());
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root);
		System.out.println();
	}
	
	public void preOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.getData() + " ");
		inOrderTraversal(node.getLeft());
		inOrderTraversal(node.getRight());
	}
	
	public void posrOrderTraversal() {
		postOrderTraversal(root);
		System.out.println();
	}
	
	public void postOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		inOrderTraversal(node.getLeft());
		inOrderTraversal(node.getRight());
		System.out.print(node.getData() + " ");
	}
	
     public boolean search(int data) {
		return search(root, data);
	}

	public boolean search(Node node, int data) {
		
		if(node == null) {
			return false;
		}
		if(node.getData() == data) {
			return true;
		} else if(node.getData() > data) {
			return search(node.getLeft(), data);
		} else {
			return search(node.getRight(), data);
		}
	}
	
	public void delete(int data) {
		if(!search(data)) {
			System.out.println("data in the not in tree");
			return ;
		}
		delete(root, data);
	}
	
	public void delete(Node node, int data) {
		if(node.getData() > data) {
			
		} else {
			
		}
		
		
		
	}
	
	public int getSize() {
		return size;
	}
	
	
}
