package com.basic;

public class DiffWayToApendString {
	
	public static void main(String[] args) {
		
		//Before Using + operator discourge because adding string using + operator create 
		//lots of intermediate string specially in loop
		//in java but now below both string appending are same
		String s1 = "My age is " + 20 + ": " + Boolean.valueOf(true);
		
		String s2 = new StringBuilder("my age is ").append(20).append(": ").append(Boolean.valueOf(true)).toString();
	    
		String s3 = "ab";
		
		String s4 = "bc";
		
		System.out.println(s3.concat(s4));
		
		//System.out.println(s3.concat(29)); only can add string literal
	}

}
