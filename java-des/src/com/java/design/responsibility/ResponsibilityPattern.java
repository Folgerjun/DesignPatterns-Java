package com.java.design.responsibility;

/**
 * 责任链模式 -----> 是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，
 * 直到链上的某一个对象决定处理此请求
 * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任
 * Tomcat中的Filter就是使用了责任链模式
 * 创建一个Filter除了要在web.xml文件中做相应配置外，还需要实现javax.servlet.Filter接口。
 * 
 * @author Administrator
 *
 */
public class ResponsibilityPattern {

	public static void main(String[] args) {

		RequestHandler hr = new HRRequestHandle();
		RequestHandler pm = new PMRequestHandle(hr);

		Request request = new DimissionRequest();
		hr.handleRequest(request);

		request = new AddMoneyRequest();
		pm.handleRequest(request);

		request = new DimissionRequest();
		pm.handleRequest(request);

	}

}
