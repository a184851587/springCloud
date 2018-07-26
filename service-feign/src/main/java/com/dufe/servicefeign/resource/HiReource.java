package com.dufe.servicefeign.resource;

import com.dufe.servicefeign.client.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/hi")
public class HiReource {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hi(@QueryParam("name") String name){

        return  schedualServiceHi.sayHiFromClientOne(name);
    }


}
