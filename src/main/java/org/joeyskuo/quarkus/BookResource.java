package org.joeyskuo.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/books")
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "Understanding Quarkus", "jkuo", 2024, "Java"),
            new Book(2, "Effective Java", "jkuo", 2022, "Java"),
            new Book(3, "Practicing Quarkus", "antonio", 2020, "IT")
        );
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
