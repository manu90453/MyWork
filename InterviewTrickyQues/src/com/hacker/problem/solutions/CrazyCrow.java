package com.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CrazyCrow {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Total No of Pots: ");
		int totalPots = sc.nextInt();
		int[] potsValue = new int[totalPots];
		
		for(int i=0; i<totalPots; i++) {
			System.out.println("Enter " + i + " value");
			potsValue[i] = sc.nextInt();
		}
		
		System.out.println("How many pots you want to overflow");
		int overflowPots = sc.nextInt();
		
		System.out.println("Minimum stone required to overflow " + overflowPots + 
				" pots" + ThirstyCrowProblem(potsValue, overflowPots));
		
		/*List<String> array = new ArrayList<String>();
		fillArray(array);
		System.out.println(array);*/
		
		sc.close();
		
	}
	
	public static int ThirstyCrowProblem(int[] input1,int input2)
    {
	    return 0;
    }

	private static void fillArray(List<String> array) {
		System.out.println("inside fillArray");
	     Random generator2 = new Random(System.currentTimeMillis());

	     for (int x = 0; x<1000; x++){
	         array.add("Value = " + generator2.nextInt());
	     }
	}


}
