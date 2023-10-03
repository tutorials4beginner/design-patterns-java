package com.t4b.test.java.dp.bp.vp;

class ConsoleVisitor implements NodeVisitor {
	@Override
	public void visit(TreeNode n) {
		System.out.println("console:" + n.getName());
	}
}