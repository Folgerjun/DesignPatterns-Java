package com.java.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者服务
 * 
 * @author Administrator
 *
 */
public class ObserverServer implements Observerable {

	private List<Observer> observers;
	private String message;

	public ObserverServer() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void add(Observer observer) {

		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {

		if (!observers.isEmpty()) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObs() {

		for (int i = 0; i < observers.size(); i++) {
			Observer obs = observers.get(i);
			obs.update(message);
		}
	}

	public void setInfomation(String message) {
		this.message = message;
		System.out.println("服务更新消息：" + message);
		notifyObs();
	}

}
