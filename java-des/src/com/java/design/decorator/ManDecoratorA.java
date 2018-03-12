package com.java.design.decorator;

public class ManDecoratorA extends Decorator {

	@Override
	public void eat() {
		super.eat();
		reEat();
		System.out.println("Decorator A ...");
	}

	public void reEat() {
		System.out.println("Eat again ...");
	}
}
