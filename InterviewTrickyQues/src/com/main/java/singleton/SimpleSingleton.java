package com.main.java.singleton;

public class SimpleSingleton {
	private static SimpleSingleton instance;// = new SimpleSingleton();
	private SimpleSingleton() {
		System.out.println("Constructor Called, Object Created ...");
	}
	
	public static SimpleSingleton getInstance() {
		
		synchronized (instance) {
			if (instance != null) {
				instance = new SimpleSingleton();
			}
		}
		//return instance != null ? instance : new SimpleSingleton();
		return instance;
	}
	
	public String toString() {
		return "Instance = " + instance;		
	}
	
	public void singletonMethod () {
		System.out.println("Singleton Method Called");
	}

}




