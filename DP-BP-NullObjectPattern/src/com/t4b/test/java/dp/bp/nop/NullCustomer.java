package com.t4b.test.java.dp.bp.nop;

class NullCustomer extends AbstractEmployee {
	@Override
	public String getName() {
		return "Not Available";
	}

	@Override
	public boolean isNull() {
		return true;
	}
}