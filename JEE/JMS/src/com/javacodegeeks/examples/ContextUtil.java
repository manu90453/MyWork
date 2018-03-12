package com.javacodegeeks.examples;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ContextUtil {

	public static Context getInitialContext() throws NamingException {	
/*        Properties properties = new Properties();
        // properties.put(javax.naming.Context.SECURITY_PRINCIPAL, "guest");
        // properties.put(Context.SECURITY_CREDENTIALS, "guestpassw");
        properties.put(InitialContext.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        properties.put(InitialContext.PROVIDER_URL, "localhost:1099");
        properties.put(InitialContext.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
      //  properties.put("jboss.naming.client.connect.options.org.xnio.Options.SASL_POLICY_NOPLAINTEXT", "false");
        //properties.put(Context.SECURITY_PRINCIPAL, "msharma");
        // properties.put(Context.SECURITY_CREDENTIALS, "MSsh@90453");
        //properties.put("jboss.naming.client.ejb.context", "false");
        InitialContext context = new InitialContext(properties);*/
		
		
		Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
        props.setProperty("java.naming.factory.url.pkgs", "org.jnp.interfaces");
	    props.setProperty("java.naming.provider.url", "localhost:1099");
	    Context context = new InitialContext(props);
	    return context;

	}

}
