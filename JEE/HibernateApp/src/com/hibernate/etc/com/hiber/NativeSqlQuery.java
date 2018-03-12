package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class NativeSqlQuery {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		/*//SQLQuery sq=session.createSQLQuery("select * from EMPLOYEE");
		SQLQuery sq=session.createSQLQuery("select * from EMPLOYEE").addEntity(Employee.class);
				
		List list=sq.list();
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			/*Object obj[]=(Object[])iterator.next();
			System.out.println("eid: "+obj[0]+" name: "+obj[2]);
			Employee emp=(Employee)iterator.next();
			System.out.print(emp.getName());
			System.out.println(emp.getSalary());
		}*/
		
	}
	
}
