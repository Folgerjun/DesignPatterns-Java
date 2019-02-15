package com.java.design.singleton;

/**
 * 枚举实现单例 最佳
 * 避免反射攻击、避免序列化问题
 * 
 * @author Administrator
 *
 */
public class EnumSingleton {

	INSTANCE;

	public EnumSingleton getInstance() {
		return INSTANCE;
	}
}
