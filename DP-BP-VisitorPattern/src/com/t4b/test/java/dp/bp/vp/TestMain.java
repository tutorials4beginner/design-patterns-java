package com.t4b.test.java.dp.bp.vp;

public class TestMain {
	public static void main(String[] args) {

		TreeNode node = new TreeNode("tutorials4beginner.com");
		node.accept(new ConsoleVisitor());
		node.accept(new EmailVisitor());
	}
}
