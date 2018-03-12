package com.main.java;

import java.util.Random;
import java.util.Scanner;

public class RandomEmails {
	    public void generate(String fname, String lname) {
    	Random random = new Random();
    	int number = random.nextInt(1000);
    	String randoms = String.format("%05d", number);

    
    	System.out.println(fname.toLowerCase() + "."
                        + lname.toLowerCase()
                        + randoms
                        + "@students.xyz.edu");
    }	

    
    public static void main(String[] args) {
		RandomEmails ob = new RandomEmails();
		System.out.println("Enter first Name & LastName");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		
		for (int i=0; i<1000; i++) {
			ob.generate(firstName, lastName);
		}
	}
}
