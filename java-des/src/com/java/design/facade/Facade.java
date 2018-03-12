package com.java.design.facade;

public class Facade {

	ServiceA serviceA;

	ServiceB serviceB;

	ServiceC serviceC;

	public Facade() {

		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}

	public void methodA() {
		// 重组
		serviceA.methodA();
		serviceB.methodB();
	}

	public void methodB() {
		// 重组
		serviceB.methodB();
		serviceC.methodC();
	}

	public void methodC() {
		// 重组
		serviceC.methodC();
		serviceA.methodA();
	}

}
