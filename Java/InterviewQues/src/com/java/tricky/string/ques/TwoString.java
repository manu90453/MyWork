package com.java.tricky.string.ques;

import java.util.Scanner;

/*
 * Adding Two String like that
 * String1 = aceg
 * String2 = bdf
 * Result = abcdefg
*/
public class TwoString {
	
	String fStr = null;
	String sStr = null;
	
	public TwoString(String f, String s) {
		this.fStr = f;
		this.sStr = s;
	}
	
	String add() {
		if(fStr == null || fStr.length() < 0 && sStr == null || sStr.length() < 0) {
			return "Invalid Input String, Please try again";
		}
		
		int fLength = fStr.length();
		int sLength = sStr.length();
		int diff = fLength - sLength;
		
		return append(diff, diff >=0? sLength : fLength);
	}
	
	String append(int diff, int length) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length; i++) {
			sb.append(fStr.charAt(i)).append(sStr.charAt(i));
		}
		if(diff == 0) {
			return sb.toString();
		} else if (diff > 0) {
			sb.append(fStr.substring(length));
		} else {
			sb.append(sStr.substring(length));
		}
		return sb.toString();
	}
	
	String addAlternateWordOfString() {
		if(fStr == null || fStr.length() < 0 && sStr == null || sStr.length() < 0) {
			return "Invalid Input String, Please try again";
		}
		StringBuilder sb = new StringBuilder();
		int grtLength = fStr.length() > sStr.length() ? fStr.length() : sStr.length();
		
		for(int i=0; i < grtLength; i ++ ) {
			if(i < fStr.length()) 
				sb.append(fStr.charAt(i));
		    if(i < sStr.length()) 
		    	sb.append(sStr.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String: ");
		String fStr = sc.next();
		
		System.out.println("Enter Second String: ");
		String sStr = sc.next();
		
		TwoString twoStr = new TwoString(fStr, sStr);
		System.out.println(twoStr.add());
		System.out.println(twoStr.addAlternateWordOfString());
		sc.close();
	}

}
