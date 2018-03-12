package com.hacker.problem.solutions;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number Of Test Cases");
		int tCase = sc.nextInt();
		
		String[] s1 = new String[tCase];
		for(int i=0; i<tCase; i++) {
			System.out.println("Enter String");
			s1[i] = sc.next();
		}
		
		for(int i = 0; i<tCase; i++) {
			System.out.println(checkAnagram(s1[i]));
		}
		sc.close();
	}
	
	public static int checkAnagram(String str) {
		StringBuffer sb = new StringBuffer();
		int sLength = str.length();
		if (sLength % 2 != 0)
			return -1;
		
		char[] char1 = str.substring(0, sLength/2).toCharArray();
		StringBuffer str1 = new StringBuffer(str.substring(sLength/2, sLength));
		
		for(int i = 0; i < sLength/2; i++) {		
			if(compareCharaacter(char1[i], str1))
				sb.append(char1[i]);
		}
		
		return sb.length();
	}
	
	static boolean compareCharaacter(char c, StringBuffer sb) {
		int cLength =sb.length();
		
		for(int i=0; i<cLength; i++) {
			if(c == sb.charAt(i)) {
				sb.delete(i, i+1);
				return false;
			}	
		}
		return true;
	}
}
