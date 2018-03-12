package com.main.java.string;

public class Swapping {
	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "J2EE";
		
		int len1 = str1.length();
		int len2 = str2.length();
		{
		str1.concat(str2);
		System.out.println("Concated String: " + str1);
		str2 = str1.substring(0, len1);
		str1 = str1.substring(len1);
		}
		
		System.out.println("S1 = " + str1);
		System.out.println("S2 = " + str2);
	}
}
