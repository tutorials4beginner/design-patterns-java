package com.t4b.test.java.dp.cp.pp;

class CircleShape extends Shape {

	public CircleShape() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("I am in CircleShape.");
	}
}