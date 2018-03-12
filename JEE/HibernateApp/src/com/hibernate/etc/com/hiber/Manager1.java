package com.hiber;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1 {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("config.xml");
		Scanner sc=new Scanner(System.in);
		String decider;
		Employee  emp;
		do
		{
			emp=new Employee();
		   System.out.println("eneter eid:");
           emp.setEid(sc.nextInt());
           System.out.println("enter Name");
		   emp.setName(sc.next());
		   System.out.println("enter address");
		   emp.setAddress(sc.next());
		   System.out.println("enter your mobile no:");
		   emp.setContactNo(sc.nextInt());
		   System.out.println("enter salary");
		   emp.setSalary(sc.nextInt());
		
		   Transaction tx=session.beginTransaction();
		   session.save(emp);
		   tx.commit();
		   System.out.println("do you want again(Y/N)");
		   decider=sc.next();
		}while(decider.equalsIgnoreCase("y"));
		   session.close();
		   HUtil.close();
	}
}
