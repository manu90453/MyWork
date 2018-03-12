package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Sring");
		String s = in.next().replaceAll("[A-Z]", "");
		
		int n = s.length();
		int arrSize = n * (n+1)/2;
		
		String arr[] = new String[arrSize];
		for(int i=0; i<arrSize-1; i++) {
			arr[i] = s.substring(i, i+1);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
