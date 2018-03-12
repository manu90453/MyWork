package com.method;

public class FinalizeMethod {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Calling finalize method");
	}
	
	public static void main(String[] args) {
		FinalizeMethod fm = new FinalizeMethod();

		//First way to get abundant object
		//fm = null;
		
		//Second Way
		FinalizeMethod fm1 = new FinalizeMethod();
		FinalizeMethod fm2 = new FinalizeMethod();
		
		//fm2 = fm1;
		
		//Third way object create inside method
		fm.printName();
		
		//Anonymous object
		System.gc();
	}
	
	void printName() {
		
		FinalizeMethod fm3 = new FinalizeMethod();
		System.out.println("Manish");
	}

}
