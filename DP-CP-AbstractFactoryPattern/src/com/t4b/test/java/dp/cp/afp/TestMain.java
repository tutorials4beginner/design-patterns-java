package com.t4b.test.java.dp.cp.afp;

public class TestMain {
	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

		Shape shapeCircle = shapeFactory.getShape("Circle");
		Shape shapeSquare = shapeFactory.getShape("Square");
		Shape shapeRectangle = shapeFactory.getShape("Rectangle");

		shapeCircle.draw();
		shapeSquare.draw();
		shapeRectangle.draw();

		AbstractFactory printerFactory = FactoryProducer.getFactory("Printer");

		Printer paperPrinter = printerFactory.getPrinter("Paper");
		Printer webPrinter = printerFactory.getPrinter("Web");
		Printer screenPrinter = printerFactory.getPrinter("Screen");
		paperPrinter.print();
		webPrinter.print();
		screenPrinter.print();
	}
}