package com.main.java.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String emails = "sudip.saha@openlane.com";
		
		StringTokenizer tokenizer = new StringTokenizer(emails, ",;");
		System.out.println("NO of Tokens: " + tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken().trim());
		}
		//spliterLogic(emails);
		
	}
	
	public static void spliterLogic(String emails) {
		String [] emailAddresses = new String[10];
		int i = 0;
		while(i < emails.length()) {
			
		}
	}
}
