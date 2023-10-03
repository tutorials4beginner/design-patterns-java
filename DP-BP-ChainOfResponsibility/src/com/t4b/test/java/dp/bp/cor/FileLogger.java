package com.t4b.test.java.dp.bp.cor;

class FileLogger extends Logger {
	public FileLogger() {
	}

	@Override
	protected void log(String message) {
		System.out.println("FileLogger: " + message);
	}
}