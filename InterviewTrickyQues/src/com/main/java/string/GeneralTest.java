package com.main.java.string;

public class GeneralTest {
	public static void main(String[] args) {
		String s1 = "IBM";
		String s2 = "IBM";
		String s3 = new String("IBM");
		String s4 = new String("IBM");
		System.out.println("(s1 == s2) :: " + (s1==s2 ? "True" : "False") + "   " + s1.hashCode() + "**" + s2.hashCode());
		System.out.println("s1.equals(s2) :: " + s1.equals(s2) + "   " + s1.hashCode() + "**" + s2.hashCode());
		System.out.println("(s1 == s3) :: " + (s1==s3 ? "True" : "False") + "   " + s1.hashCode() + "**" + s3.hashCode());
		System.out.println("s1.equals(s3) :: " + s1.equals(s3) + "   " + s1.hashCode() + "**" + s3.hashCode());
		System.out.println("(s3 == s4) :: " + (s3 == s4 ? "True" : "False") + "   " + s3.hashCode() + "**" + s4.hashCode());
		System.out.println("s3.equals(s4) :: " + s3.equals(s4) + "   " + s3.hashCode() + "**" + s4.hashCode());
		String s5 = new String("Sudip");
		System.out.println("s5 = " + s5 + "  " + s5.hashCode());
		Integer i1 = 128;//new Integer(100);
		Integer i2 = 128;//new Integer(100);
		System.out.println("i1 = " + i1.hashCode());
		System.out.println("i2 = " + i2.hashCode());
		System.out.println("(i1 == i2) :: " + (i1==i2 ? "True" : "False") + "   " + i1.hashCode() + "**" + i2.hashCode());
	}

}
