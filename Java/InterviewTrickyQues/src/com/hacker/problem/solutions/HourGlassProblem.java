package com.main.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlassProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    	int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        
	        int brr[][] = new int[3][3];
	        int maxValue = Integer.MIN_VALUE;
	        System.out.println("Initially maxValue = " + maxValue);
	        for (int brr_i = 0; brr_i < 3; brr_i++) {
	        	for (int brr_j = 0; brr_j < 3; brr_j++){
	        		brr [brr_i][brr_j] = arr[brr_i][brr_j];
	        		if  
	        	}
	        }
	    }
	
}
