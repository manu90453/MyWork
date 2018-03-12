package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class CriteriaProjectionPartial {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Criteria crit=session.createCriteria(Employee.class);
		Projection proj1=Projections.property("salary");
	
		//Projection proj2=Projections.property("contactNo");
		crit.setProjection(proj1);
		//crit.setProjection(proj2);
		List list=crit.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			//Employee emp=(Employee)iter.next();
			//System.out.println(emp.getName());
			//System.out.println(emp.getSalary());
		}
		session.close();
		HUtil.close();
	}
}
