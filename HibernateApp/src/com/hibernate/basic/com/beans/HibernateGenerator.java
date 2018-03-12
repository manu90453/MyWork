package com.beans;

import org.hibernate.Session;

public class HibernateGenerator {
	
	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSession();
		
		Persons p1 = new Persons();
		p1.setPid(23);
		p1.setContactNumber(66);
		p1.setName("manish");
		
		Persons p2 = new Persons();
		p2.setContactNumber(999);
		p2.setName("manish");
		
		Employee e1 =new Employee();
		e1.setEid(7);
		e1.setAge(24);
		e1.setName("sijo");
		e1.setDepartment("Imola");
		
		Employee e2 =new Employee();
		e2.setEid(6);
		e2.setAge(25);
		e2.setName("Venkat");
		e2.setDepartment("SI");
		
		s.beginTransaction();
		
		s.save(p1);
		s.save(e1);
		s.save(p2);
		s.save(e2);
		
		s.getTransaction().commit();
		s.close();
		System.out.println("done");
		
	}

}
