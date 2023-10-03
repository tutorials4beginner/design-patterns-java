package com.t4b.test.java.dp.sp.dp;

abstract class PrinterDecorator implements Printer {
	protected Printer decoratedPrinter;

	public PrinterDecorator(Printer d) {
		this.decoratedPrinter = d;
	}

	public void print() {
		decoratedPrinter.print();
	}
}