package com.t4b.test.java.dp.sp.fp;

class ShapeFacade {
	interface Shape {
		void draw();
	}

	class Rectangle implements Shape {
		@Override
		public void draw() {
			System.out.println("Drawing Rectangle!");
		}
	}

	class Square implements Shape {
		@Override
		public void draw() {
			System.out.println("Drawing Square!");
		}
	}

	class Circle implements Shape {
		@Override
		public void draw() {
			System.out.println("Drawing Circle!");
		}
	}

	private Shape circle = new Circle();
	private Shape rectangle = new Rectangle();
	private Shape square = new Square();

	public ShapeFacade() {
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
