package com.thread;

class PingPong2 {
 synchronized void hit(long n) {
 for(int i = 1; i < 3; i++)
 System.out.print(n + "-" + i + " ");
}
}

public class Tester implements Runnable {
	
	static PingPong2 pp2 = new PingPong2();
	 public static void main(String[] args) {
	 new Thread(new Tester()).start();
	 new Thread(new Tester()).start();
	 }
	 public void run() {
		 System.out.println(Thread.currentThread());
		 System.out.println(Thread.currentThread().getId());
		 pp2.hit(Thread.currentThread().getId()); 
	
	}
}
