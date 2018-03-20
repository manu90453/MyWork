package com.main.java.impl.array;

/* Rotate Array 90 degree clockwise and anticlockwise*/

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter way of rotation, If clockwise enter CW or anti clock wise ACW: ");
		boolean rotation = sc.next().equalsIgnoreCase("CW")? true:false;
		int[][] arr = { {1,2,3}, { 4,5,6},{7,8,9}};
		
		RotateMatrix rm = new RotateMatrix();
		System.out.println(Arrays.deepToString(rm.rotate(arr, rotation)));
		sc.close();
	}
	
	int[][] rotate(int[][] inputArr, boolean rotation) {
		int length = inputArr.length;
		int[][] temp = new int[length][length];
		for(int i=0; i < length; i++) {
			int index = length-1;
			for(int j=0; j<length; j++) {
				if(rotation) {
					temp[i][j] = inputArr[index--][i];
				} else {
					
					temp[j][i] = inputArr[i][index--];
				}
			}
		}
		return temp;
	}
}
