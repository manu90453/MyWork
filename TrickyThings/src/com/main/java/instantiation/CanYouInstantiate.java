package com.main.java.instantiation;

class A {
	public A a = new A();
	/*public A getInstanse() {
		return a; 
	}*/
}
public class CanYouInstantiate extends A{
	public static void main(String[] args) {
		//A a = new A();
		//System.out.println("  " + a.getInstanse());
		A obj = new CanYouInstantiate();
		
	}
}
