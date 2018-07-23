package com.dufe.servicehi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/hi")
public class HiReource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hi(@QueryParam("name") String name){
        Map map = new HashMap();
           map.put("hi:","this is jesery test!");
       // return Response.status(Response.Status.OK).entity(map).build();
        String hi = "this is jesery test!"+"  "+name;
        return  hi;
    }


}
