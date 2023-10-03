package com.t4b.test.java.dp.bp.vp;

class EmailVisitor implements NodeVisitor {
	@Override
	public void visit(TreeNode n) {
		System.out.println("email:" + n.getName());
	}
}