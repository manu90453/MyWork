package com.java.main.objective.ques;

public class BooleanValue {
	static boolean val1;
	static boolean val2;
	static boolean val3;
	
	public static void main(String[] args) {
		System.out.println(val1 + " " + val2 + " " + val3);
		if((val1=true) || (val2=true) && (val3=true)) {
			
		}
		System.out.println(val1 + " " + val2 + " " + val3);
	}

}
