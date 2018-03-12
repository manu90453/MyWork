package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class NamedQuerySql {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		
		Query q = s.getNamedQuery("sql1");
		
		List<Object[]> list = q.list();

		/*for(Employee emp:list) {
			System.out.println(emp.getAge());
		}*/
         for(Object[] row:list) {
			
			/*for(Object col:row) {
				
				System.out.println(col);
			}*/
			System.out.println(Arrays.toString(row));
		}
	}

}
