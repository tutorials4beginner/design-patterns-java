package com.t4b.test.java.dp.cp.pp;

class RectangleShape extends Shape {

	public RectangleShape() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("I am in RectangleShape.");
	}
}