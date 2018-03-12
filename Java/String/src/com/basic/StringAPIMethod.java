package com.basic;

public class StringAPIMethod {
	
	public static void main(String[] args) {
		
		String s = "HelloToAll7";
		
		System.out.println(s.codePointAt(0));//Unicode value of given index
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.indexOf("T"));
		
		System.out.println(s.indexOf(72));
		
		System.out.println(s.indexOf("o", 5));
		
		System.out.println(s.concat("manish"));
		
		System.out.println(s.contains("To"));
		
		System.out.println(s.contentEquals("HelloToAll7"));
		
		System.out.println(s.endsWith("l7"));
		
		System.out.println(s.lastIndexOf("o"));
		
		System.out.println(s.lastIndexOf("l", 7));
		
		System.out.println(s.replace("o", "0"));
		
		System.out.println(s.replaceAll("l", "L"));
		
		System.out.println(s.matches("T"));
	}

}
