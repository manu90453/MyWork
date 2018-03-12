package com.string;

import java.util.Scanner;

public class SherlockOnTheBeast {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of test cases");
		int t = sc.nextInt();
		System.out.println("number of test cases" + t);
		System.out.println("Number of digit in a number");
		int n = sc.nextInt();
		int number = 0;
		if (n%3==0) {
			for(int i=0; i <n; i++) {
				number = 5 + number * 10;
			}		
	    }else if (n%5==0) {
	    	for(int i=0; i <n; i++) {
				number = 3 + number * 10;
			}
	    }else {
	    	System.out.println("manish");
	    }
		
		if(number != 0 && (number%3 == 0 || number%5 == 0)) {
			System.out.println(number);
		}else {
			System.out.println("-1");
		}
		sc.close();
	}

}
