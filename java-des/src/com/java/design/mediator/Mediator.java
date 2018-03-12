package com.java.design.mediator;

/**
 * 定义抽象 Mediator 中介者 ,可以与其他同时进行联络
 * 
 * @author Administrator
 *
 */
public abstract class Mediator {

	public abstract void contact(String message, Colleague colleague);

}
