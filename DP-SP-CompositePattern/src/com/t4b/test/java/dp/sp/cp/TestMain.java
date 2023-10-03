package com.t4b.test.java.dp.sp.cp;

public class TestMain {
	public static void main(String[] args) {
		Employee ceo = new Employee("Smith", "CEO");
		Employee salesHead = new Employee("Johnson", "Sales");
		Employee marketingHead = new Employee("Williams", "Marketing");
		ceo.addSubordinate(salesHead);
		ceo.addSubordinate(marketingHead);

		Employee programmer = new Employee("Jones", "Programmer");
		marketingHead.addSubordinate(programmer);
		programmer = new Employee("Brown", "Programmer");
		marketingHead.addSubordinate(programmer);

		Employee tester = new Employee("Davis", "Tester");
		salesHead.addSubordinate(tester);
		tester = new Employee("Miller", "Tester");
		salesHead.addSubordinate(tester);

		System.out.println(ceo);
		for (Employee e : ceo.getSubordinates()) {
			System.out.println(e);
			for (Employee employee : e.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}