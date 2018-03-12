package com.pattern.singleton;

public class Singleton extends Object{

	private static Singleton soleInstance = null;
	private Singleton() {
		if(soleInstance != null) {
			throw new RuntimeException("You can't create extension with Reflection");
		}
		System.out.println("Singleton object is created");
	}
	public static Singleton getInstance() {
		if(soleInstance == null) {
			soleInstance = new Singleton();
		}
		return soleInstance;
	}
	
	public static void print(String name, Object obj) {
		System.out.println(String.format("Object: %s, Hascode: %d", name, obj.hashCode()));
	}
}
