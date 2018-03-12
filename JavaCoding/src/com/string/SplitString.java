package com.string;

import java.util.Scanner;

/*
 * input:
   Manish is a "widely known stupid" manager among "whole organization"
   
   output:
   Manish
   is
   a
   "widely known stupid"
   manager
   among
   "whole organization"*/
public class SplitString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(new SplitString().splits(str));
		
		System.out.println(str.substring(str.indexOf("")));
		
	}
	
	String[] splits(String input) {
		  
		String[] s1 = input.split(" ");
		
		for(String str:s1) {
			
			
		}
		return new String[] {"ff"};
	}

}
