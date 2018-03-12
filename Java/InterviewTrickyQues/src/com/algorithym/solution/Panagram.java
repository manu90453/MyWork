package com.string;
/*Pangrams are sentences constructed by using every letter of the alphabet at least once.*/

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Panagram String");
		String str = sc.nextLine();
		sc.close();
		/*char[] ch = str.trim().replaceAll("\\s+","").toLowerCase().toCharArray();
		Set<Character> s = new HashSet<Character>();
		
		for(int i=0; i<ch.length; i++) {
			s.add(ch[i]);
		}
		
		System.out.println(s);
		
		if(s.size()==26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}*/
		
		System.out.println(str.chars().distinct().count()>25?"panagram":"not panagram");
		
		// Scanner sc = new Scanner(System.in);
		    String s= sc.nextLine();
		    s = s.toLowerCase();
		   HashSet<Integer> h = new HashSet<Integer>();
		    for (int i = 0; i < s.length(); i++) {
		        if(s.charAt(i)!=' '){
		            int put = (int)s.charAt(i);
		            if(put>=97 && put<=122)
		            	h.add(put);
		        }
		    }
		    if(h.size()==26)
		        System.out.println("pangram");
		    else
		        System.out.println("not pangram");
	}

}
