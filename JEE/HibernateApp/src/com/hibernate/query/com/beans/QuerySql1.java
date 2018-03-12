package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class QuerySql1 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		String sql1= "select * from employee";
		String sql2= "select * from employee where age = 24";
		
		Query query = s.createSQLQuery(sql2);
		
		List<Object[]> list = query.list();
		
		for(Object[] row:list) {
			
			/*for(Object col:row) {
				
				System.out.println(col);
			}*/
			System.out.println(Arrays.toString(row));
		}
	}

}
