package com.main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicateInArrayList {
	public void countDuplicates(List<String> myList){
		Map<String, Integer> nameAndCount = new HashMap<>();
		Integer count = 0;
		for (String obj : myList) {
			count = nameAndCount.get(obj);
			if (count == null) 
				nameAndCount.put(obj, 1);
			else 
				nameAndCount.put(obj, ++count);
		}
		
		System.out.println("Map = " + nameAndCount);
		
	}
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Hello");
		myList.add("Hello");
		myList.add("Sudip");
		myList.add("Sudip");
		myList.add("Amiti");
		myList.add(null);
		myList.add("Openlane");
		myList.add("Adesa");
		myList.add(null);		
		CountDuplicateInArrayList obj = new CountDuplicateInArrayList();
		obj.countDuplicates(myList);
		
		long list [] = {1,1,3,3, 9,8,5,2,7,9,3};
		obj.countDuplicates(list);
	}
	
	//Count Duplicate Occurrence without using inbuilt functions
	public void countDuplicates(long[] myList) {
		long size = myList.length;
		int count = 1;
		long prev = myList[0];
		for (int i=1; i<size; i++) {
			if (prev == myList[i]) {
				count++;
			} else {
				System.out.println(prev + " = " + count);
				prev = myList[i];
				count = 1;
			}
				
		}
		System.out.println(prev + " = " + count);
	}
	
	
	
}
