package com.main.java;

public class WithoutLoop {
	
	public void print1To100(int i) {
		System.out.println(" " + i);
		if (i == 100){
			return;
		} else {
			this.print1To100(++i);
		}
		
	}
	public static void main(String[] args) {
		WithoutLoop ob = new WithoutLoop();	
		ob.print1To100(1);
	}
}
