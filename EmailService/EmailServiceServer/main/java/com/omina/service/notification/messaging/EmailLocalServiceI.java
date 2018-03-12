package com.omina.service.notification.messaging;

public interface NotificationLocalServiceI {

	void sendEmail(String from, String to, String subject, String msg);

}
