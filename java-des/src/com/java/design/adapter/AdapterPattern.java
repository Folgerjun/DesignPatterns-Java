package com.java.design.adapter;

/**
 * 适配器就是一种适配中间件，它存在于不匹配的二者之间，用于连接二者，将不匹配变得匹配，简单点理解就是平常所见的转接头，转换器之类的存在。
 * 
 * 　　适配器模式有两种：类适配器、对象适配器、接口适配器
 * 
 * 　　前二者在实现上有些许区别，作用一样，第三个接口适配器差别较大。
 * 
 * @author Administrator
 *
 */
public class AdapterPattern {

	public static void main(String[] args) {

		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}

}
