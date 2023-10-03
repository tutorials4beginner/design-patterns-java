package com.t4b.test.java.dp.sp.pp;

class ConsolePrinter implements Printer {
	private String fileName;

	public ConsolePrinter(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void print() {
		System.out.println("Displaying " + fileName);
	}
}