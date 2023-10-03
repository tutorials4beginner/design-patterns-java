package com.t4b.test.java.dp.bp.ip;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		WordBag bag = new WordBag();

		for (Iterator iter = bag.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}

//		ArrayList<String> al = new ArrayList<String>();
//		java.util.Iterator<String> it = al.iterator();
//		it.hasNext();
//		it.next();
	}
}