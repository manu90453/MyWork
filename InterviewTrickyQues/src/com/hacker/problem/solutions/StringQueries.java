package com.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class StringQueries {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int len = Integer.parseInt(line);
		if (len <= 0) {
			//System.out.println("Invalid Input... Length of String"  + len);
			return;
		}
		line = br.readLine();
		int noOfQuery = Integer.parseInt(line);
		if (noOfQuery <= 0) {
			//System.out.println("Invalid Input... Number of queries"  + noOfQuery);
			return;
		}
		
		line = br.readLine();
		StringBuilder inputString  = new StringBuilder(line);
		int inputLength = inputString.length();
		if (len != inputLength) {
			//System.out.println("Invalid Input... String length Mismatch"  + inputLength);
			return;
		}
		
		int L, R;
		int result[] = new int[noOfQuery];
		int resLen = 0;
		while(noOfQuery-- > 0) {
			line = br.readLine();
			L = Integer.parseInt(line);
			line = br.readLine();
			R = Integer.parseInt(line);
			if (L <= 0 || R>len) {
				//System.out.println("Invalid Query Entered... L = "  + L + ", R= " + R + ", Input String Length= " + inputLength);
				return;
			}
			
			char[] characterArray = new char[R-L+1];
			int temp = 0;
			for(int i=L; i<=R; i++) 
				characterArray[temp++] = inputString.charAt(i);
				
			result[resLen++] = getResult(characterArray); 
			//System.out.println(result);
		} //while
		for(int i=0; i<resLen; i++) 
			System.out.println(result[i]);
	}// main
	
	public static int getResult(char[] string) {
		int count=0;
		//char[] string = new char[inputString.length()];
		//string = inputString.toString().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char character : string) {
			if (map.containsKey(character)) {
				map.put(character, (int) map.get(character) + 1);
				count++;
			} else {
				map.put(character, 1);
			}
		} //for
		/*Set<Character> keySet = map.keySet();
		for (char key : keySet) {
			
			if (map.get(key) > 1) 
				count ++;
		}*/
		
		return count;
	}
		
}
