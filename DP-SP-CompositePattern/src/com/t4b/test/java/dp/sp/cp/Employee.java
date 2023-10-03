package com.t4b.test.java.dp.sp.cp;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private String designation;

	private List<Employee> subordinates;

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
		subordinates = new ArrayList<Employee>();
	}

	public void addSubordinate(Employee e) {
		subordinates.add(e);
	}

	public void removeSubordinate(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", subordinates=" + subordinates + "]";
	}
}
