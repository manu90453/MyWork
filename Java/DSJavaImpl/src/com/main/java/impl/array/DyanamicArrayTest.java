package com.main.java.impl.array;

import java.util.ArrayList;

class DyanamicArray {
	
	ArrayList<Object> al = null;
	
	public void create() {
		
		al = new ArrayList<>();
	}
	
	public int size() {
		if(al==null) {
			return 0;
		}
		return al.size();
	}

	public void remeove(int index) {	
		 al.remove(index);
	}
	
	public boolean add(Object data) {
		return al.add(data);
	}
	
	public boolean remove(Object key) {
		return al.remove(key);
	}
	
	public Object get(int index) {
		return al.get(index);
	}
	
	public void display() {
		System.out.println(al);
	}
}

public class DyanamicArrayTest {
	public static void main(String[] args) {
		DyanamicArray darr = new DyanamicArray();
		darr.create();
		
		darr.add(12);
		darr.add(17);
		darr.add(77);
		darr.add(99);
		darr.add(76);
		
		darr.display();
		darr.remeove(0);
		darr.display();
	}
}