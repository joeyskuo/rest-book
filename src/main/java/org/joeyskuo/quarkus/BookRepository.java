package org.joeyskuo.quarkus;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    @ConfigProperty(name = "books.genre", defaultValue = "Coding")
    String genre;

    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "Understanding Quarkus", "jkuo", 2024, genre),
            new Book(2, "Effective Java", "jkuo", 2022, genre),
            new Book(3, "Practicing Quarkus", "antonio", 2020, genre)
        );
    }

    public int countAllBooks() {
        return getAllBooks().size();
    }

    public Optional<Book> getBookById(int id) {
        return getAllBooks().stream().filter(book -> book.id == id).findFirst();
    }

}
