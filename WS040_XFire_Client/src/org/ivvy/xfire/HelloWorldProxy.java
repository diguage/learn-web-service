package org.ivvy.xfire;

import java.net.URL;

import org.codehaus.xfire.client.Client;

public class HelloWorldProxy {

	public static void main(String[] args) throws Exception {
		// 1、通XFire客户端API访问方式
		Client client = new Client(
				new URL(
						"http://127.0.0.1:8080/WS030_XFire_Server/services/HelloWorldService?wsdl"));
		Object[] objs = client.invoke("sayHello", new Object[] { "阿呆" });
		System.out.println((String) objs[0]);
		System.out.println("*****************");
		
	}

}
