package com.main.java.gen.basic;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {
	
	public static void main(String[] args) {
		
		//Store 500 student name
		
		String[] names = new String[500];
		
		names[0] = "Manish";
		names[1] = "Anish";
		//names[2] = 50; Can't Store other than string types data that's why type safe but array have soem disadvantage
		
		ArrayList al = new ArrayList(500);
		al.add("manish");
		al.add("anish");
		al.add(33);// No issue you can any data type value so it's not type safe
		
		String fName = (String)al.get(0);
		String sName = (String)al.get(2); // While retriving data you have to manually cast the data and throw class cast exception
		
		//JDK1.5
		List<String> al1= new ArrayList<>();
		al1.add("manish");
		al1.add("anish");
		//al1.add(33 ); CTE, can add other data type value	
	}
}
