package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ClientSave {
public static void main(String[] args) {
		
		
		Configuration con = new Configuration();
		con.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session s = sf.openSession();
		
        Persons p1 = new Persons();
        
	    p1.setPid(112);
		p1.setName("manish");
		p1.setAddress("btm");
		p1.setEmailAddress("manish@amiti.in");
		p1.setContactNumber(9889999);
		p1.setSalary(12);
		
		s.beginTransaction();
		p1.setSalary(15522);
		//int nuber = (int)s.save(p1);  //same using hbm2.ddl update
		s.persist(p1);
		//System.out.println(nuber);
		p1.setSalary(15526);
		//p1.setSalary(14555);
		//p1.setSalary(9999);
		
		//p1.setName("sachin");
		s.getTransaction().commit();
		s.flush();
		s.close();
		System.out.println("done");
		
		/*s = sf.openSession();
		Persons p = (Persons) s.get(Persons.class, 4);
		s.close();
		
		s = sf.openSession();
		s.beginTransaction();
		p.setName("rahul");
		s.save(p);
		s.getTransaction().commit();
		s.close();*/
	}
}
