package com.main.java.atomic;

public class AtomicityDemo implements Runnable{
	public static void main(String[] args) {
		Thread myThread = new Thread();
		try {
			myThread.start();
			
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public void run () {
		System.out.println("Run Execut .. ");
		myThread.sleep(1000);
	} 
}
