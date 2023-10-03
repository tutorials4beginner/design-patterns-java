package com.t4b.test.java.dp.bp.cor;

public class TestMain {
	private static Logger getChainOfLoggers() {
		Logger emailLogger = new EMailLogger();
		Logger fileLogger = new FileLogger();
		Logger consoleLogger = new ConsoleLogger();

		emailLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return emailLogger;
	}

	public static void main(String[] args) {
		Logger loggerChain = getChainOfLoggers();

		loggerChain.logMessage("Message-1");
		System.out.println();

		loggerChain.logMessage("Message-2");
		System.out.println();

	}
}