package com.beans;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class AddRestriction2 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		Criteria ctr = s.createCriteria(Student.class);
		
		//ctr.add(Restrictions.gt("age", 25));
		Criterion c1 = Restrictions.gt("age", 24);
		Criterion c2 = Restrictions.eq("fName", "ashok");
		
		Criterion c3 = Restrictions.or(c1, c2);
		ctr.add(c3);
		
		List<Student> students = ctr.list();
		for(Student stu: students) {
    	    System.out.println(stu.getSid());
			System.out.println(stu.getfName());
			System.out.println(stu.getlName());
			System.out.println(stu.getAge());
     }
	}

}
