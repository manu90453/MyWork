package com.main.java.string;

public class IntegerClassDemo {
	public static void main(String[] args) {
		String str = "128";
		if (Integer.valueOf(str)== 127) {
			System.out.println("Matched");
		} else {
			System.out.println("Not Matched");
		}
	}
}
