package com.t4b.test.java.dp.cp.pp;

import java.util.Hashtable;

class ShapeProtoType {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		CircleShape circle = new CircleShape();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		SquareShape square = new SquareShape();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		RectangleShape rectangle = new RectangleShape();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}