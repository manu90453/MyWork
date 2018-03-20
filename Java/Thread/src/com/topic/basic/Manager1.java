package com.topic.basic;

class Thread1 extends Thread {
	@Override
	public void run() {
		Thread thread1 = Thread.currentThread();
		System.out.println("thread Name: "+ thread1.getName());
		System.out.println("thread1 priority: " + thread1.getPriority());
		thread1.setPriority(8);
		System.out.println("thread1 priority: " +thread1.getPriority());
		Thread2 thread2 = new Thread2();
		thread2.start();
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		Thread thread2 = Thread.currentThread();
		System.out.println("thread Name: " + thread2.getName());
		System.out.println("thread2 priority:" + thread2.getPriority());
	}
}

public class Manager1 extends Thread{
	
	public static void main(String[] args) {
		Thread11 thread1 = new Thread11();
		thread1.start();
		Thread main = Thread.currentThread();
		System.out.println("thread Name: " + main.getName());
		System.out.println("main thread priority:" + main.getPriority());
	}
	

}
