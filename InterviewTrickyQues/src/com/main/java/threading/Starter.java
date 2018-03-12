package com.main.java.threading;

public class Starter extends Thread{
	private int x  = 2;
	public static void main(String args[]) throws Exception {
		new Starter().makeItSo();
	}
	
	public Starter() {
		x = 5;
		start();
	}
	
	public void makeItSo() throws Exception {
		//join();
		x = x - 1;
		System.out.println("x = " + x + "  " + Thread.currentThread());
		sleep(10000);
	}
	
	public void run() {
		x *= 2;  // 5, 10
	}
}
