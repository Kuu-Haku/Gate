package com.gates.weixin.service;

import javax.jws.WebParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gates.weixin.entity.ReceiveMsg;

@Path("/SystemEntrance")
public interface SystemEntranceService {
	@POST
	@Path("/Entrance")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTest(@WebParam(name = "xml")ReceiveMsg msg);
}
