package com.hacker.problem.solutions;

import java.util.Scanner;

public class PalindromeIndex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the test cases");
		int testCase = sc.nextInt();
		String[] s1 = new String[testCase];
		
		for(int i=0; i <testCase; i++) {
			System.out.println("Enter" + i + "String");
			s1[i] = sc.next();
		}
		System.out.println(testCase);
		for(int i=0; i <testCase; i++) {
			System.out.println(checkPalindrome(s1[i]));
		}
		sc.close();
	}
	
	static int checkPalindrome (String s1) {
		StringBuffer sb = new StringBuffer(s1);
		String revString = sb.reverse().toString();
		
		if(s1.equals(revString)) {
			return -1;
		} 
		else {
			for(int i = 0; i < (int)(s1.length()/2); i++) {
				if(s1.charAt(i) == s1.charAt(s1.length()-i-1))
					continue;
				
				String newString = new StringBuffer(s1).delete(i, i+1).toString();
				if(newString.equals(new StringBuffer(newString).reverse().toString())) { 
					return i;
				}
				
			    newString = new StringBuffer(s1).delete(s1.length()-1-i, s1.length()-i).toString();
				if(newString.equals(new StringBuffer(newString).reverse().toString())) {
					return s1.length()-i-1;
				} 	
			}	
		} 
		return -1;
	}
}



/*int subIndex = s1.length()%2 != 0?(int)(s1.length()/2)+2:(int)(s1.length()/2)+1;
String subString1 = s1.substring(0, subIndex);
String subString2 = s1.substring(subIndex, s1.length());*/