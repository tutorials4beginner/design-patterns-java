package com.t4b.test.java.dp.sp.pp;

public class TestMain {

	public static void main(String[] args) {
		Printer printer = new ProxyPrinter("test");
		printer.print();
		
	}
}