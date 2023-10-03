package com.t4b.test.java.dp.bp.mp;

class Main {
	public static void main(String[] args) {
		Machine machine1 = new Machine("Machine1");
		Machine machine2 = new Machine("Machine2");

		machine1.sendMessage("Rebooting");
		machine2.sendMessage("Computing");
	}
}