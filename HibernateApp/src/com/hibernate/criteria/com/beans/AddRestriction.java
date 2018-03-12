package com.beans;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class AddRestriction {

	public static void main(String[] args) {
		
    Session s = ConnectionUtil.getSession();
     Criteria ctr = s.createCriteria(Student.class);
     //ctr.add(Restrictions.like("lName", "%s%"));
     //ctr.add(Restrictions.eq("fName", "manish"));
     ctr.add(Restrictions.between("age", 23, 30));
     
     List<Student> students = ctr.list();
     for(Student stu: students) {
    	    System.out.println(stu.getSid());
			System.out.println(stu.getfName());
			System.out.println(stu.getlName());
			System.out.println(stu.getAge());
     }
	}

}
