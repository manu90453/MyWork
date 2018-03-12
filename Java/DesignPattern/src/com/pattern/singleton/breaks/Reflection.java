package com.pattern.singleton.breaks;

import java.lang.reflect.Constructor;

import com.pattern.singleton.Singleton;

public class Reflection {
	
	public static void main(String[] args) throws Exception {
		
		Class clas = Class.forName("com.pattern.singleton.Singleton");
		
		Constructor<Singleton> cons = clas.getDeclaredConstructor();	
		cons.setAccessible(true);
		Singleton s3 = cons.newInstance();
		
		Singleton.print("s3", s3);
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Singleton.print("s1", s1);
		Singleton.print("s2", s2);
		

		
	}

}
