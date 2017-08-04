package com.method.cloaning;

public class ShallowCopy implements Cloneable {
	
	D d;
	int n;
	
	public ShallowCopy(int n, D d) {
		this.n = n;
		this.d = d;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		D d = new D(12);
		ShallowCopy sh = (ShallowCopy)obj;
		sh.d = d;
		return sh;
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		D d1 = new D(20);
		ShallowCopy sc = new ShallowCopy(10,d1);
		
		ShallowCopy scClone  = (ShallowCopy)sc.clone();
		
		System.out.println(sc.n);
		System.out.println(sc.d.k);
		
		sc.d.k=89;
		System.out.println(scClone.n);
		System.out.println(scClone.d.k);
		
		System.out.println(sc.d.hashCode());
		
		System.out.println(scClone.d.hashCode());
	}

}
