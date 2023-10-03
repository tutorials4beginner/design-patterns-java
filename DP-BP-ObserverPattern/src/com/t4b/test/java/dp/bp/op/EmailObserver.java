package com.t4b.test.java.dp.bp.op;

class EmailObserver extends Observer {

	public EmailObserver(MyValue subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Email: " + subject.getState());
	}
}