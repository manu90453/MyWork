package com.thread;

public class IFBLOCK {
	
	public static void main(String[] args) {
		
		int i =1;
		
		if(  i++ == 2 && i == 2) {
			System.out.println(i);
		}
		System.out.println(i);
	}

}
