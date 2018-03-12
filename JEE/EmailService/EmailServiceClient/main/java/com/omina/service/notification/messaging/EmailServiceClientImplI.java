package com.omina.service.notification.messaging;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class NotificationServiceClientImp implements NotificationServiceClientI {
	private static Logger log = Logger.getLogger(NotificationServiceClientImp.class);

	InitialContext context = null;
	
	//Queue Releated Object
	Queue queue = null;
	Connection con = null;
	Session session = null;
	ConnectionFactory cf = null;
	MessageProducer producer = null;

	public void init() throws JMSException {
		try {
			Context context = ContextUtil.getInitialContext();
		
			log.info("Looking up queue: ");
			queue = (Queue)context.lookup("queue/" + ConstantI.QUEUE_NAME);
			if(queue == null) {
				log.error("unable to get queue/" + ConstantI.QUEUE_NAME);
				return;
			}
			
			log.info("looking up connection factory: ");
			String factory = "ConnectionFactory";
			cf = (ConnectionFactory)context.lookup(factory);
			if(cf == null) {
				log.error("Unable to create connection");
				return;
			}
			
			log.info("Creating Connection: ");
			con = cf.createConnection();
			if(con == null) {
				log.error("Unable to create connection");
				return;
			}
			
			log.info("Create Session:");
			session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			if(session == null) {
				log.error("unable to create queue session");
				return;
			}
			
			log.info("Creating Producer: ");
			producer = session.createProducer(queue);
			if(producer == null) {
				log.error("unable to create message producer");
			}
			
			System.out.println("Clernt Side");
			
		} catch (NamingException ex) {
			ex.printStackTrace();
		}

	}
	
	public void sendMessage(MapMessage message) throws JMSException {
		if(producer == null) {
			log.error("Unable to send message, invalid producer");
			return;
		}
		producer.send(message);
		System.out.println("client end");
	}
	
	@Override
	public void sendJobAlertNotification(String url) throws JMSException{
		MapMessage msg = session.createMapMessage();
		
		msg.setString(ConstantI.URL, url);
		msg.setString(ConstantI.NOTIFICATION_TYPE, ConstantI.JOB_ALERT_NOTIFICATION);
		
		//Send Message
		sendMessage(msg);
	}
	
	
public static void main(String[] args) throws JMSException {
	NotificationServiceClientImp np = new NotificationServiceClientImp();
	np.init();	
	np.sendJobAlertNotification("WWW.google.com");
	}
}
