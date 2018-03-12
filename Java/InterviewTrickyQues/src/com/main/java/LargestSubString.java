package com.main.java;

import java.util.Scanner;

public class LargestSubString {
	public void getLargestSubString(String str) {
		int start = 1;
		String	string = "";
		String	real_string = "";
		while (start <= str.length() -1) {

			if (string.length() < 1)
				string += str.charAt(start - 1); 

			if (str.charAt(start - 1) <= str.charAt(start)) {
				string += str.charAt(start);
				if (string.length() > real_string.length())
					real_string = string;
			}	
			else {
				string = "";
				start += 1;
			}
		}		
		System.out.println("Longest substring in alphabetical order is: " + real_string);
	} 
	
	
	public void getLargestSubString(String text, String pattern) {
		int [][] temp = new int[100][100];
		temp[0][0] = 0;
		StringBuilder res = new StringBuilder("");
		for (int i=0; i < text.length(); i++) {
			for(int j=0; j < pattern.length(); j++) {
				if (text.charAt(i) == pattern.charAt(j)) {					
					if (i == 0 || j==0) 
						temp[i][j] = 1;
					else 
						temp[i][j] = temp[i-1][j-1] + 1;
					res.append(text.charAt(i));
				}	
				else
					temp[i][j] = 0;
			}
		}
		
		//iterating temp
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<pattern.length(); j++) {
				System.out.print(" " + temp[i][j]);
			}
			System.out.println("\n");
		}
		
		
		System.out.println("Resultent Substring: " + res.toString());
	}
	
	public static void main(String[] args) {
		//System.out.println("Enter String ");
		//Scanner scan = new Scanner(System.in);
		//String text = scan.nextLine();
		//String pattern = scan.nextLine();
		
		String text = "Sudipsaha";
		String pattern = "saha";
		
		
		LargestSubString ob = new LargestSubString();
		ob.getLargestSubString(text);
		
		ob.getLargestSubString(text, pattern);
		
	}
}


/*start = 1
string = ''
real_string = ''
while start <= len(s) -1:

    if len(string) < 1:
        string = s[start - 1] 

    if s[start - 1] <= s[start]:
        string += s[start]
        if len(string) > len(real_string):
            real_string = string
    else:
        string = ''

    start += 1

print("Longest substring in alphabetical order is: " + real_string)




def longest_nondecreasing_substring(s):
    if s is None or len(s) <= 1:
        return s

    longest = test = s[0]

    for i in range(1, len(s)):
        if ord(s[i]) >= ord(s[i - 1]):
            test += s[i]
        else:
            if len(longest) < len(test):
                longest = test
            test = s[i]
    if len(longest) < len(test):
        longest = test
    return longest
*/