package com.java.design.facade;

/**
 * 外观模式 ----> 是一种使用频率非常高的结构型设计模式，它通过引入一个外观角色来简化客户端与子系统之间的交互，为复杂的子系统调用提供一个统一的入口，
 * 降低子系统与客户端的耦合度，且客户端调用非常方便。
 * 
 * @author Administrator
 *
 */
public class FacadePattern {

	public static void main(String[] args) {

		// 不根据外观调用
		ServiceA serviceA = new ServiceAImpl();
		ServiceB serviceB = new ServiceBImpl();
		ServiceC serviceC = new ServiceCImpl();

		serviceA.methodA();
		serviceB.methodB();
		serviceC.methodC();

		System.out.println("----------------");

		// 利用外观调用
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		facade.methodC();
	}

}
