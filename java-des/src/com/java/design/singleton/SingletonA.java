package com.java.design.singleton;

/**
 * 单例模式的实现：饿汉式,线程安全 但效率比较低
 */
public class SingletonA {

	private SingletonA() {
	}

	private static final SingletonA instance = new SingletonA();

	public static SingletonA getInstance() {

		return instance;
	}

}
