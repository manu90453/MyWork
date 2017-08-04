package com.company.quiz.question;

import java.util.Scanner;

public class CountPermutation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total test case");
		int testCase = sc.nextInt();
		System.out.println("enter value in 2d array");
		int[] firstNumber = new int[testCase];
		int[] secondNuber = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			System.out.println("enter firstNumber: ");
			firstNumber[i] = sc.nextInt();
			System.out.println("enter secondNumber: ");
			secondNuber[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCase; i++) {
			countPerm(firstNumber[i], secondNuber[i]);
		}
		sc.close();
	}
	
	static int countPerm(int first, int second) {
		int diff = first-second;
		if(second > first)
			return 0;
		
		if(first>second && diff != second )
			return 1;
		
		if(diff >= second) {
			
		}
		return 1;
    }
}	
