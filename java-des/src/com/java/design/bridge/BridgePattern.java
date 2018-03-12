package com.java.design.bridge;

/**
 * 桥接模式 -----> 将抽象部分与它实现部分分离，使他们都可以独立变化
 * 
 * @author Administrator
 *
 */
public class BridgePattern {

	public static void main(String[] args) {

		Man man = new Man();

		Lady lady = new Lady();

		Clothing blackShoe = new BlackShoe();

		Clothing whiteShoe = new WhiteShoe();

		blackShoe.personDressCloth(man);
		blackShoe.personDressCloth(lady);

		whiteShoe.personDressCloth(man);
		whiteShoe.personDressCloth(lady);

	}
}
