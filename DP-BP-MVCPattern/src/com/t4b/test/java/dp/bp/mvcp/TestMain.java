package com.t4b.test.java.dp.bp.mvcp;

public class TestMain {
	public static void main(String[] args) {
		Employee model = new Employee();
		model.setName("John");
		model.setId("1");
		EmployeeView view = new EmployeeView();

		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView();
		controller.setEmployeeName("New Name");
		controller.updateView();
	}
}