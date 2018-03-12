package com.string;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of test case");
		int tCase = sc.nextInt();
		
		String[] str = new String[tCase];
		
		for(int i=0; i<tCase; i++) {
			System.out.println("Enter String");
			str[i] = sc.next();
		}	
		
		for(int i=0; i<str.length; i++) {
			char[] ch1 = str[i].toCharArray();
			char[] ch2 = reverse(str[i]).toCharArray();
			boolean flag = false;
			
			for(int j=0; j<ch1.length-1; j++) {
				if(Math.abs(ch1[j+1]-ch1[j]) == Math.abs(ch2[j+1]-ch2[j])) {
					flag = true;
					continue;
				} else {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
		sc.close();
	}
	
	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

}
