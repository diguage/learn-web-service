package org.ivvy.cxf;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.ivvy.ws.BankService;

public class CxfClient {
	public static void main(String[] args) throws Exception {
		// 1.使用动态代理的方式进行访问
		// JaxWsDynamicClientFactory dcf =
		// JaxWsDynamicClientFactory.newInstance();
		// Client client = dcf
		// .createClient("http://127.0.0.1:9119/bankService?wsdl");
		// Object[] res = client.invoke("getBalance", "ivvy");
		// System.out.println("Echo response:" + res[0]);

		// 2.通过静态代理进行访问
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(BankService.class);
		factory.setAddress("http://127.0.0.1:9119/bankService");
		BankService client = (BankService) factory.create();
		System.out.println(client.getBalance("Ivvy"));
		System.out.println(client.getBalance("ivvy"));
		
	}
}
