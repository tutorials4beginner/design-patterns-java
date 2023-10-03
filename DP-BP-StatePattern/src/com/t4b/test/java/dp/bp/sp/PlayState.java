package com.t4b.test.java.dp.bp.sp;

class PlayState implements State {
	public void doAction(Context context) {
		System.out.println("In play state");
		context.setState(this);
	}

	public String toString() {
		return "Play State";
	}
}
