package com.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author SUDIPSAHA
 * Find a Pattern in such way that maximum nos of vowel in that string 
 * Input Text = aaaeeeiiiooouuu
 * Output should be 15.
 * Input text = aaadkfjdkfeeetrrtiii
 * Output should be 0. 
 */
public class MagicalString {
	private final String pattern = "aeiou";
	public int patternMatched(String txt) {
		int count = 0;
		int  j;
		for(int i = 0; i <= txt.length() - pattern.length(); i++) {
			//j = 0;
			for (j = 0; j < pattern.length(); j++) { 
				if (txt.charAt(i+j) != pattern.charAt(j))
					break;
			}
			if (j == pattern.length()) 
				count ++; 
			System.out.println("i = " + i);
		}
		return count;
	} // Exact Matching Pattern Finding
	
	public int magicalStringCount(String txt) {
		int count = 0, temp = 0;
		int j = 0;
		for (int i=0; i<txt.length(); i++) {
			while(j<txt.length()) {
				if(txt.charAt(i+j) == pattern.charAt(j)) {
					count ++;
				} else {
					j++;
				}
				
				
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter any string :: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String txt = br.readLine();
		MagicalString obj = new MagicalString();
		int count = obj.patternMatched(txt);
		System.out.println("Result = " + (count > 0 ? count : "No match founnd ...")) ;
		
	}
}
