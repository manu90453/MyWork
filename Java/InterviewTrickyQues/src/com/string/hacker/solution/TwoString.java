package com.string;

import java.util.Scanner;

public class TwoString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of pairs you want to check");
		int totalPair = sc.nextInt();
		String[] strPairArr = new String[totalPair * 2];
		
		for(int i =0; i < strPairArr.length ; i = i + 2) {
		System.out.println("Enter String");
		strPairArr[i] = sc.next();
		System.out.println("Enter String");
		strPairArr[i+1] = sc.next();
		}	
		
		for(int i =0; i < strPairArr.length ; i = i + 2) {
			
		if (compareString(strPairArr, i, i+2)) 
			System.out.println("YES");
		else
			System.out.println("NO");
		}	
		sc.close();
	}
	
	static boolean compareString(String[] arr, int startIndex, int lastIndex) {

		for (int i = startIndex; i < lastIndex-1; i++) {
			for (int k = 0; k < arr[i + 1].length(); k++) {
				if (arr[i].contains(arr[i + 1].substring(k, k + 1))) {
					return true;
				}
			}
		}
		return false;
	}

}
