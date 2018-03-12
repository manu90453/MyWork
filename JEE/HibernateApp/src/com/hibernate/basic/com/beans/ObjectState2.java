package com.beans;

import org.hibernate.Session;

public class ObjectState2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session s = HibernateUtil.getSession();
		
		Persons p = (Persons)s.get(Persons.class, 9);
		//Provide the deatils to user
		System.out.println(p.getAddress());
		s.close();
		
		s = HibernateUtil.getSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
		s.close();
	}

}
