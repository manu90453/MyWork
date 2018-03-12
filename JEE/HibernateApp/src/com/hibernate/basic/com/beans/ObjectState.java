package com.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObjectState {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		//Transient State
		Persons p = new Persons();
        p.setEmailAddress("manish@amiti.in");
        
        s.beginTransaction();
        //Persistent State
         
        //p.setFirstName("sijo");
        s.save(p);
        
        //whatever changes you make after this method is treated as a update statement
        s.getTransaction().commit();
        s.close();
        //Detached State
        
	}

}
