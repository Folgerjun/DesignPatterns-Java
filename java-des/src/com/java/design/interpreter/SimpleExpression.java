package com.java.design.interpreter;

public class SimpleExpression extends Expression {

	@Override
	void interpret() {

		System.out.println("这是一个简单的解析器 ...");
	}
}
