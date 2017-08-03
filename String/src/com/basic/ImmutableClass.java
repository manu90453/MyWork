package com.basic;

final public class ImmutableClass {
	private final int radius;
	private final Point center;
	
	ImmutableClass(int x, int y, int redius) {
		this.radius = redius;
		this.center = new Point(x, y);
	}
	
	public static void main(String[] args) {
		
		ImmutableClass imc = new ImmutableClass(10, 20, 30);
		System.out.println(imc.getCenter());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "center: " + center + ", radius: " + radius;
	}
	
	public Point getCenter() {
		return new Point(center.getPx(), center.getPy());
	}
	
	public int getRadius() {
		return radius;
	}

	public ImmutableClass modifyCenter(int x, int y) {
		
		return new ImmutableClass(x, y, this.radius);
		
	}
}
