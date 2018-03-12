package com.main.java.concurrency;

public class UseOfVolatile extends Thread{
	private volatile boolean stop = false;
	private long count = 0;
	
	public void run() {
		while(!stop) {
			count++;
		}
		System.out.println("Value = " + count);
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public static void main(String[] args) {
		final UseOfVolatile ob = new UseOfVolatile();
		ob.start();
		
		new Thread() {
			public void run() {
				try {
					Thread.sleep(1000);
					ob.setStop(true);
				} catch(Exception e) {
					
				}
			}
		}.start();
	}
}
