package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class Index {
	@GET
	public Response getMsg() {
		String output = "Welcome! This is my index!";
		return Response.status(200).entity(output).build();
	}
}
