package com.java.design.command;

public class ReceiverA extends AbstractReceiver {

	@Override
	void cook() {

		System.out.println("成功接收到命令A 并执行完毕 ...");
	}

}
