package org.ivvy.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="",portName="",serviceName="",endpointInterface="",targetNamespace="",wsdlLocation="")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class BankServiceImpl implements BankService {

	@Override
	public String getBalance(String name) {
		if("ivvy".equals(name)){
			return "Mr."+name+", how are you?";
		}else {
			return "No Person";
		}
	} 

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9000/bankService", new BankServiceImpl());
	}
}
