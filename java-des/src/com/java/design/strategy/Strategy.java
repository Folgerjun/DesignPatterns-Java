package com.java.design.strategy;

/**
 * 公交计算策略
 * 
 * @author Administrator
 *
 */
public class Strategy implements CalculateStrategy {

	private String name;

	public Strategy(String name) {
		this.name = name;
	}

	@Override
	public void calculatePrice(Integer km) {

		Integer priceTot = 0;

		if (name == "公交") {
			int extraTotal = km - 10;
			int extraFactor = extraTotal / 5;
			int fraction = extraTotal % 5;
			int price = 1 + extraFactor * 1;
			priceTot = fraction > 0 ? ++price : price;
		} else if (name == "地铁") {
			if (km <= 6) {
				priceTot = 3;
			} else if (km > 6 && km < 12) {
				priceTot = 4;
			} else if (km < 22 && km > 12) {
				priceTot = 5;
			} else if (km < 32 && km > 22) {
				priceTot = 6;
			} else {
				priceTot = 7;
			}
		}
		System.out.println(name + "坐" + km + "公里需要" + priceTot + "元 ...");
	}
}
