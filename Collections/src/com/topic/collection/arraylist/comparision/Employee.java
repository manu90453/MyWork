package com.topic.collection.arraylist.comparision;

public class Employee implements Comparable {
	
	int eid;
	int salary;
	String name;
	int age;
	
	public Employee(int id, int salary, String name, int ages) {
		this.eid = id;
		this.salary = salary;
		this.name = name;
		this.age = ages;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + eid + ", name: " + name + ", salary: " + salary;
	}
}
