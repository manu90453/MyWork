package com.main.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class InsertArrayElemInMapValue {
	public static void main(String[] args) {
		Map<Long, Long> dummy = new HashMap<Long, Long>();
		Map<Long, Long[]> myMap = new HashMap<Long, Long[]>();
		dummy.put(8L, 900L);
		for(long i=1; i<5; i++) {
			Long[] vehicles = new Long[5];
			vehicles = generateRendomNumbers();
			myMap.put(i, vehicles);
		}
		
		//Getting 
		Set<Long> set = myMap.keySet();
		for (Long key : set) {
			System.out.print("Key = " + key + " Value = [");
			Long [] vehicles = myMap.get(key);
			for(int i=0; i<vehicles.length; i++ ){
				if (i != vehicles.length-1)
					System.out.print(vehicles[i] + ",");
				else
					System.out.print(vehicles[i] + "]");
			}
			System.out.println();
		}
		
	} //main
	
	private static Long[] generateRendomNumbers() {
		Long[] numbers = new Long[5];
		Random rand = new Random();
		for (int i=0; i<5; i++)
			numbers[i] = (long)rand.nextInt(1000 - 100 + 1);
		
		return numbers;
	}

}
