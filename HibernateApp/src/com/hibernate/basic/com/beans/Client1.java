package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client1 {

	public static void main(String[] args) {
	
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		Persons p1 = new Persons();
		
		p1.setName("manish");
		p1.setAddress("btm");
		p1.setEmailAddress("manish@amiti.in");
		p1.setContactNumber(9889999);
		p1.setSalary(10002);
		
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}

}
