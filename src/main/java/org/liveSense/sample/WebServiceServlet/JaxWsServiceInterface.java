package org.liveSense.sample.WebServiceServlet;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



/**
 * functions 
 *
 */
@SuppressWarnings("restriction")
public interface JaxWsServiceInterface extends ServiceInterface {
	String NAME_SPACE = "http://webserviceservlet.sample.liveSense.org";
	String PACKAGE = "org.liveSense.sample.webserviceservlet";

	// Jax WS Annotations
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "helloWorldRequest", targetNamespace = NAME_SPACE, className = PACKAGE + "helloWorldRequest")
	@ResponseWrapper(localName = "helloWorldResponse", targetNamespace = NAME_SPACE, className = PACKAGE + "helloWorldResponse")
	@WebMethod
	public HelloBean helloWorld(@WebParam(name = "name", targetNamespace = NAME_SPACE) String name)
		throws Exception;

}
