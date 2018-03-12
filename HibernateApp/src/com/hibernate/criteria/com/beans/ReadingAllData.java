package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ReadingAllData {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session s = sf.openSession();
		
		Student stu = new Student();
		stu.setfName("manish");
		stu.setlName("sharma");
		stu.setAge(45);
		
		s.beginTransaction();
		s.save(stu);
		s.getTransaction().commit();
		s.close();
		System.out.println("done");
	}

}
