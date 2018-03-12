package com.hacker.problem.solutions;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digigt");
		int[] number = {sc.nextInt()};
		
		System.out.println("Enter the altered value");
		int aValue = sc.nextInt();
		
		int nLength = number.length;
		int count = 0;
		for(int i=0; i<(int)nLength/2; i++) {
			if(number[i] != number[nLength-i]) {
				
			}
				
			
		}		
		sc.close();
	}

}
