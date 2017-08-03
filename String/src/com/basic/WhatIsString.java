package com.basic;
/* String object backed by char array
 * String object created in special memory space called String pool 
 * in Permgen memory space where prmgen is method area in JVM
 * From Jdk 1.8 String pool is created in Heap*/
public class WhatIsString {
	
	public static void main(String[] args) {
		
		String s1 = "manish";// Cached in the string pool and this approach of creating string call string literal
		
		String s2 = new String("manish");// String object through constructor
		
		System.out.println(s1==s2);		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2.intern());
		
		//Why String immutable
		String name1 = "Akash"; // String hashcode cached
		String name2 = "Akash"; // thread safe
		
		name2.toUpperCase();// if string in not immutable then name1 also changed
		
		ImmutableClass im = new ImmutableClass(23, 25, 27);
		
		System.out.println(im.toString());
		System.out.println(im.hashCode());
		
		ImmutableClass c = im.modifyCenter(32, 33);
		
		System.out.println(c.toString());
		System.out.println(c.hashCode());
	}
}
