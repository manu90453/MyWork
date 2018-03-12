package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HUtil 
{
	static SessionFactory factory;
   public static Session getSession(String xml)
   {
	   Configuration config=new Configuration();
	   config.configure(xml);
	   factory=config.buildSessionFactory();
	   return factory.openSession();
   }
   public static void close()
   {
	   factory.close();
   }
}
