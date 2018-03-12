package com.main.java;

import java.util.Scanner;

/*
 * Adding Two String like that
 * String1 = aceg
 * String2 = bdf
 * Result = abcdefg
*/
public class AddingTwoString {	
	public String addAlternateWordOfEachString(String s1, String s2) {
		if (s1.length() <= 0 && s2.length() <= 0) {
			return ("invalid!! Both String are Empty");
		}
		
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < s1.length(); i++){
			System.out.println(" i = " + i);
			res.append(s1.charAt(i));
			if(i < s2.length()) {
				res.append(s2.charAt(i));
			} 
			if (s2.length() > s1.length() && i == s1.length() - 1) {
				//System.out.println("here ... " + i);
				for(int j = i+1; j < s2.length(); j++) {
					res.append(s2.charAt(j));
				}
			}			
		}
		return res.toString();
	} // My own implementation 
	
	public String addAlternateWordOfEachStringInternet(String s1, String s2) {
		if (s1.length() <= 0 && s2.length() <= 0) {
			return ("invalid!! Both String are Empty");
		}
		
		StringBuilder res = new StringBuilder();
		final int greaterlength = s1.length() >= s2.length() ? s1.length() : s2.length(); 
		for (int i=0; i<greaterlength; i++) {
			if (i < s1.length()) 
				res.append(s1.charAt(i));
			if (i < s2.length()) 
				res.append(s2.charAt(i));
		}
		return res.toString(); 
	} // Best way to implement this
	
	
	public static void main(String[] args) {
		AddingTwoString obj = new AddingTwoString();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String1 : ");
		String s1 = scan.nextLine();
		System.out.println("Enter String2 : ");
		String s2 = scan.nextLine();
		scan.close();
		System.out.println("Result = " + obj.addAlternateWordOfEachString(s1, s2));
		System.out.println("Result Internet = " + obj.addAlternateWordOfEachStringInternet(s1, s2));
	}
}
