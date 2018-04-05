package com.java.main.code.pactice.techgig;

import java.util.Scanner;

public class RitikDayDreamerSolution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row  = sc.nextInt();
		System.out.println("Enter column: ");
		int column = sc.nextInt();
		
		if(row <= 0 || column <= 0) {
			System.out.println("Invalid Grid, again try");
		}
		
		if(row == 1 && column == 1) {
			System.out.println("Both Person on same cell");
		}
		
		
		Integer[][] arr = new Integer[row][column];
		sc.close();
	}

	void time(Integer[][] input) {
		
	}
}
