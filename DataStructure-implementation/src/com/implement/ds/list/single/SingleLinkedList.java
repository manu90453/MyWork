package com.implement.ds.list.single;

public class SingleLinkedList {
	Node start, end;
	int size;

	public void addAtStart(int data) {
		Node node = new Node(data, null);
		if (isEmpty()) {
			start = node;
			end = start;
		} else {
			node.setNext(start);
			start = node;
		}
		size++;
	}

	public void addAtLast(int data) {
		Node node = new Node(data, null);
		if (isEmpty()) {
			start = node;
			end = start;
		} else {
			end.setNext(node);
			end = node;
		}
		size++;
	}

	public void addAtPos(int data, int pos) {
		Node node = new Node(data, null);
		Node ptr = start;
		if (isEmpty()) {
			start = node;
			end = start;
		} else {
			for (int i = 1; i <= size; i++) {
				if (ptr != null && pos - 1 == i) {
					node.setNext(ptr.getNext());
					ptr.setNext(node);
					break;
				}
				ptr = ptr.getNext();
			}
		}
		size++;
	}

	public void delete(int pos) {

		if (pos == 1) {
			start = start.getNext();
			size--;
		} else if (pos == size) {
			Node p = start;
			while (p.getNext() != end) {
				p = p.getNext();
				continue;
			}
			end = p;
			end.setNext(null);
			size--;
		} else {
			Node ptr = start;
			for (int i = 2; i <= size; i++) {
				if (pos == i) {
					Node temp = ptr.getNext();
					temp = ptr.getNext();
					ptr.setNext(temp);
					size--;
					break;
				}
				ptr = ptr.getNext();
			}
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public void printList() {
		Node print = start;
		while (print != null) {
			System.out.println(print.getData());
			print = print.getNext();
		}
	}
}
