package com.string;

import java.util.Scanner;

public class SuperReducebleString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		int i=0;
		while(i<ch.length-1) {
			if (ch[i]==ch[i+1] && ch.length>0) {
				ch = deletePair(ch,i);
				i=0;
				continue;
			}	
			i++;
		}		
		System.out.println(ch.length==0?"Empty String":String.valueOf(ch));
		sc.close();
	}
	
	static char[] deletePair(char[] ch, int k) {
		char[] temp = new char[ch.length-2];
		int i =0;
		int j=0;
		while(i<ch.length) {
			if(i==k || i==k+1) {
				
			} else {
				temp[j++] = ch[i];
			}
			i++;
		}
		return temp;
	}
}
