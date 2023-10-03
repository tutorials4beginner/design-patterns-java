package com.t4b.test.java.dp.cp.afp;

abstract class AbstractFactory {
	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}