package com.t4b.test.java.dp.bp.ip;

class WordBag {
	public String words[] = { "R", "J", "A", "L" };

	public Iterator getIterator() {
		return new WordIterator();
	}

	class WordIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < words.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return words[index++];
			}
			return null;
		}
	}
}