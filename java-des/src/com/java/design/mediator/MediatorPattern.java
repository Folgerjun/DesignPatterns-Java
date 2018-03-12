package com.java.design.mediator;

/**
 * 中介者模式 -----> 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 
 * @author Administrator
 *
 */
public class MediatorPattern {

	public static void main(String[] args) {

		ConcreteMediator mediator = new ConcreteMediator();
		ColleagueA colleagueA = new ColleagueA("A", mediator);
		ColleagueB colleagueB = new ColleagueB("B", mediator);
		mediator.setColleagueA(colleagueA);
		mediator.setColleagueB(colleagueB);
		colleagueA.contact("B 啊 我在找你啊 ...");
		colleagueB.contact("A 啊 我在找你啊 ...");
	}
}
