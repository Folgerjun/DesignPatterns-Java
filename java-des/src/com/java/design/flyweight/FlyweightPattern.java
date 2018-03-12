package com.java.design.flyweight;

/**
 * 享元模式(Flyweight Pattern) --↓↓↓---
 * 运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小
 * ，可以实现对象的多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 * 
 * @author Administrator
 *
 */
public class FlyweightPattern {

	public static void main(String[] args) {

		FlyWeight flyWeight = FlyWeightFactory.getFlyWeight(1);
		FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeight(1);
		System.out.println("is the same ?  ---> : " + (flyWeight == flyWeight2));

		FlyWeight flyWeight3 = FlyWeightFactory.getFlyWeight(3);
		flyWeight3.showIndex(3);

		FlyWeight flyWeight4 = FlyWeightFactory.getFlyWeight(4);
		flyWeight4.showIndex(4);

		FlyWeight flyWeight5 = FlyWeightFactory.getFlyWeight(5);
		flyWeight5.showIndex(5);

		System.out.println("map size is : " + FlyWeightFactory.getSize());

	}

}
