package com.t4b.test.java.dp.bp.sp;

class ArithmaticContext {
	private ArithmaticAlgorithm algorithm;

	public ArithmaticContext(ArithmaticAlgorithm strategy) {
		this.algorithm = strategy;
	}

	public int execute(int num1, int num2) {
		return algorithm.calculate(num1, num2);
	}
}