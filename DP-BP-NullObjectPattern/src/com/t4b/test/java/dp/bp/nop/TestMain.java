package com.t4b.test.java.dp.bp.nop;

public class TestMain {

	public static void main(String[] args) {
		AbstractEmployee emp = EmployeeFactory.getCustomer("Rob");
		AbstractEmployee emp2 = EmployeeFactory.getCustomer("Bob");
		AbstractEmployee emp3 = EmployeeFactory.getCustomer("Jack");
		AbstractEmployee emp4 = EmployeeFactory.getCustomer("Tom");

		System.out.println(emp.getName());
		System.out.println(emp2.getName());
		System.out.println(emp3.getName());
		System.out.println(emp4.getName());
	}
}
