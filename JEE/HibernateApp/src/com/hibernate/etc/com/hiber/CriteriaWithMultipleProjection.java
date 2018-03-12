package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class CriteriaWithMultipleProjection {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Criteria crit=session.createCriteria(Employee.class);
		ProjectionList pl=Projections.projectionList();
		pl.add(Projections.property("name"));
		pl.add(Projections.property("salary"));
		crit.setProjection(pl);
		List list=crit.list();
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			Object obj[]=(Object[])iter.next();
			System.out.println("name: "+obj[0]+"  salary: "+obj[1]);
		}
	}
}
