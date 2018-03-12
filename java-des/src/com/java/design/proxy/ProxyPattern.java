package com.java.design.proxy;

/**
 * 代理模式 -----> 所谓代理模式是指客户端并不直接调用实际的对象，而是通过调用代理，来间接的调用实际的对象。
 * 
 * @author Administrator
 *
 */
public class ProxyPattern {

	public static void main(String[] args) {

		// 这里示范的为静态代理模式
		Dog dog = new DogProxy();
		dog.eat();
	}

}
