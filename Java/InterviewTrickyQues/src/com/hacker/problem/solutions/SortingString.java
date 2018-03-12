package com.main.java;

/*public class SortingString {

}*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
*/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SortingString {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
    	
    	//BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        int size;
        
        while (T-- > 0) {
        	line = br.readLine();
            size = Integer.parseInt(line);
            String arr[] = new String[size];
            for (int i=0; i<size; i++) {
            	//line = br.readLine();
            	arr[i] = br.readLine();
            }
            sortArray(arr, size);
        }
    } //main
     
    public static void sortArray(String arr[], int size) {
    	String temp = null;
    	for (int i=0;i<size;i++) {
    		for (int j=i+1;j<size;j++) {
    			if((arr[i].compareToIgnoreCase(arr[j]))>0) {
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	
    	for(int i=0;i<size; i++) {
    		System.out.println(arr[i]);
    	}
    }
    
    
}