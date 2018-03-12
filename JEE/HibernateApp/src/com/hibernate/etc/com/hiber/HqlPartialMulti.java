package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlPartialMulti {

	public static void main(String[] args) {
		
Session session=HUtil.getSession("config.xml");
		
		Query query=session.createQuery("select e.eid,e.name from Employee e");
		List list=query.list();
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Object[] obj=(Object[])iterator.next();
			System.out.println("Employee id: "+obj[0]+"  Employee name: "+obj[1]);
		}
		session.close();
		HUtil.close();
	}
}
