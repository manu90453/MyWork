package com.implement.ds;

import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	static Node getNode(int data) {
		return new Node(data);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data: " + data;
	}
}

public class SingleLinkedList {
	Node node, startNode, currentNode;
	
	List<Node> list = new ArrayList<Node>();
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.add(10);
		sll.add(20);
		sll.add(30);
		sll.add(70);
		
		System.out.println(sll);
		sll.delete(30);
		System.out.println(sll);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Node Details: " + list;
	}
	
	public void add(int data) {
		node = Node.getNode(data);
		list.add(node);
		if(startNode == null) {
			startNode = node;
			currentNode = node;
		}
		currentNode.next = node;
		currentNode = node;
	}
	
	public void delete(int data) {
		Node tempNode = startNode;
		while(tempNode.next != null){
			if(tempNode.next.data == data) {
				tempNode.next = tempNode.next.next;
			}
			tempNode = tempNode.next;
		}
		startNode = tempNode;
		
	}
	
	public int size() {
		Node tempNode = startNode;
		int size = 0;
		if(!isEmpty())
			size = 1;
		while(tempNode.next != null) {
			size++;
			tempNode = tempNode.next;
		}
		return size;
	}
	
	public boolean isEmpty() {
		return startNode == null;
	}
}
