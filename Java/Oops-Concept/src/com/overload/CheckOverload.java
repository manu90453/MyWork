package com.overload;

public class CheckOverload {
	
	public void test(Integer i, String s) {
		System.out.println("manish");
	}
	
	public void test(String s, Integer i) {
		System.out.println("anish");
	}
	
	public void test1(int i, double s) {
		System.out.println("manish dd");
	}
	
	public void test1(double s, int i) {
		System.out.println("anish l");
	}

	public static void main(String[] args) {
		
		CheckOverload co = new CheckOverload();
		co.test1(1, 1.0);
	}
}
