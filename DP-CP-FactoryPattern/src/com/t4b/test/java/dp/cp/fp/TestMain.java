package com.t4b.test.java.dp.cp.fp;

public class TestMain {

	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();

		Account savAccount = accountFactory.createAccount("Savings");
		Account tdAccount = accountFactory.createAccount("TermDeposit");
	}
}
