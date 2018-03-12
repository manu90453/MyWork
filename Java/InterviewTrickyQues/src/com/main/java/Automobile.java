package com.main.java;

public class Automobile {
	private Long count; 
	Automobile() {
		
	}
	
	public void setCount(long count) {
		this.count = count;
	}
	
	public Long getCount() {
		return count;
	}
	
	@SuppressWarnings("finally")
	public int tryCatchTest() {
		try {
			return 0; 
		} catch (Exception ex) {
			return 2;
		}
		finally {
			return 100;
		}
	}
	public static void main(String[] args) {
		Automobile obj = new Automobile();
		/*obj.setCount(new Long(9080));
		System.out.println(obj.getCount());
		Long l = new Long("abc".hashCode()); 
		System.out.println(l);
		try {
		long value = null;
		System.out.println(value);
		} catch (NullPointerException t) {
			System.out.println("Caught " + t.getStackTrace());
		}*/
		
		System.out.println(obj.tryCatchTest());
		
	}
}
