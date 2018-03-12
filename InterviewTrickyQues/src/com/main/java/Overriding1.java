package com.main.java;


class A {
	A() {
		System.out.println("A class Constructor called...");
	}
	protected void setOn(int str) {
		System.out.println("A class " + str );
	}
}

class B extends A{
	B() {
		System.out.println("B class Constructor called... ");
	}
	public void setOn(int obj) {
		System.out.println("B Class " + obj);
	}
}

public class Overriding1 {
	public static void main(String[] args) {
		A obj = new B();
		obj.setOn(100);
	}
}
