package com.main.java.sortingTechniques;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SleepSort extends Thread{
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.out.println("Enter any no: ");
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		int arr[] = new int[n];
		System.out.println("Enter " + n + "Elements");
		for(int i=0; i<n; i++){
			line = br.readLine();
			//arr[i] = scan.nextInt();
			arr[i] = Integer.parseInt(line);
		}
		
		
		System.out.println("Output");
		for (int i=0; i<n; i++) {
			Thread.sleep(arr[i]);
			System.out.println(arr[i]);
		}
	}
}
