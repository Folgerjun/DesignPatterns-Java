package com.java.design.memento;

/**
 * 用于保存
 * 
 * @author Administrator
 *
 */
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
