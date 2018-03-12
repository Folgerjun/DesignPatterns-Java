package com.java.design.memento;

/**
 * 备忘录模式 -----> 在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态
 * 
 * @author Administrator
 *
 */
public class MementoPattern {

	public static void main(String[] args) {

		Originator originator = new Originator();
		originator.setState("在洗澡 ...");
		originator.showState();

		// 状态进行保存
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		originator.setState("在吃饭 ...");
		originator.showState();

		// 重新将状态拿出来
		originator.setMemento(caretaker.getMemento());
		originator.showState();
	}

}
