package com.java.design.command;

public class ReceiverB extends AbstractReceiver {

	@Override
	void cook() {

		System.out.println("成功接收到命令B 并执行完毕 ...");
	}
}
