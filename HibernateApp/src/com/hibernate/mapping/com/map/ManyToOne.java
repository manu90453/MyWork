package com.map;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManyToOne {

	public static void main(String[] args) {
		
		Session session=HUtil.getSession("configuration.xml");
		
		 Vendor1 vendor =new Vendor1();
		 
		 vendor.setVendorId(101);
		 vendor.setVendorName("java4s");

		 Customer1 c1=new Customer1();

         c1.setCustomerId(504);
         c1.setCustomerName("customer4");
         c1.setParentObjects(vendor);

         Customer1 c2=new Customer1();
         c2.setCustomerId(505);
         c2.setCustomerName("customer5");
         c2.setParentObjects(vendor);

         Customer1 c3=new Customer1();
         c3.setCustomerId(506);
         c3.setCustomerName("customer6");
         c3.setParentObjects(vendor);           		             

         Transaction tx = session.beginTransaction();

                  session.save(c1);
                  session.save(c2);
                  session.save(c3);

         tx.commit();
         session.close();
         System.out.println("One To Many is Done..!!");
         HUtil.close();

	}
}
