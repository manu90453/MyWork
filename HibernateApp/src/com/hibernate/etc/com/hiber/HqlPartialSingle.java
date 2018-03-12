package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlPartialSingle {

	public static void main(String[] args) {
		
Session session=HUtil.getSession("config.xml");
		
		Query query=session.createQuery("select e.name from Employee e");
		List list=query.list();
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			String emp=(String)iterator.next();
			System.out.println(emp);
		}
	}
}
