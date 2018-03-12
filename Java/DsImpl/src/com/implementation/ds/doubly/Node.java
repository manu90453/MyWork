package com.implementation.ds.doubly;

public class Node {
	int data;
	Node next;
	Node previous;
	
	public Node(int data, Node next, Node previous) {
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
