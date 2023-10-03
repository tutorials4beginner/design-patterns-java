package com.t4b.test.java.dp.sp.bp;

abstract class Shape {
	protected Printer printer;

	protected Shape(Printer p) {
		this.printer = p;
	}

	public abstract void draw();
}
