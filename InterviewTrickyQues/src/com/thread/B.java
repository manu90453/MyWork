package com.thread;


class C {
	void test1() {
		System.out.println("test1");
	}
}
public class B extends C{
	
	void test1() {
		System.out.println("test2");
	}
	
	
	public static void main(String[] args) {
		
		((C)new B()).test1();
	}
}
