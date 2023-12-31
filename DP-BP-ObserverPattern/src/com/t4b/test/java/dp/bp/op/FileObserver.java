package com.t4b.test.java.dp.bp.op;

class FileObserver extends Observer {

	public FileObserver(MyValue subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("File: " + subject.getState());
	}
}
