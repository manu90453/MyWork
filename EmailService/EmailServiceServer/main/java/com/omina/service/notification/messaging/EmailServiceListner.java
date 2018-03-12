package com.omina.service.notification.messaging;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.apache.log4j.Logger;

public class NotificationServiceListener implements MessageListener {
	private static Logger log = Logger.getLogger(NotificationServiceListener.class);
	
	NotificationLocalService notificationLocalService = null;
	
	 public void setNotificationLocalService(NotificationLocalService notificationLocalService) {
		this.notificationLocalService = notificationLocalService;
	}

	@Override
	public void onMessage(Message msg) {
		 
		 System.out.println("on message");
		 MapMessage mapMessage = null;
		 ObjectMessage objMessage = null;
		 
		 try {
			 if(msg instanceof MapMessage) {
				 mapMessage = (MapMessage) msg;
				 
				 String nType = mapMessage.getString(ConstantI.NOTIFICATION_TYPE); 
				 if(nType.equals(ConstantI.JOB_ALERT_NOTIFICATION))
					 jobAlert(mapMessage);
			 }	 
			 
			 
			 else if(msg instanceof ObjectMessage)
				 objMessage = (ObjectMessage)msg;
			 else
				 log.info("Unsupported JMS Type:" + msg.getClass().getName());
				 
			 
		 } catch(Exception ex) {
			 
		 } 
	}
	 
	 private void jobAlert(MapMessage msg) throws JMSException {
		 
		 String url = msg.getString(ConstantI.URL);
		 if(url==null || url.length()<0) {
			 log.error("Error: JobAlert Notification not send, invalid URL");
		 }
		 System.out.println("server side" + url);
		 log.info("URL: " + url);
		
		 notificationLocalService.sendEmail("manish90@amiti.in", "manish.sharma@adesa.com", "My Notification Test", "Hi To All");	 
	 }
}
