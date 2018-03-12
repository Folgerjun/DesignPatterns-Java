package com.java.design.composite;

/**
 * 组合模式（Composite
 * Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次
 * 。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * 
 * @author Administrator
 *
 */
public class CompositePattern {

	public static void main(String[] args) {

		Composite composite = new Composite("root");
		composite.add(new Leaf("leaf1"));
		composite.add(new Leaf("leaf2"));

		Composite composite1 = new Composite("composite1");
		composite1.add(new Leaf("leaf3"));
		composite1.add(new Leaf("leaf4"));
		composite1.add(new Leaf("leaf5"));
		composite.add(composite1);

		Leaf leaf6 = new Leaf("leaf6");
		composite.add(leaf6);
		// composite.delete(leaf6);
		composite.show(1);
	}

}
