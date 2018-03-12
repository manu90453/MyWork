package com.omina.service.notification.messaging;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class NotificationService {
	private static Logger log = Logger.getLogger(NotificationService.class);
	
     InitialContext context = null;
	
	//Queue Releated Object
	Queue queue = null;
	Connection con = null;
	Session session = null;
	ConnectionFactory cf = null;
	MessageConsumer consumer = null;
	
	NotificationServiceListener notificationListener = null;

	public void setNotificationListener(NotificationServiceListener notificationListener) {
		this.notificationListener = notificationListener;
	}

	public static void main(String[] args) throws JMSException {
		System.out.println("start");
		ApplicationContext context = new ClassPathXmlApplicationContext("notification-spring.xml");
		NotificationService ns = (NotificationService)context.getBean("notificationservice");
		ns.start();
	}
	
	public void start() throws JMSException {
		
		try {
			System.out.println("statete ");
			context = (InitialContext)ContextUtil.getInitialContext();

			log.info("Create Connection Factory");
			cf = (ConnectionFactory) context.lookup("ConnectionFactory");

			log.info("create connection");
			con = cf.createConnection();
			
			log.info("looking up queue");
			queue = (Queue) context.lookup("queue/" + ConstantI.QUEUE_NAME);

		    log.info("create queue Session");
			Session session = con.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);

			log.info("create consumer");
			consumer = session.createConsumer(queue);

			consumer.setMessageListener(notificationListener);
			con.start();
			System.out.println("end Start");

		} catch(NamingException ex) {
			ex.printStackTrace();
		} finally {
			if (con != null) {
				System.out.println("close connection");
				con.close();
			}
		}
	}

}
