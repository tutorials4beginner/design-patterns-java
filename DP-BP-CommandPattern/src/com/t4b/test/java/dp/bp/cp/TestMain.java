package com.t4b.test.java.dp.bp.cp;

public class TestMain {
	public static void main(String[] args) {
		MouseCursor cursor = new MouseCursor();

		MoveCursor moveCursor = new MoveCursor(cursor);
		ResetCursor resetCursor = new ResetCursor(cursor);

		MouseCommands commands = new MouseCommands();
		commands.takeOrder(moveCursor);
		commands.takeOrder(resetCursor);

		commands.placeOrders();
	}
}