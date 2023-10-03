package com.t4b.test.java.dp.sp.dp;

class Printer3D extends PrinterDecorator {
	public Printer3D(Printer decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void print() {
		System.out.println("3D.");
		decoratedPrinter.print();
	}
}