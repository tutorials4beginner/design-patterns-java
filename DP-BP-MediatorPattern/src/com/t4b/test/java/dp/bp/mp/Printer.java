package com.t4b.test.java.dp.bp.mp;

import java.util.Date;

class Printer {
	public static void showMessage(Machine machine, String message) {
		System.out.println(new Date().toString() + " [" + machine.getName() + "] : " + message);
	}
}