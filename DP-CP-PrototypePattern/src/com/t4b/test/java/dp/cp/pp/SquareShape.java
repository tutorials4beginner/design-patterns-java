package com.t4b.test.java.dp.cp.pp;

class SquareShape extends Shape {

	public SquareShape() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("I am in SquareShape.");
	}
}