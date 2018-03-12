package com.java.design.state;

/**
 * 状态模式 ----->
 * 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。允许一个对象在其内部状态改变时改变它的行为
 * 对象看起来似乎修改了它的类
 * 
 * @author Administrator
 *
 */
public class StatePattern {

	public static void main(String[] args) {

		Context context = new Context();
		context.setState(new SunShine());
		String messageSun = context.stateMessage();
		System.out.println(messageSun);

		System.out.println("----------------");

		context.setState(new Rain());
		String messageRain = context.stateMessage();
		System.out.println(messageRain);
	}

}
