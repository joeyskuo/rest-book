package org.joeyskuo.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@Path("/api/books")
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @Inject
    Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        logger.info("/api/books");
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countAllBooks() {
        logger.info("/api/books/count");
        return bookRepository.countAllBooks();
    }

    @GET
    @Path("{id}")
    public Optional<Book> getBookById(@PathParam("id") int id) {
        logger.info("/api/books/" + id);
        return bookRepository.getBookById(id);
    }

    @GET
    @Path("/page")
    @Produces(MediaType.TEXT_HTML)
    public String helloHtml() {
        logger.info("/api/books/page");
        return "<div>" +
                "<h1>Book API</h1>" +
                "<div>Hello World</div>" +
                "</div>";
    }
}
