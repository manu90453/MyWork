package com.beans;

import org.hibernate.Session;

public class Client1 {
	
	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSession();
		
		Address a1 = new Address();
		a1.setCity("lucknow");
		a1.setState("UP");
		
		Persons p1 = new Persons();
		p1.setId(104);
		p1.setName("manish");
		p1.setAddress(a1);
		
		Persons p2 = new Persons();
		p2.setId(101);
		p2.setName("ABC");
		p2.setAddress(a1);
		
		s.beginTransaction();
		s.save(p1);
		s.save(p2);
		s.getTransaction().commit();
		s.flush();
		s.close();
		
	}

}
