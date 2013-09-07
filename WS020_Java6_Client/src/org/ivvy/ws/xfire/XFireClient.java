package org.ivvy.ws.xfire;

public class XFireClient {
	public static void main(String[] args) {
		HelloWorldService service = new HelloWorldService();
		HelloWorldServicePortType port = service.getHelloWorldServiceHttpPort();
		System.out.println(port.sayHello("艾苇"));
	}
}
