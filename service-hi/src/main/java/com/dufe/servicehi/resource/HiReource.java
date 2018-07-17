package com.dufe.servicehi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.Map;

@Path("/hi")
public class HiReource {
    @GET
    public Map  hi(){
        Map map = new HashMap();
           map.put("hi","this is jesery test!");
        return map;
    }
}
