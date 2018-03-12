package com.omina.service.notification.messaging;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class ContextUtil {
	private static Logger log = Logger.getLogger(ContextUtil.class);
	
	public static Context getInitialContext() throws NamingException {
		log.info("create jndi context");
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		Context context = new InitialContext(props);
		return context;
	}

}
