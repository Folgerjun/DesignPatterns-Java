package com.java.design.strategy;

/**
 * 策略模式 -----> 策略模式属于对象的行为模式。其用意是针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以相互替换。
 * 策略模式使得算法可以在不影响到客户端的情况下发生变化
 * 
 * @author Administrator
 *
 */
public class StrategyPattern {

	public static void main(String[] args) {

		TranficCalculator tranficCalculator = new TranficCalculator();
		// 设置计算策略
		// 计算价格
		tranficCalculator.calculatePrice(new Strategy("地铁"), 10);

	}

}
