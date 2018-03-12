package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class CamelCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String s = sc.next();
		String[] totalWord = s.split("(?=[A-Z])");
		
		System.out.println(Arrays.toString(totalWord));
		System.out.println(totalWord.length);
		sc.close();
	}

}
