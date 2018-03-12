package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SqlNamedQuery {

	public static void main(String[] args) {
		
	Session session=HUtil.getSession("config.xml");
		
		Query query=session.getNamedQuery("sql1");	
		List list=query.list();
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			Object obj[]=(Object[])iterator.next();
			System.out.println("eid: "+obj[0]+" name: "+obj[2]);
			/*Employee emp=(Employee)iterator.next();
			System.out.print(emp.getName());
			System.out.println(emp.getSalary());*/
		}
	}
}
