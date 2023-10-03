package com.t4b.test.java.dp.sp.fp;

import java.util.ArrayList;
import java.util.List;

class CriteriaRetire implements Criteria {

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> singlePersons = new ArrayList<Employee>();
		for (Employee person : persons) {
			if (person.getRetireStatus().equalsIgnoreCase("YES")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}