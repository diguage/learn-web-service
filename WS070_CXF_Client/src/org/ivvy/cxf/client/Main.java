package org.ivvy.cxf.client;

public class Main {
	public static void main(String[] args) {
		BankService service = new BankService();
		BankServicePortType type = service.getBankServicePort();
		System.out.println(type.getBalance("ivvy"));
	}
}
