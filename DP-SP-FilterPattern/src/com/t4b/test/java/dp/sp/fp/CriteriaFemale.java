package com.t4b.test.java.dp.sp.fp;

import java.util.ArrayList;
import java.util.List;

class CriteriaFemale implements Criteria {

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> femalePersons = new ArrayList<Employee>();
		for (Employee person : persons) {
			if (person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}