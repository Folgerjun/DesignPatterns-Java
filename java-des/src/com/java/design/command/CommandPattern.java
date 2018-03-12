package com.java.design.command;

/**
 * 命令模式 ----->
 * 显而易见，是将命令和实际操作相隔离，解耦合，客户端只发出命令，具体的操作不需要关心，只需要完成任务。举个很简单的例子，用户点菜，然后厨师做菜，
 * 根据点菜的口味不同厨师做不同的菜
 * 
 * @author Administrator
 *
 */
public class CommandPattern {

	public static void main(String[] args) {

		// 创建调用者
		Invoker invoker = new Invoker();

		// 创建命令接收者
		AbstractReceiver abstractReceiver = new ReceiverA();

		// 创建命令，传入接收者
		AbstractAction abstractAction = new ActionA(abstractReceiver);
		// AbstractAction abstractAction = new ActionB(abstractReceiver);

		// 发布命令
		invoker.setAbstractAction(abstractAction);

		// 执行命令
		invoker.action();
	}

}
