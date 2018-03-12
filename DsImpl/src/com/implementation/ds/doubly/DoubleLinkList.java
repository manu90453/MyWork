package com.implementation.ds.doubly;

public class DoubleLinkList {
	
	Node start, end, node;
	int size;
	public void addAtStart(int data) {
		node = new Node(data, null, null);
		if(start == null) {
			start = node;
			end = start;
		} else {
			node.setNext(start);
			start.setPrevious(node);
			start = node;
		}
		size++;
	}
	
	public void addAtLast(int data) {
		node = new Node(data, null, null);
		
		if(start == null) {
			start = node;
			end = start;
		} else {
			end.setNext(node);
			node.setPrevious(end);
			end = node;
		}
		size++;
	}
	
	public void addAtPos(int data, int pos) {
		node = new Node(data, null, null);
		if(start == null) {
			start = node;
			end = start;
		} else {
			Node ptr = start;
			for(int i = 2; i<=size; i++) {
				if(pos == i) {
					node.setNext(ptr.getNext());
					node.setPrevious(ptr);
					ptr.getNext().setPrevious(node);
					ptr.setNext(node);
				}
				ptr = ptr.getNext();
			}
		}
		size++;
	}
	
	public void delete(int pos) {
		
		if(pos == 1) {
			start = start.getNext();
			start.setPrevious(null);
			size--;
		} else if (pos == size) {
			end = end.getPrevious();
			end.setNext(null);
		} else {
			Node temp = start.getNext();
			for(int i=2; i<size;i++) {
				if(pos == i) {
					Node p = temp.getPrevious();
					p.setNext(temp.getNext());
					p = temp.getNext();
					p.setPrevious(temp.getPrevious());
					break;
				}
				temp = temp.getNext();
			}
		}
		size--;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void display() {
		Node disp = start;
		while(disp != null) {
			System.out.print(disp.data + " ");
			disp = disp.getNext();
		}
		System.out.println();
	}
	
	public void displayFromLast() {
		Node dispLast = end;
		while(dispLast != null) {
			System.out.print(dispLast.data + " ");
			dispLast = dispLast.getPrevious();
		}
		System.out.println();
	}
}
