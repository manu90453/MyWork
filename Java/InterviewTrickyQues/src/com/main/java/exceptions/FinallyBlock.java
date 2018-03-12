package com.main.java.exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		FinallyBlock ob = new FinallyBlock();
		int x = ob.callMethod();
		System.out.println("X = " + x);
	}
	
	@SuppressWarnings("finally")
	private int callMethod() {
		try {
			//int x = 40/0;
			//return 10;
			throw new IllegalAccessException();
			
			//System.exit(100);
		} catch (Exception ex) {
			System.out.println("Exception Caught: " + ex);
			return 20;
		} finally {
			System.out.println("Finally executed");
			return 40;
		}	
	}
}
