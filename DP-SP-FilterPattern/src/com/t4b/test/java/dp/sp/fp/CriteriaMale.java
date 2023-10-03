package com.t4b.test.java.dp.sp.fp;

import java.util.ArrayList;
import java.util.List;

class CriteriaMale implements Criteria {

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		List<Employee> malePersons = new ArrayList<Employee>();
		for (Employee person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}