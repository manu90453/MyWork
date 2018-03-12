package com.basic;

public class MemoryLeak {
	
	public static void main(String[] args) {
		
		String s = "HellofjffjHello";
		
		System.err.println(s.substring(0, 6));
		/* Internally substring creating String object with 
		 * char[] = this point to original array in jdk 1.6 
		 * offset = starting index
		 * length = length of String
		 */
		
		System.out.println(s.substring(s.length()));
	}

}
