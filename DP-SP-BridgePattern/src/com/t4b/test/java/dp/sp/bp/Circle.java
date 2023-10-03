package com.t4b.test.java.dp.sp.bp;

class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, Printer draw) {
		super(draw);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		printer.print(radius, x, y);
	}
}
