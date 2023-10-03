package com.t4b.test.java.dp.bp.nop;

class Programmer extends AbstractEmployee {
	public Programmer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}