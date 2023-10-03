package com.t4b.test.java.dp.sp.dp;

public class TestMain {
	public static void main(String[] args) {
		Printer plasticPrinter = new PlasticPrinter();
		Printer plastic3DPrinter = new Printer3D(new PlasticPrinter());
		Printer paper3DPrinter = new Printer3D(new PaperPrinter());
		plasticPrinter.print();
		plastic3DPrinter.print();
		paper3DPrinter.print();
	}
}