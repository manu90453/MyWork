package com.topic.collection.arraylist;

import java.util.ArrayList;

public class ArrayListSize {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>(2);
		System.out.println(arr.size());
		arr.add("manish");
		arr.add("hitototo");
		arr.add("ggggg");
		arr.add("ujjjj");
		System.out.println(arr);
		System.out.println(arr.size());
		
		
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("manish");
		arr1.add("hitototo");
		arr1.add("ggggg");
		arr1.add("ujjjj");
		System.out.println(arr1);	
		
		System.out.println(arr1.size());
	}
}
