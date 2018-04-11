package com.java.main.objective.ques;

import java.io.IOException;

class Paraent {
	void m1() throws ArithmeticException, IOException{
		System.out.println("paraent");
	}
}

class child extends Paraent {
	void m1() {
		System.out.println("Child");
	}
}
public class ExceptionHir1 {
	public static void main(String[] args) {
		Paraent p = new child();
		try {
			p.m1();
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}
	}

}
