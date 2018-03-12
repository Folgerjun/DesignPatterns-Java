package com.java.design.iterator;

/**
 * 迭代器模式（Iterator）-----> 提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * 
 * @author Administrator
 *
 */
public class IteratorPattern {

	public static void main(String[] args) {

		List list = new ListImpl();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		// 第一种迭代方式
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println("----------------------");
		// 第二种迭代方式
		for (int i = 0; i < list.getSize(); i++) {

			System.out.println(list.get(i));
		}

	}

}
