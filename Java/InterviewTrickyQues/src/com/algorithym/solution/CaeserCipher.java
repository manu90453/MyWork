package com.string;

import java.util.Scanner;

public class CaeserCipher {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Length of unencrypted String");
        int n = in.nextInt();
        System.out.println("enter Unencrypted String");
        String s = in.next();
        System.out.println("Enter Encryption Key");
        int k = in.nextInt();
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<n; i++) {
        	if(!Character.isLetter(s.charAt(i)))
        		sb.append(s.charAt(i));
        	
        	
        	if(s.charAt(i) != ' ') {
        		int asc = (int)s.charAt(i);
        		if((asc>=65 && asc<=90)) {
        			sb.append(encryptedChar(s.charAt(i)+k, k,'A'));
        		}else if(asc>=97 && asc<=122) {
        			sb.append(encryptedChar(s.charAt(i)+k, k, 'a'));
        		}else {
        			sb.append(s.charAt(i));
        		}	
        	} 
        }
        
        System.out.println(sb);
        in.close();
    }
	
	public static char encryptedChar(int ch, int key, char t) {
		if (key>=26) {
			if((ch-26)>122 && t=='a') {
				return encryptedChar(ch-26,key,t); 		
			}else if((ch-26)>90 && t=='A'){
				System.out.println("cap");
				return encryptedChar(ch-26, key,t); 
			}else {		
				return (char)(ch-26);
			}	
		} else {
			System.out.println("else");
			return (char)(ch);
		}
			
	}
}
