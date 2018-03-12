package com.main.java;

public class VarArgs {
	/*private int getValue(int a, int b) {
		System.out.println("Normal one executed -- int");
		return a+b;
	}*/
	
	/*private long getValue(long a, long b) {
		System.out.println("Normal one executed -- long");
		return a+b;
	}*/
	
	private int getValue (int... args) {
		System.out.println("Var args executed -- int");
		int sum = 0;
		for (int a:args) {
			sum += a;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		VarArgs ob = new VarArgs();
		ob.getValue(50, 50);
	}
}
