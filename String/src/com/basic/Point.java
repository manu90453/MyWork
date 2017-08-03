package com.basic;

public class Point {
	
	int px, py;
	
	Point(int px, int py) {
		this.px = px;
		this.py = py;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point px: " + px + ", point py: " + py;
	}
	
	public int getPx() {
		return px;
	}
	
	public int getPy() {
		return py;
	}
}
