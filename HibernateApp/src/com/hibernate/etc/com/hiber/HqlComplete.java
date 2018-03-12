package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlComplete {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Query query=session.createQuery("from Employee e");
		List list=query.list();
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Employee emp=(Employee)iterator.next();
			System.out.println(emp.getEid());
			System.out.println(emp.getName());
			System.out.println(emp.getAddress());
			System.out.println(emp.getContactNo());
		}
		session.close();
		HUtil.close();
	}
}
