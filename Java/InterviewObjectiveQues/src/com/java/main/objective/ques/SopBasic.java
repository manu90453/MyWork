package com.java.main.objective.ques;

public class SopBasic {
	
	public static void main(String[] args) {
		Object obj = new Integer(10);
		int k = ((Integer)(obj)).intValue();
		
		System.out.println(k);
		
		System.out.println(100/10);
		
		System.out.println(100/9.9);
		
		System.out.println(100/10.0);
		
		System.out.println(3 + 100/10*2 -13);
	}

}
