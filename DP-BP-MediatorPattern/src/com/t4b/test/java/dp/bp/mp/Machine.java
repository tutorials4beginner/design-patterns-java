package com.t4b.test.java.dp.bp.mp;

class Machine {
	private String name;

	public Machine(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sendMessage(String message) {
		Printer.showMessage(this, message);
	}
}