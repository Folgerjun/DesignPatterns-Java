package com.java.design.abstractfactory;


/**
 * 抽象工厂模式 ----- > 就是对一组具有相同主题的工厂进行封装（维基百科解释的很到位）；
 * 
 * 例如：生产一台PC机，使用工厂方法模式的话，一般会有cpu工厂，内存工厂，显卡工厂...但是使用抽象工厂模式的话，只有一个工厂就是PC工厂，
 * 但是一个PC工厂涵盖了cpu工厂，内存工厂，显卡工厂等要做的所有事；
 * 
 * @author Administrator
 *
 */
public class AbstractFactoryPattern {

	public static void main(String[] args) {

		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		ICat blackCat = blackAnimalFactory.createCat();
		IDog blackDog = blackAnimalFactory.createDog();
		blackCat.eat();
		blackDog.eat();

		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		ICat whiteCat = whiteAnimalFactory.createCat();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteCat.eat();
		whiteDog.eat();

	}

}
