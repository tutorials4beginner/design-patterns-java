package com.t4b.test.java.dp.bp.sp;

public class TestMain {
	public static void main(String[] args) {
		int x = 10, y = 5;

		ArithmaticContext context = new ArithmaticContext(new ArithmaticAdd());
		System.out.println(x + " + " + y + " = " + context.execute(x, y));

		context = new ArithmaticContext(new ArithmaticSub());
		System.out.println(x + " - " + y + " = " + context.execute(x, y));

		context = new ArithmaticContext(new ArithmaticMul());
		System.out.println(x + " * " + y + " = " + context.execute(x, y));
	}
}
