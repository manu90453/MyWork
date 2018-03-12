package com.main.java.threading;

public class ThreadMain implements Runnable {
	public static void main(String[] args) {
		ThreadMain obj = new ThreadMain();
		Thread t1 = new Thread(obj); 
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
		
	}
	
	public void run() {
		System.out.println("Hello Workd ...");
		try {
			Thread.sleep(10000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

