package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ClientUpdate {
	
	public static void main(String[] args) {
	
	Configuration con = new Configuration();
	con.configure();
	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf = con.buildSessionFactory(sr);
	Session s = sf.openSession();
	
    Persons p1 = new Persons();
	
    p1.setPid(123);
	p1.setName("manish");
	p1.setAddress("btm");
	p1.setEmailAddress("manish@amiti.in");
	p1.setContactNumber(9889999);
	p1.setSalary(10002);
	
	s.beginTransaction();
	p1.setSalary(15522);
	s.saveOrUpdate(p1);  //same using hbm2.ddl update
	
	p1.setSalary(15522);
	p1.setSalary(14555);
	p1.setSalary(1556);
	//p1.setName("sachin");
	s.getTransaction().commit();
	s.flush();
	s.close();
	System.out.println("done");
}
}


