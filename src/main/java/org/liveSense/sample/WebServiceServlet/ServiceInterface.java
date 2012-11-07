package org.liveSense.sample.WebServiceServlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



/**
 * functions 
 *
 */
@SuppressWarnings("restriction")
public interface ServiceInterface {

	// JAX RS Annnotations
	@GET
	@Path("/hello/{name}")
	@Produces({"text/plain", "application/json", "text/xml"})

	// Jax WS Annotations
	
	public HelloBean helloWorld(String name)
		throws Exception;

}
