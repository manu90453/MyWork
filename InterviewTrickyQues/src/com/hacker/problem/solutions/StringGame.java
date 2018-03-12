package com.main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Bob is a string freak. He has got sequences of words to experiment with. If in a sequence, two same words come together then they’ll destroy each other. He wants to know the number of words left in the sequence after this pairwise destruction.

INPUT
The input file will consist of several lines of several words. Words are contiguous stretches of printable characters delimited by white space.

OUTPUT
Print the number of words left per sequence for each line of input.

CONSTRAINTS
Number of lines in the input and number or words per sequence would not exceed 1000 each.*/

public class StringGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //int N = Integer.parseInt(line);
        System.out.println("Entered String = " + line);
        int len_input = line.length();
        int len = 0;
        char temp;
        char[] charArray = new char[len_input];
        for(int i=0; i<len_input; i++) {
        	if (line.charAt(i) != ' '){ 
        		charArray[len++] = line.charAt(i);
        	} 
        }
        
        System.out.println("Content of charArray :" +len);
        for(int i=0; i<len; i++) {
        	System.out.print(charArray[i]);
        }
        System.out.println();
        for(int i=0; i<len; i++) {
        	temp = charArray[i];
        	for (int j=i+1; j<len; j++) {
        		if (temp != ' ' && charArray[j] != ' ' && temp == charArray[j])  {
        			charArray[i] = ' ';
        			charArray[j] = ' ';
        			/*charArray = removeChar(charArray, len, i);
        			--len;
        			charArray = removeChar(charArray, len, j-1);
        			--len;*/
        			break;
        		}
        	}
        }
        
        System.out.println("Before logic charArray=");
        for(int i=0; i<len; i++) {
        	System.out.print(charArray[i]);
        }
        
    
        //Removing space for CharArray
        for (int i=0; i<len; i++) {
        	if (charArray[i] == ' ') {
        		for (int j=i; j<len; j++) {
        			if(j < len-1) {
        				charArray[j] = charArray[j+1];	
        			}	
        		}//for
        		len--;
        		--i;
        		System.out.println(len);
        		for(int k=0; k<len; k++)
        			System.out.print(charArray[k]);
        	}//if
        	
        }//for
        
        
        for(int i=0; i<len; i++) {
        	System.out.print(charArray[i]);
        }
	}
	
	public static char[] removeChar(char charArray[], int len, int index) {
		for(int i=index; i<len; i++) {
			if (i == len - 1) 
				break;
			charArray[i] = charArray[i+1];
		}
		return charArray; 
	}
}	
