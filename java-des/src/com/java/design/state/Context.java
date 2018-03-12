package com.java.design.state;

/**
 * 定义状态
 * 
 * @author Administrator
 *
 */
public class Context {

	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String stateMessage() {
		return state.getState();
	}

}
