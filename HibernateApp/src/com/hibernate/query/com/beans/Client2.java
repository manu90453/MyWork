package com.beans;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Client2 {

	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		Employee p = null;
		Scanner sc = new Scanner(System.in);
		s.beginTransaction();
		do {
			p = new Employee();
			System.out.println("enter age");
			p.setAge(sc.nextInt());
			System.out.println("enter name");
			p.setName(sc.next());
			System.out.println("enter department");
			p.setDepartment(sc.next());
			s.save(p);
			System.out.println("do u want to insert again");
		} while ("y".equalsIgnoreCase(sc.next()));
		
		s.getTransaction().commit();
		s.close();
		System.out.println("done");
	}
}
