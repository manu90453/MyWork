package com.main.java.hostname;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class HostnameResolution {
	public static void main(String[] args) throws UnknownHostException {
		String hostName = InetAddress.getLocalHost().getHostName();
		System.out.println("Hostname = " + hostName);
		System.out.println("Canonical Hostname = " + InetAddress.getLocalHost().getCanonicalHostName());
		System.out.println("" + InetAddress.getAllByName("localhost"));
		System.out.println("Path = " + System.getProperty("java.class.path"));
		
		URL location = HostnameResolution.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println("Location Based = " + location.getFile());
		
	}
	
	
}
