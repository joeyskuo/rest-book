package org.joeyskuo.quarkus;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "Understanding Quarkus", "jkuo", 2024, "Java"),
            new Book(2, "Effective Java", "jkuo", 2022, "Java"),
            new Book(3, "Practicing Quarkus", "antonio", 2020, "IT")
        );
    }

    public int countAllBooks() {
        return getAllBooks().size();
    }

    public Optional<Book> getBookById(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }

}
