package com.isho.java_rest_app;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/aliens")
public class AlienRepository {
	
	@GET
	@Path("/get-alien")	
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien() {
		Alien a1 = new Alien();
		a1.setName("Cleo");
		a1.setPoints(100);
		return a1;
	}
	
	
	@GET
	@Path("/get-alien-list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAlienList() {
		Alien a1 = new Alien();
		a1.setName("Meo");
		a1.setPoints(95);
		
		Alien a2 = new Alien();
		a2.setName("Breo");
		a2.setPoints(78);
	
		List<Alien> aliens = Arrays.asList(a1,a2);
		
		return aliens;
	}
	
}
