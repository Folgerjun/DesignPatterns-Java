package com.java.design.singleton;

/**
 * 静态内部类
 * 
 * @author Administrator
 *
 */
public class SingletonD {

	private static class SingletonHolder {

		private static final SingletonD INSTANCE = new SingletonD();
	}

	private SingletonD() {

	}

	public static SingletonD getInstance() {

		return SingletonHolder.INSTANCE;
	}
}
