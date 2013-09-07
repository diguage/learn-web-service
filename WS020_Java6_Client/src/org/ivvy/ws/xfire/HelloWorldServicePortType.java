
package org.ivvy.ws.xfire;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorldServicePortType", targetNamespace = "http://127.0.0.1:8080/service/helloWorld")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldServicePortType {


    /**
     * 
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://127.0.0.1:8080/service/helloWorld")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://127.0.0.1:8080/service/helloWorld", className = "org.ivvy.ws.xfire.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://127.0.0.1:8080/service/helloWorld", className = "org.ivvy.ws.xfire.SayHelloResponse")
    public String sayHello(
        @WebParam(name = "in0", targetNamespace = "http://127.0.0.1:8080/service/helloWorld")
        String in0);

}
