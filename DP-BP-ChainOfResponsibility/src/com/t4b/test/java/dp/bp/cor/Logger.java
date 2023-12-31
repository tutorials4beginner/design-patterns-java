package com.t4b.test.java.dp.bp.cor;

abstract class Logger {

	protected Logger nextLogger;

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(String message) {
		log(message);
		if (nextLogger != null) {
			nextLogger.logMessage(message);
		}
	}

	abstract protected void log(String message);
}