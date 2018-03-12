package com.java.design.mediator;

/**
 * 定义具体中介者ConcreteMediator,具体中介者通过协调各同事对象实现协作行为，了解并维护它的各个同事。
 * 
 * @author Administrator
 *
 */
public class ConcreteMediator extends Mediator {

	ColleagueA colleagueA;

	ColleagueB colleagueB;

	public ColleagueA getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(ColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public ColleagueB getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(ColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void contact(String message, Colleague colleague) {

		if (colleague == colleagueA) {
			// 制定规则 ： 如果是A 则发送给 B
			colleagueB.getMessage(message);
		} else if (colleague == colleagueB) {
			// 如果是B 则发送给A
			colleagueA.getMessage(message);
		}
	}
}
