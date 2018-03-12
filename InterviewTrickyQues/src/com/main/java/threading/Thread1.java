package com.main.java.threading;

public class Thread1 implements Runnable {
	public void run() {
		System.out.println("Run" + Thread.currentThread());
		throw new RuntimeException("Problem");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Thread1(), "MyThread");
		thread.start();
		System.out.println("End of Program " + Thread.currentThread());
	}
}
