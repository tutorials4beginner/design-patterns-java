package com.t4b.test.java.dp.cp.afp;

class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new CircleShape();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new RectangleShape();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new SquareShape();
		}
		return null;
	}

	@Override
	Printer getPrinter(String type) {
		return null;
	}
}