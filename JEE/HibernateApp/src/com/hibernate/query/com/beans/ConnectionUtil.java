package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ConnectionUtil {
	
	static SessionFactory sf = null;
	
	static {
		
		Configuration con = new Configuration();
		con.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		sf = con.buildSessionFactory(sr);
		
	}
	
	SessionFactory sf1 = new Configuration().configure("oracle.cfg.xml").buildSessionFactory();
	SessionFactory sf2 = new Configuration().configure("mysql.cfg.xml").buildSessionFactory();
	
	static Session getSession() {
		return sf.openSession();
	}

}
