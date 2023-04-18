package com.isho.java_rest_app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/v1")
public class MyResource {

	@Path("/v2")
    @GET
    @Produces(MediaType.TEXT_PLAIN)  
    public String getIt() {
        return "Got it!";
    }
}
