package com.thread;

class Para {
	public void process() {
	     System.out.print("A,");
	}     
}
public class Child1 extends Para {
	
	public void process() {
	    super.process();
	    System.out.print("B,");
	}	
	
	public static void main(String[] args) {
		 try {
		 new Child1().process();
		 } catch (Exception e) {
		 System.out.println("Exception");
		 }
   }

}
