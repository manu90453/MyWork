package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlDelete {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Query query=session.createQuery("delete from Employee where eid=:id");
		query.setInteger("id", 3);
	    int result=query.executeUpdate();
	    System.out.println("number of record deleted due to query: "+result);
	    session.close();
	    HUtil.close();
	}
}
