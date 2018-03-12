package com.java.design.command;

public class ActionB implements AbstractAction {

	private AbstractReceiver abstractReceiver;

	public ActionB(AbstractReceiver abstractReceiver) {

		this.abstractReceiver = abstractReceiver;
	}

	@Override
	public void excute() {

		System.out.println("命令B发布 ...");
		this.abstractReceiver.cook();
	}
}
