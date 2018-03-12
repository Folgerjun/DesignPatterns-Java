package com.java.design.strategy;

public class TranficCalculator {

	CalculateStrategy calculateStrategy;

	public void calculatePrice(CalculateStrategy calculateStrategy, Integer km) {

		this.calculateStrategy = calculateStrategy;
		calculateStrategy.calculatePrice(km);
	}

}
