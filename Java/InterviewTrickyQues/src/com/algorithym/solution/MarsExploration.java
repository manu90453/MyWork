package com.string;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr String");
		String s = "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";//sc.next().toUpperCase();//20
		
		int count = 0;
		for(int i=0; i<s.length(); i+=3) {
			String sos = s.substring(i, i+3);
			System.out.println(sos);
			int change = alterString(sos);
			if(change>0)
				count += change;
		}

		System.out.println(count);
		sc.close();
	}
	
	static int alterString(String s) {
		return s.replaceAll("[SOS]", "").length();
	}
}
