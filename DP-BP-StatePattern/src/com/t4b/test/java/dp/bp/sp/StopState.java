package com.t4b.test.java.dp.bp.sp;

class StopState implements State {

	public void doAction(Context context) {
		System.out.println("In stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
