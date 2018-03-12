package com.basic;

public class Basic {
	
	public static void main(String[] args) {
		
		String s = null;
		//s = s+ null+ s;
		System.out.println(s);
		
		String s1 = "java";	
		String s2 = "ja" + "va"; //Here no object is permanent so object created in string pool
		
		System.out.println(s1==s2);
		
		String s3 = "ja";
		String s4 = s3 + "va"; 
		/* If use permanent reference (s3) java String object created with new operation
		 * means non constant pool
		 */
		System.out.println(s4 == s1);
		
		String s5 = "ja";
		String s6 = s5.concat("va"); // s5 is permanent object
		
		System.out.println(s5==s6);
		
		String s7 = "ja".concat("va"); // Here "ja" is temporary object but inside concat meth represt by this (permanent object)
		
		System.out.println(s1==s7); 
		
		
	}

}
