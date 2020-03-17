package eu.ensup.demorest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		
		String output = "Jersey repond via OBJIS : " + msg;
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/")
	public Response getMsg1(String output){
		
		String output2 = "Je réponds sans paramètre: ";
		
		return Response.status(200).entity(output2).build();
	}
}
