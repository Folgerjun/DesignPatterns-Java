package com.java.design.observer;

/**
 * 观察者模式 -----> 在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
 * 
 * 其实就是发布订阅模式，发布者发布信息，订阅者获取信息，订阅了就能收到信息，没订阅就收不到信息
 * 
 * @author Administrator
 *
 */
public class ObserverPattern {

	public static void main(String[] args) {

		ObserverServer observerServer = new ObserverServer();
		Observer observerA = new User("A");
		Observer observerB = new User("B");
		Observer observerC = new User("C");

		observerServer.add(observerA);
		observerServer.add(observerB);
		observerServer.add(observerC);
		observerServer.setInfomation("PHP是世界上最好的语言 ...");

		System.out.println("------------------------------");

		observerServer.remove(observerB);
		observerServer.setInfomation("JAVA是世界上最好的语言 ...");

	}

}
