package com.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] arr = new String[N];
        for(int i=0; i<N; i++) {
        	arr[i] = br.readLine(); 
        }
        
        System.out.println("You Enatered, ");
        for(int i=0; i<N; i++) {
        	System.out.println(arr[i]); 
        }
        
        StringBuilder temp = new StringBuilder(); 
        
	}
}
