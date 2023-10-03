package com.t4b.test.java.dp.bp.cor;

class EMailLogger extends Logger {
	public EMailLogger() {
	}

	@Override
	protected void log(String message) {
		System.out.println("EMailLogger: " + message);
	}
}