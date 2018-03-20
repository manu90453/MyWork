package com.main.java.impl.array;
/* Print Given array in spiral form
 * Input:  1 2 3
 *         4 5 6
 *         7 8 9
 * Output: 1, 2, 3, 6, 9, 8, 7, 4, 5, 6*/

public class SpiralForm {
	
	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, { 4,5,6},{7,8,9}};
		
		SpiralForm sf = new SpiralForm();
		System.out.println(sf.printSpiral(arr));
		
	}
	String printSpiral(int[][] input) {
		
		StringBuilder sb = new StringBuilder();
		int length = input.length;
		int k = 0;
		for(int i=0; i<length; i++) {
			for(int j= 0; j<length;j++) {
				if(k==length-1) {
					sb.append(input[i][k]);
					k++;
				}
			}
		}
		return null;
	}

}
