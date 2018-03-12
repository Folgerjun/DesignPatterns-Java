package com.java.design.interpreter;

/**
 * 解释器模式 -----> 是一种用得比较少的行为型模式.提供了一种解释语言的语法或表达式的方式. 通过定义一个表达式接口,解释一个特定的上下文.
 * 
 * @author Administrator
 *
 */
public class InterpreterPattern {

	public static void main(String[] args) {

		Context context = new Context();
		context.add(new SimpleExpression());
		context.add(new SimpleExpression());
		context.add(new AdvanceExpression());
		context.add(new SimpleExpression());

		for (Expression ex : context.getList()) {

			ex.interpret();
		}
	}

}
