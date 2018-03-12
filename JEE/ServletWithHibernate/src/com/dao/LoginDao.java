package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.hibernate.HUtil;

public class LoginDao {
      
	public static boolean veriftLoginData(String userName,String password)
	{
		Session session=HUtil.getSession("config.xml");
		
		System.out.println(userName);
		SQLQuery sq=session.createSQLQuery("select EMAIL,PASSWORD from USER_INFO where EMAIL='"+userName+"' and PASSWORD='"+password+"'");
		List list=sq.list();
		Iterator iterator=list.iterator();
		boolean flag=false;
		//System.out.println(password);
		while(iterator.hasNext())
		{
			Object obj[]=(Object[])iterator.next();
			//System.out.println(obj[0]);
			if(userName.contains((String)obj[0]) && password.contains((String)obj[1]))
			{
				flag=true;
			}
		}
		session.close();
		HUtil.close();
		return flag;
	}
}
