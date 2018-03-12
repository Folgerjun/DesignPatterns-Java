package com.java.design.observer;

/**
 * 被观察者接口 / 声明了添加、删除、通知观察者方法
 * 
 * @author Administrator
 *
 */
public interface Observerable {

	/**
	 * 添加观察者
	 * 
	 * @param observer
	 */
	void add(Observer observer);

	/**
	 * 删除观察者
	 * 
	 * @param observer
	 */
	void remove(Observer observer);

	/**
	 * 通知观察者
	 *
	 */
	void notifyObs();

}
