package com.implement.ds.list;

import java.util.LinkedList;
import java.util.List;

class Node1 {
	int data;
	Node1 next;
	Node1 previos;
	
	public Node1(Object data) {
		this.data = (int)data;
	}
	
	public static Node1 getNode(Object data){
		return new Node1(data);
	}
}
public class DoubleLinkList {
	Node1 currentNode, startNode ;
	List<Node1> list = new LinkedList<Node1>();
	public static void main(String[] args) {
		DoubleLinkList dll = new DoubleLinkList();
		dll.add(77);
		dll.add(30);
		dll.add(43);
		dll.add(56);
		
		System.out.println(dll);
		dll.delete(30);
		System.out.println(dll.print());
		
	}
	
	void add(Object o) {
		Node1 newNode = Node1.getNode(o);
		list.add(newNode);
		if(startNode == null) {
			startNode = newNode;
			currentNode = newNode;
		}
		currentNode.next = newNode;
		newNode.previos = currentNode;
		currentNode = newNode;
	}
	
	boolean get(int data) {
		Node1 check = startNode;
		while(check != null && check.next != null) {
			if(check.data == data)
				return true;
			check = check.next;
		}
		return false;
	}
	
	void delete(int data) {
		Node1 delNode = startNode;
		while(delNode != null && delNode.next != null) {
			if(delNode.data != data) {
				delNode = delNode.next;
				continue;
			}
			delNode.previos.next = delNode.next;
			delNode.next.previos = delNode.previos;
			delNode.next = null;
			delNode.previos = null;
		}
	}
	
	String print() {
		Node1 print = startNode;
		StringBuilder sb = new StringBuilder();
		while(print != null) {
			if(print == startNode)
				sb.append("[" + print.data + ", ");
			else if(print.next == null)
				sb.append(print.data + "]");
			else
				sb.append(print.data + ", ");
			print = print.next;
		}
		System.out.println();
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "" + print();
	}
}
