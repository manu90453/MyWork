package com.tricky.ques.collection;

import java.util.Arrays;
import java.util.Comparator;

public class Comprator1 implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {7,8, 1, 3,};
		
		Arrays.sort(arr, new Comprator1());
		
		System.out.println(Arrays.toString(arr));
		
	}

}
