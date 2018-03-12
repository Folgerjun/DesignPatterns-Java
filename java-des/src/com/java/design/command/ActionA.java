package com.java.design.command;

public class ActionA implements AbstractAction {

	private AbstractReceiver abstractReceiver;

	public ActionA(AbstractReceiver abstractReceiver) {

		this.abstractReceiver = abstractReceiver;
	}

	@Override
	public void excute() {

		System.out.println("命令A发布 ...");
		this.abstractReceiver.cook();
	}
}
