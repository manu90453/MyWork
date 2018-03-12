package com.hiber;

import org.hibernate.Query;
import org.hibernate.Session;

public class HqlUpdate {

	public static void main(String[] args) {
		
	Session session=HUtil.getSession("config.xml");
		
		Query query=session.createQuery("update Employee e set e.address=?");
		query.setString(0, "update");
	    int result=query.executeUpdate();
	    System.out.println("number of record affected due to update query: "+result);
	    session.close();
	    HUtil.close();
	}
}
