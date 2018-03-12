package com.hiber;

import org.hibernate.Session;

public class Load2CompositePk {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		
		Employee emp=new Employee();
		emp.setEid(1);
		emp.setContactNo(90456);
		
		emp=(Employee)session.load(Employee.class, emp);
		System.out.println(emp.getAddress());
		System.out.println(emp.getName());
		session.close();
		HUtil.close();
	}
}
