package com.java.design.mediator;

public class ColleagueB extends Colleague {

	public ColleagueB(String name, Mediator mediator) {

		super(name, mediator);
	}

	public void getMessage(String message) {

		System.out.println(name + "收到消息:" + message);
	}

	// 与中介者通讯
	public void contact(String message) {
		mediator.contact(message, this);
	}

}
