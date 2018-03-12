package com.javacodegeeks.examples;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.NamingException;

public class HelloWorldProducer {
	
	public static void main(String[] args) throws JMSException {
		
		Connection con = null;
		try {
			System.out.println("Crate JNDI Context");
			Context context = ContextUtil.getInitialContext();
			
			System.out.println("Get Connection Factory");
			ConnectionFactory cf = (ConnectionFactory)context.lookup("ConnectionFactory");
			
			System.out.println("create connection");
			con = cf.createConnection();
			
			System.out.println("create session");
			Session session = con.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			
			System.out.println("lookup queue");
			Queue queue = (Queue) context.lookup("queue/HelloWorldQueue");
			
			System.out.println("start connection");
			con.start();
			
			System.out.println("create producer");
			MessageProducer producer = session.createProducer(queue);
			
			System.out.println("create hello world message");
			Message message = session.createTextMessage("Hey, I am Manish Sharma");
			
			System.out.println("send hello world message");
			producer.send(message);
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		} finally {
			if (con != null) {
				System.out.println("close connection");
				con.close();
			}
		}
	}

}
