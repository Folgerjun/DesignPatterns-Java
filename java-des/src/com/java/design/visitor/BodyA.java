package com.java.design.visitor;

public class BodyA {

	public void seeABody() {

		System.out.println("I see A の  Body ...");
	}

	public void seeBBody(BodyB b) {
		b.seeBBody(this);
	}

}
