package org.ivvy.restlet;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class FirstServerResource extends ServerResource {

	public static void main(String[] args) throws Exception {
		new Server(Protocol.HTTP, 8119, FirstServerResource.class).start();
		System.out.println("-----OK");
	}

	@Get
	public String toString() {
		return "Hello, Restlet!";
	}

}
