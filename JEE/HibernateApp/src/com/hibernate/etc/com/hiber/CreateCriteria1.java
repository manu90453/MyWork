package com.hiber;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CreateCriteria1 {

	public static void main(String[] args) 
	{
		Session session=HUtil.getSession("config.xml");
		
		Criteria crt=session.createCriteria(Employee.class);
		Criterion cri=Restrictions.ge("salary", 10000);
		crt.add(cri);
		List list=crt.list();
		
		ListIterator li=list.listIterator();
		while(li.hasNext())
		{
			Employee emp=(Employee)li.next();
			System.out.println(emp.getEid());
			System.out.println(emp.getName());
			System.out.println(emp.getContactNo());
		}
		session.close();
		HUtil.close();
		
	}
}
