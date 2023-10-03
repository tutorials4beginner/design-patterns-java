package com.t4b.test.java.dp.bp.cor;

class ConsoleLogger extends Logger {
	public ConsoleLogger() {
	}

	@Override
	protected void log(String message) {
		System.out.println("ConsoleLogger: " + message);
	}
}