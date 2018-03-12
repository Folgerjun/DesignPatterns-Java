package com.java.design.singleton;

/**
 * 单例模式最优方案 线程安全 并且效率高
 */
public class SingletonC {

	private SingletonC() {

	}

	// 定义一个静态私有变量(不初始化，不使用final关键字，使用volatile保证了多线程访问时instance变量的可见性，避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
	private static volatile SingletonC instance;

	public static SingletonC getInstance() {
		if (instance == null) {
			// 同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
			synchronized (SingletonC.class) {
				if (instance == null) {
					instance = new SingletonC();
				}
			}
		}
		return instance;
	}
}
