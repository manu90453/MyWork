package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientGet {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		
		Session s1 = sf.openSession();
		
		Persons p1 = (Persons)s1.load(Persons.class, 123);
		//System.out.println(p1);
		System.out.println(p1.getName());
		
	}
}
