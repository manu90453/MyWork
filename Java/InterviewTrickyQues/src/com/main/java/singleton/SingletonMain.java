package com.main.java.singleton;

public class SingletonMain extends Thread{
	public static void main(String[] args) {
		
		//System.out.println(SimpleSingleton.getInstance());
		//SimpleSingleton.getInstance().singletonMethod(); // Simple one 
	
		// MultiThreading Environment 
		SingletonMain obj1 = new SingletonMain();
		SingletonMain obj2 = new SingletonMain();
		//Thread t1 = new Thread();
		//Thread t2 = new Thread();	
		
		obj1.start();
		obj2.start();
	}
	
	public void run() {
		try {
			System.out.println(SimpleSingleton.getInstance().toString());
			//SimpleSingleton.getInstance().singletonMethod();
			Thread.sleep(100);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
