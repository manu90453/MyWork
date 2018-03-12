package com.main.java;

public class CompareAndSwap {

}


class MyApp{
	private volatile int count = 0;
	public void updateVisitor() {
		++count;
	}
}