package com.topic.collection.arraylist.comparision;

import java.util.Comparator;

public class SalaryComparator implements Comparator {
	
	@Override
	public int compare(Object arg0, Object arg1) {
		return ((Employee)arg0).salary-((Employee)arg1).salary;
	}

}
