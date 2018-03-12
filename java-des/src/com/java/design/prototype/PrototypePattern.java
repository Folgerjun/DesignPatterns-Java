package com.java.design.prototype;

/**
 * 原型模式 -----> 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 
 * @author Administrator
 *
 */
public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Prototype prototype = new ConcreatePrototype("Folger");
		Prototype prototype2 = (Prototype) prototype.clone();

		System.out.println(prototype + " " + prototype.getName());
		System.out.println(prototype2 + " " + prototype2.getName());
	}

}
