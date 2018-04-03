package com.main.java.gen.basic;

public class Generic<T> {
	
	T t;

	public Generic(T t) {
		this.t = t;
	}
	
	void showTpe() {
		
		System.out.println(t.getClass().getName());
	}
	
	public T getData() {
		return t;
	}
}
