package org.ivvy.xfire.embedded.server;

import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.server.http.XFireHttpServer;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.service.invoker.BeanInvoker;
import org.ivvy.xfire.HelloWorld;
import org.ivvy.xfire.HelloWorldImpl;

public class EmbeddedServer {
	public static void main(String[] args) throws Exception {
		// 对象工厂
		ObjectServiceFactory serviceFactory = new ObjectServiceFactory();
		// 服务对象
		Service service = serviceFactory.create(HelloWorld.class);
		// 设置Bean的调用器
		service.setInvoker(new BeanInvoker(new HelloWorldImpl()));
		XFire xfire = XFireFactory.newInstance().getXFire();// 注册服务
		xfire.getServiceRegistry().register(service);

		XFireHttpServer server = new XFireHttpServer();// 启动服务器
		server.setPort(8119);
		server.start();
	}
}
