package com.method.cloaning;

class D {
	int k;
	public D(int k) {
		this.k = k;
	}
}

public class DeepCopy implements Cloneable {
	
	D d;
	int i;
	
	public DeepCopy(int i, D d) {
		this.d = d;
		this.i = i;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
	    D d1 = new D(20);
		DeepCopy dc = new DeepCopy(10,d1);
		
		DeepCopy dcClone  = (DeepCopy)dc.clone();
		
		System.out.println(dc.i);
		System.out.println(dc.d.k);
		
		dc.d.k=89;
		System.out.println(dcClone.i);
		System.out.println(dcClone.d.k);
		
		System.out.println(dc.d.hashCode());
		
		System.out.println(dcClone.d.hashCode());
	}
}
