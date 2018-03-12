package com.beans;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ReadAllRow {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		Criteria ctr = s.createCriteria(Student.class);
		List<Student> students = ctr.list();
		for (Student p:students) {
			System.out.println(p.getSid());
			System.out.println(p.getfName());
			System.out.println(p.getlName());
			System.out.println(p.getAge());
		}
		System.out.println("done getting");
	}

}
