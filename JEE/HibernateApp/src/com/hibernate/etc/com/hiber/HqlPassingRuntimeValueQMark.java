package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlPassingRuntimeValueQMark {

      public static void main(String[] args) {
    	   Session session=HUtil.getSession("config.xml");
   		
   		Query query=session.createQuery("from Employee e where e.address= ?");
   		query.setParameter(0, "Mumbai");
   		List list=query.list();
   		Iterator iterator=list.iterator();
   		while(iterator.hasNext())
   		{
   			Employee emp=(Employee)iterator.next();
   			System.out.println(emp.getAddress());
   			System.out.println(emp.getContactNo());
   			System.out.println(emp.getName());
   			System.out.println(emp.getEid());
   		}
   		session.close();
   		HUtil.close();
	}
}
