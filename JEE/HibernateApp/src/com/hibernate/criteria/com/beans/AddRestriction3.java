package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class AddRestriction3 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		Criteria ctr = s.createCriteria(Student.class);
		
		Criterion c1 = Restrictions.eq("fName", "ashok");
		Criterion c2 = Restrictions.gt("age", 21);
		
		ctr.add(c1).add(c2);
		
		List<Student> list = ctr.list();
		
		for(Student stu: list) {
    	    System.out.println(stu.getSid());
			System.out.println(stu.getfName());
			System.out.println(stu.getlName());
			System.out.println(stu.getAge());
     }
		
		/*for(Object[] obj: list) {
			System.out.println(Arrays.toString(obj));
		}*/
		
	}

}
