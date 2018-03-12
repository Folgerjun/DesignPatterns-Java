package com.java.design.build;

/**
 * 建造者模式 -----> 是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 
 * 如：去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"
 * 
 * @author Administrator
 *
 */
public class BuilderPattern {

	public static void main(String[] args) {

		PersonDirector personDirector = new PersonDirector();
		Person person = personDirector.construtorPerson(new ManBuilder());
		System.out.println(person);
	}

}
