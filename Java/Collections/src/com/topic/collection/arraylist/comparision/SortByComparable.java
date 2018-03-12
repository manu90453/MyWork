package com.topic.collection.arraylist.comparision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SortByComparable {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, 2000, "manish", 23);
		Employee emp2 = new Employee(2, 7000, "Anil", 27);
		Employee emp3 = new Employee(3, 5000, "Rishi", 25);
		Employee emp4 = new Employee(4, 11000, "Alok", 24);
		
		ArrayList list = new ArrayList();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, new SalaryComparator());
		 
		System.out.println(list);
	}

}
