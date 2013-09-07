package org.ivvy.xfire;

import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {
		// 2、通过静态代理访问方式
		// 创建对象服务工厂
		ObjectServiceFactory serviceFactory = new ObjectServiceFactory();
		// 通过服务工厂创建服务对象
		Service service = serviceFactory.create(HelloWorld.class);
		// 创建XFire代理工厂
		XFireProxyFactory proxyFactory = new XFireProxyFactory();
		HelloWorld hello = (HelloWorld) proxyFactory
				.create(service,
						"http://127.0.0.1:8080/WS030_XFire_Server/services/HelloWorldService");// 创建代理
		System.out.println(hello.sayHello("阿呆艾苇"));

	}

}
