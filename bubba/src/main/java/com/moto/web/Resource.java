package com.moto.web;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("car")
public class Resource {

 @Context
 private HttpHeaders heads;
 private Car c;
 public Resource(){
   c=new Car();
   c.setMake("Toyota");
   c.setModel("FJ");
   c.setColor("Green");
   c.setVin("FJC88903248234FGHN889");
 }
    @GET
    public String m1(){
        String user_agent=heads.getHeaderString("user-agent");

        return "Hello World, you are using: " +user_agent;
    }

    @GET
    @Path("a")
    public String m2(@DefaultValue("mr x")@QueryParam("name")String name){
        return "This is M2: "+name;
    }

    @GET
    @Path("a/{id}")
    public String m3(@PathParam("id")String id){
        return "Yo from path param id: "+id;
    }

    @GET
    @Path("c")
    @Produces({MediaType.APPLICATION_JSON})
    public Car m4(){
        System.out.println(heads.getHeaderString("accept"));
      return c;
    }

}
