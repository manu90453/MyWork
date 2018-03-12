package com.javacodegeeks.examples;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.NamingException;

public class HelloWorldConsumer implements MessageListener {
	
	public static void main(String[] args) throws NamingException, JMSException {
		
		Connection con = null;
		
		try {
			System.out.println("create JNDI context");
			Context context = ContextUtil.getInitialContext();
			
			System.out.println("Get Connection Factory");
			ConnectionFactory cf = (ConnectionFactory) context.lookup("jms/RemoteConnectionFactory");
			
			System.out.println("create connection");
			con = cf.createConnection();
			
			System.out.println("create session");
			Session session = con.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);
			
			String appName = (String) context.lookup("java:app/AppName");
			System.out.println(appName);
			System.out.println("Lookup queue");
		    Queue queue = (Queue) context.lookup("queue/HelloWorldQueue");
		    
		    System.out.println("Start connection");
		    con.start();
		    
		    System.out.println("create consumer");
		    MessageConsumer consumer = session.createConsumer(queue);
		    
		    System.out.println("set message listener");
		    consumer.setMessageListener(new HelloWorldConsumer());
		} finally {
			if (con != null) {
				System.out.println("close connection");
				con.close();
			}
		}
	}
	
	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("Message received");
			System.out.println(((TextMessage)message).getText());
		}catch (JMSException ex) {
			ex.printStackTrace();
		}
		
		
	}
}
