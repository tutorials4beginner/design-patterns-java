package com.t4b.test.java.dp.bp.cp;

class ResetCursor implements Command {
	private MouseCursor abcStock;

	public ResetCursor(MouseCursor abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.reset();
	}
}
