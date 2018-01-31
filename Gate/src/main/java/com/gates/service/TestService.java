package com.gates.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gates.entity.Test;

@Path("/test")
public interface TestService {
	@GET
	@Path("/getmsg/{dd}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Test getTest(@PathParam("dd") String name);
}
