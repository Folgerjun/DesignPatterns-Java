package com.java.design.template;

public abstract class CarModel {

	protected abstract void start();

	protected abstract void stop();

	final public void excet() {

		start();
		stop();
	}

}
