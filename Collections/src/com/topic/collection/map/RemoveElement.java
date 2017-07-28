package com.topic.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("manish", 26);
		map.put("sachin", 45);
		map.put("rahul", 47);
		
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String,Integer> en = iter.next();
			if("rahul".equals(en.getKey()))
				map.remove(en.getKey());
			System.out.println("key: " + en.getKey() + ", Value: " + en.getValue());
		}	
		System.out.println(map);
	}
}
