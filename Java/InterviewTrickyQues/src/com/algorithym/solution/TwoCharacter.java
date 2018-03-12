package com.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacter {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter Length");    
		int len = in.nextInt();
		System.out.println("Enter String");
		String s = in.next();
		
		if (s == null || s.length() <= 0 || len != s.length()) {
			System.out.println("Please enter correct string");
		    System.exit(0);
		}
		
		Set<Character> disChar = new HashSet<Character>();
		char[] ch = s.toCharArray();
		for (int i=0; i < len; i++) {
			disChar.add(ch[i]);
		}
		
		System.out.println(disChar);	
		in.close();
	}
}
