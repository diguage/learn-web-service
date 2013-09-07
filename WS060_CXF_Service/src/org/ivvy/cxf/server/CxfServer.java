package org.ivvy.cxf.server;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.ivvy.ws.BankService;
import org.ivvy.ws.BankServiceImpl;

public class CxfServer {
	public static void main(String[] args) {
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setServiceClass(BankService.class);
		factory.setAddress("http://127.0.0.1:9119/bankService");
		factory.setServiceBean(new BankServiceImpl());
		factory.create();

	}
}
