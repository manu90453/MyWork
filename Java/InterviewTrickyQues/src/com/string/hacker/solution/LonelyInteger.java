package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {

	private static int lonelyInteger(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
        System.out.println(Arrays.toString(a));
        int i;
        int temp=0;
		for (i = 0; i < a.length-1; i++) {
			if(temp == a[++i]){
				i--;
				continue;
			}
			if (a[i] == a[++i]) {
				temp = a[i];
				continue;
			}
			return a[i];
		}
		return i==a.length-1?a[i]:-1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enetr array size");
		int n = in.nextInt();
		System.out.println("enter elements in array");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
		in.close();
	}
	

}
