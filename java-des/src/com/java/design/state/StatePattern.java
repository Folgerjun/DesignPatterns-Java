package com.java.design.state;

/**
 * 状态模式 -----> 允许一个对象在其内部状态改变时改变它的行为,对象看起来似乎修改了它的类
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
