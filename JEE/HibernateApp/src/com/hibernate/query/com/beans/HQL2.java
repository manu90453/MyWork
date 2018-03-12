package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQL2 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		//Query query = s.createQuery("select age from Employee where age = 24");
		Query query = s.createQuery("select name, age from Employee where age = 24");
		
		List<Object[]> emp = query.list();
		
		/*for(Object[] e: emp) {
    	    System.out.println(e.getEid());
			System.out.println(e.getName());
			System.out.println(e.getDepartment());
			System.out.println(Arrays.toString(e));
     }*/
		
          for(Object[] row:emp) {
			
			for(Object col:row) {
				
				System.out.println(col);
			}
		}
	}
}
