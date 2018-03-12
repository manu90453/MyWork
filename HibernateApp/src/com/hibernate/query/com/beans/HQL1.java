package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQL1 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		//Query query = s.createQuery("from Student");
		//Query query = s.createQuery("select age, fName from Student where age = 23");
		Query query  = s.createQuery("from Student where fName = :abc");
		query.setString("abc", "manish");
		
		List<Student> emp = query.list();
		
		for(Student e: emp) {
    	    //System.out.println(Arrays.toString(e));
			System.out.println(e.getfName());
			System.out.println(e.getlName());
			System.out.println(e.getAge());
     }
	}

}
