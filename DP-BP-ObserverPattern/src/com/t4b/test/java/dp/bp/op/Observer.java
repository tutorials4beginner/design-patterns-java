package com.t4b.test.java.dp.bp.op;

abstract class Observer {
	protected MyValue subject;

	public abstract void update();
}

class PrinterObserver extends Observer {
	public PrinterObserver(MyValue subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Printer: " + subject.getState());
	}
}