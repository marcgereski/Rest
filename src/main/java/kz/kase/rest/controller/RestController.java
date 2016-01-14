package kz.kase.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/actions")
public class RestController {
    @Path("/hello")
    @GET
    @Produces("text/plain")
    public String sayHello() {
        System.out.println("Got Get Request...");
        return "Get: Hello World";
    }

    @Path("/hello2")
    @POST
    @Produces("text/plain")
    public String sayHello2() {
        System.out.println("Got Post Request...");
        return "Post: Hello World";
    }
}
