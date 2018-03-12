package com.main.java.map;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCheckHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("1", "100");
		Set<String> s = map.keySet();
		for (String key : s) {
			System.out.println("key = " + key + " value = " + map.get(key));
		}
	}

}
