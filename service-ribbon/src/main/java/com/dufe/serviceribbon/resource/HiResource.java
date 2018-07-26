package com.dufe.serviceribbon.resource;

import com.dufe.serviceribbon.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class HiResource {


    @Autowired
    IHelloService helloService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
