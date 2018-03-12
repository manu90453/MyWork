package com.hiber;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CompositePK {

      public static void main(String[] args) {
		
    	  Session session=HUtil.getSession("config.xml");
    	  
    	  Employee emp=new Employee();
    	  emp.setEid(5);
    	  emp.setName("Rahul dravid");
    	  emp.setAddress("Banaglore");
    	  emp.setContactNo(98980);
    	  Transaction tr=session.beginTransaction();
    	  session.save(emp);
    	  tr.commit();
    	  session.close();
    	  HUtil.close();
	}
}
