package com.main.java;

import java.awt.Checkbox;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoolNumbers {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long N = Integer.parseInt(line);
        System.out.println("N = " + N);
        while (N-- > 0) {
        	line = br.readLine();
        	long L = Integer.parseInt(line);
        	System.out.println("L = " + L);
        	line = br.readLine();
        	long R = Integer.parseInt(line);
        	System.out.println("R = " + R);
        	long result = 0; 
        	if (L <= R) {
        		for (long i=L; i<=R; i++) {
        			
        			result = result + function(i);
        			System.out.println("I am here, i =  " + i + "  " + result);
        		}
        	}
        	System.out.println("Final Result: " + result);
        	
        	/*for (int i=0; i<=25; i++)
        	System.out.println("checkReminder " + i + " = " + chechReminder(i));*/
        }
        
	} //main
	
	public static long function(long value) {
		/*List<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		myList.add(5);*/
		long result = value;
		boolean flag = false;
		while (result >= value){
			flag = chechReminder(result);
			if (flag) {
				//System.out.println("Inside loop result: " + result);
				return result;
			}
			//System.out.println("Result = " + result);
			result++;
		}
		//System.out.println("Result: " + result);
		return result;
	}
	
	public static boolean chechReminder(long value) {
		long rem;
		if (value == 0) {
			return false;
		}
		while(value>0) {
			//System.out.println("Value = " + value);
			rem = value%10;
			if (rem != 2 && rem != 5) {
				//System.out.println("Reminder = " + rem);
				return false;		
			}
			value = value/10;
		} return true;
	}
}


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
*/

/*class TestClass {
    public static void main(String args[] ) throws Exception {
        
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        longN = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        longN = s.nextInt();

        for (long i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        

        System.out.println("Hello World!");
    }
}*/