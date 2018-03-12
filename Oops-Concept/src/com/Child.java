package com;

public class Child extends Parents{
	
	public int hashCode() {
		return 220;
	}
	
	public static String toString1() {
		return "manish";
	}

	public static void main(String[] args) {
		Child ch1 = new Child();
		Parents pa1 = new Child();
		
		String s1 = "abc";
		Object o1= "abc";
		
		System.out.println(ch1.hashCode());
		System.out.println(pa1.toString1());
	}
}
