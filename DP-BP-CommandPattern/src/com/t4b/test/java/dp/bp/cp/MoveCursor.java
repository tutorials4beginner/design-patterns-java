package com.t4b.test.java.dp.bp.cp;

class MoveCursor implements Command {
	private MouseCursor abcStock;

	public MoveCursor(MouseCursor abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.move();
	}
}
