package org.ivvy.cxf.server;

import javax.jws.WebService;

@WebService
public class PersonImpl implements IPerson {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
