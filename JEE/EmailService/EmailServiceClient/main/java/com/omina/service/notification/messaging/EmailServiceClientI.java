package com.omina.service.notification.messaging;

import javax.jms.JMSException;

public interface NotificationServiceClientI {
	
	public void sendJobAlertNotification(String url) throws JMSException;

}
