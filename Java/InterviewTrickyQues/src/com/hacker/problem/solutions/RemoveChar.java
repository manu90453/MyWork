package com.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveChar {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter String :: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   		String line = br.readLine();
        removeSpace(line);
        System.out.println("Enter index for remove :: "); 
        int index = Integer.parseInt(br.readLine());
        
        if (index > line.length()) {
        	System.out.println("Invalid index, try again !!!");
        	System.exit(0);
        }
        
        int len = line.length();
        char[] charArray = new char[len];
         
        for (int i=0; i<len; i++) {
        	charArray[i] = line.charAt(i);
        } //for
        
        for (int i=index-1; i<len-1; i++) {
        	charArray[i] = charArray[i+1];	
        }
        len--;
        System.out.println("Result ::");
        for (int i=0; i<len; i++) {
        	System.out.print(charArray[i]);
        }
	} // main
	
	public static void removeSpace(String line) {
		char [] charArray = new char[line.length()];
		int len = 0; 
		for (int i=0; i<line.length(); i++) {
			if (line.charAt(i) != ' ') {
				charArray[len++] = line.charAt(i);
			} else
				System.out.println("Space found:" + line.charAt(i) + i);
		}
		System.out.println("Line = " + line);
		System.out.println("charArray = " );
		for (int i=0; i<len; i++)
			System.out.print(charArray[i]);
	}
	
}
