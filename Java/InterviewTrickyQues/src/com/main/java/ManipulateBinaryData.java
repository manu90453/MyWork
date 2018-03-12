package com.main.java;

public class ManipulateBinaryData {
	public static void main(String[] args) {
		long arr[] = {1,0,1,0,0,1,1,0,0,0,0,1};
		long j, temp;
		int i;
		long count = 0;
		for (i=1; i<arr.length;) {
			System.out.println("I am here");
			if (arr[i] > arr[i-1]) {
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
				i--;
			} else {
				i++; 
			}
			
		}//for 
		for (i=0; i<arr.length; i++) 
			System.out.println("Sorted Array " + arr[i]);
		
		
	}
}
