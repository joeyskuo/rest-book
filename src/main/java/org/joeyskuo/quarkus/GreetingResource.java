package org.joeyskuo.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("hello");
        return "Hello World";
    }

    @GET
    @Path("/page")
    @Produces(MediaType.TEXT_HTML)
    public String helloHtml() {
        return "<div>" +
                "<h1>Book API</h1>" +
                "<div>Hello World</div>" +
                "</div>";
    }
}
