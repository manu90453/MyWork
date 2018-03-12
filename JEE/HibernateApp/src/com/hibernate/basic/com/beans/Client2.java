package com.beans;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Client2 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session s = sf.openSession();
		
		
		Persons p = null;
		Scanner sc = new Scanner(System.in);
		s.beginTransaction();
		do {
			p = new Persons();
			System.out.println("enter name");
			p.setName(sc.next());
			System.out.println("enter email address");
			p.setEmailAddress(sc.next());
			System.out.println("enter salry");
			p.setSalary(sc.nextInt());
			System.out.println("contact number");
			p.setContactNumber(sc.nextInt());
			System.out.println("enter address");
			p.setAddress(sc.next());
			s.save(p);
			System.out.println("do u want to insert again");
		} while ("y".equalsIgnoreCase(sc.next()));
		
		s.getTransaction().commit();
		s.close();
		System.out.println("done");
		s.save(p);
	}
}
//<property name="hibernate.show_sql">true</property>