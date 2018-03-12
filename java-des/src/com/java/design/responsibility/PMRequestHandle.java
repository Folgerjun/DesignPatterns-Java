package com.java.design.responsibility;

public class PMRequestHandle implements RequestHandler {

	RequestHandler requestHandler;

	public PMRequestHandle(RequestHandler requestHandler) {

		this.requestHandler = requestHandler;
	}

	@Override
	public void handleRequest(Request request) {

		if (request instanceof AddMoneyRequest) {

			System.out.println("要加薪，项目经理审批 ...");
		} else {

			requestHandler.handleRequest(request);
		}

	}
}
