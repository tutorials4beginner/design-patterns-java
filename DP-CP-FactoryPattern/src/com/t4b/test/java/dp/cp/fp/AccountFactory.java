package com.t4b.test.java.dp.cp.fp;

public class AccountFactory {

	Account createAccount(String accType) {
		if (accType.equals("Savings")) {
			return new SavingsAccount();
		} else if (accType.equals("TermDeposit")) {
			return new TermDepositAccount();
		}
		return null;
	}
}
