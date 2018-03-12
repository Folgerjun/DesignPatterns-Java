package com.java.design.decorator;

public class ManDecoratorB extends Decorator {

	@Override
	public void eat() {
		super.eat();

		System.out.println("Man DecoratorB ...");
	}
}
