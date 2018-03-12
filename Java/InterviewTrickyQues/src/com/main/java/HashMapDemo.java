package com.main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("Emp_01", "Ramdas");
		hash.put("Emp_02", "Kalidas");
		hash.put("Emp_03", "Haridas");	
		
		Set<String> s = hash.keySet();
		
		for (String str: s) {
			System.out.println("Value of  " + str + " is " + hash.get(str));
		}
		
		Set<Long> set = new HashSet<Long>();
		set.add(new Long(89));
		set.add(new Long(90));
		
		System.out.println("End " + set);
		
	}
}
