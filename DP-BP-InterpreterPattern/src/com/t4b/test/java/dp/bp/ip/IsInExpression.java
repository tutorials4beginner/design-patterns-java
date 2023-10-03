package com.t4b.test.java.dp.bp.ip;

class IsInExpression implements Expression {
	private String data;

	public IsInExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean evaluate(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
