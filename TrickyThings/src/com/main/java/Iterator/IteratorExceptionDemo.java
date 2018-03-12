package com.main.java.Iterator;

import java.util.HashMap;
import java.util.Set;

public class IteratorExceptionDemo {
	public static void main(String[] args) {
		
		// HashMap Things
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "One");
		hashMap.put("2", "Two");
		hashMap.put("3", "Three");
		hashMap.put("4", "Four");
		
		System.out.println("I am here");
		Set <String> iterator = hashMap.keySet();
		for (String key : iterator) {
			System.out.println(key + ", " + hashMap.get(key));
			hashMap.replace(key, "Ten");
		}
		
	}
}
