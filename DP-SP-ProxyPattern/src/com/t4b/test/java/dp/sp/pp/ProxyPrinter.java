package com.t4b.test.java.dp.sp.pp;

class ProxyPrinter implements Printer {
	private ConsolePrinter consolePrinter;
	private String fileName;

	public ProxyPrinter(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void print() {
		if (consolePrinter == null) {
			consolePrinter = new ConsolePrinter(fileName);
		}
		consolePrinter.print();
	}
}