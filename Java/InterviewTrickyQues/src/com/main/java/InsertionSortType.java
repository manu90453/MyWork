package com.main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InsertionSortType {
	/*public static makeSortedArray(int arr[], int input) {
		int len = arr.length;
		int index;
		for (int i=0; i < len; i++) {
			for (int j=i+1; j<len; j++) {
				if (input < 0) {
					if (arr[i] > arr[j]) {
						
					}
				}
			}
			
		}
		return index;
	}*/
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
		*/
        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/

        //Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Length of Array you want");
        int n = s.nextInt();
		int arr[] = new int[n]; 
		int index, input;
		System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            input = s.nextInt();
            arr[i] = input;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		if (abs(arr[i]) > abs(arr[j])) {
        			switchElement(arr, i, j);
        		}
        	}
        }
        
        System.out.println("Resut Array: ");
        for (int i=0; i<n; i++) {
        	System.out.println(arr[i]);
        }    
    }
    
    public static void switchElement(int arr[], int i, int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    
    public static int abs(int num) {
    	if (num < 0) 
    		return -(num);
    	return num; 
    }
}


