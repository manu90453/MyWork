package com.implement.ds.tree.bst;

public class BSTTest {
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(15);
		bst.add(10);
		bst.add(11);
		bst.add(17);
		bst.add(19);
		
		System.out.println(bst.size);
		bst.inOrderTraversal();
		bst.preOrderTraversal();
		bst.posrOrderTraversal();
		System.out.println(bst.search(15));
		System.out.println(bst.search(10));
		bst.delete(10);
		bst.inOrderTraversal();
		
	}

}
