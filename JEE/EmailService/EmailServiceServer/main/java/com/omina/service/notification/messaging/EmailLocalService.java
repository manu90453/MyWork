package com.omina.service.notification.messaging;

import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class NotificationLocalService implements NotificationLocalServiceI {
	private static Logger log = Logger.getLogger(NotificationLocalService.class);
	
	JavaMailSender emailSender = null;
	
	public void setEmailSender(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}



	@Override
	public void sendEmail(String from, String to, String subject, String msg) {
		
		try{
			
			String host = "smtp.gmail.com";
	        String pass = "pass";
	        Properties props = System.getProperties();
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.user", from);
	        props.put("mail.smtp.password", pass);
	        props.put("mail.smtp.port", "465");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.debug", "true");
	        props.put("mail.smtp.starttls.enable", true);
	        props.put("mail.smtp.socketFactory.port", "465");
	        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	        props.put("mail.smtp.socketFactory.fallback", "false");
	         
			System.out.println("inside local service");
			MimeMessage message = emailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message, "UTF-8");
			
	        helper.setTo(to);
	        helper.setFrom(from);
	        helper.setSubject(subject);
	        helper.setText(msg);
			
			System.out.println("Local service send message");
			emailSender.send(message);	
		} catch(Exception ex) {
			ex.printStackTrace();	
		}
		
		
		
	}
	
	

}
