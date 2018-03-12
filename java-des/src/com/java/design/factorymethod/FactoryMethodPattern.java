package com.java.design.factorymethod;

/**
 * 工厂方法 ------> 具体的工厂对象负责生产具体的产品对象
 * 
 * @author Administrator
 *
 */
public class FactoryMethodPattern {

	public static void main(String[] args) {

		StudentWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();

		TeacherWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();
	}

}
