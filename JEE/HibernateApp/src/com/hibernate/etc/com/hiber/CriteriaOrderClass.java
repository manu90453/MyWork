package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaOrderClass {
 
	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Criteria crt=session.createCriteria(Employee.class);
		//Object obj[]={5000,10000};
		Criterion crit=Restrictions.gt("salary", 7000);
		crt.add(crit);
		crt.addOrder(Order.asc("salary"));
		List list=crt.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Employee emp=(Employee)iter.next();
			System.out.println(emp.getSalary());
			System.out.println(emp.getName());
		}
		session.close();
		HUtil.close();
	}
}
