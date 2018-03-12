package com.java.design.visitor;

public class BodyB {

	public void seeABody(BodyA a) {
		a.seeABody();
	}

	public void seeBBody(BodyA a) {
		System.out.println("Want to see B の  Body ? hehe ...");
		a.seeABody();
	}
}
