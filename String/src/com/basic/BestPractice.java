package com.basic;

public class BestPractice {
	
	public static void main(String[] args) {
		
		String s = addString();
		
		if(s.equals("SUCCESS")) { // s != null && s.equals("SUCCESS")  or SUCCESS.equals(s)
			System.out.println("Operation is success");
		} else {
			System.out.println("Operation is failed");
		}
	}
	
	static String addString() {
		return null;
	}

}
