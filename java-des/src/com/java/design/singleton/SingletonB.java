package com.java.design.singleton;

/**
 * 单例模式的实现：饱汉式,非线程安全
 */
public class SingletonB {

	// 防止实例化
	private SingletonB() {

	}

	// 定义一个SingletonTest类型的变量（不初始化，注意这里没有使用final关键字）
	private static SingletonB instance;

	// 定义一个静态的方法（调用时再初始化SingletonTest，但是多线程访问时，可能造成重复初始化问题）
	// 加上 synchronized 保证线程安全
	public static synchronized SingletonB getInstance() {

		if (instance == null) {
			instance = new SingletonB();
		}
		return instance;
	}
}
