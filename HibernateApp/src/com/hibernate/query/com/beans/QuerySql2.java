package com.beans;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class QuerySql2 {
	
	public static void main(String[] args) {
		
		Session s = ConnectionUtil.getSession();
		
		//String sql1 = "select * from employee where age = ?";
		// when you provide a name to place holder then it repeset as colon
		String sql2 = "select * from employee where NAME = :abc";
		Query query = s.createSQLQuery(sql2);
		
		query.setString("abc", "manish");
		
        List<Object[]> list = query.list();
		
		for(Object[] row:list) {
			
			/*for(Object col:row) {
				
				System.out.println(col);
			}*/
			System.out.println(Arrays.toString(row));
		}
		
	}

}
