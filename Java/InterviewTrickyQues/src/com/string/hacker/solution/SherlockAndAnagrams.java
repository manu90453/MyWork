package com.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SherlockAndAnagrams {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enetr the test cases");
		int tCase = sc.nextInt();
	
		String str[] = new String[tCase];	
		for(int i = 0; i < tCase; i++) {
			System.out.println("enter the string");
			str[i] = sc.next();
		}
		
		for(int i=0; i < tCase; i++) {
			process(str[i], str[i].length());
		}
		sc.close();
	}
	
	public static void process(String str, int sLength) {
		int totalVal = sLength * (sLength + 1)/2;
		
		System.out.println(totalVal);
		String subArr[] = new String[totalVal];
		int count = 0;
		for(int i=0; i<sLength; i++) { 
			for(int j=0; j<sLength ; j++) {
				if(j<i) 
					continue;
				subArr[--totalVal] = str.substring(i, j+1);
				count++;		
			}
		}
		
		Arrays.sort(subArr, new SherlockAndAnagrams.Compare());
		
		System.out.println(count);
		System.out.println(Arrays.toString(subArr));
	}
	
     static class Compare implements Comparator<String>{
		public int compare(String o1, String o2) {
		    if (o1.length() > o2.length()) {
		      return 1;
		    } else if (o1.length() < o2.length()) {
		      return -1;
		    } else {
		      return 0;
		    }
		  }
	}
}
