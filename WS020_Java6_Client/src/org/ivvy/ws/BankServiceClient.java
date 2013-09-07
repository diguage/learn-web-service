package org.ivvy.ws;

public class BankServiceClient {

	public static void main(String[] args) {
		BankServiceImpl service = new BankServiceImplService().getBankServiceImplPort();
		System.out.println(service.getBalance("ivvy"));
		System.out.println(service.getBalance("adai"));
	}
}
