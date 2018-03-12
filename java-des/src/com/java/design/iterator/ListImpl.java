package com.java.design.iterator;

public class ListImpl implements List {

	private Object[] list;

	private Integer index;

	private Integer size;

	public ListImpl() {

		index = 0;
		size = 0;
		list = new Object[100];
	}

	@Override
	public Iterator iterator() {
		return new IteratorImpl(this);
	}

	@Override
	public Object get(Integer index) {
		return list[index];
	}

	@Override
	public Integer getSize() {
		return this.size;
	}

	@Override
	public void add(Object obj) {

		list[index++] = obj;
		size++;
	}
}
