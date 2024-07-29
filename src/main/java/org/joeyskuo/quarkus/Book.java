package org.joeyskuo.quarkus;

public class Book {

    public int id;
    public String title;
    public String author;
    public String yearOfPublication;
    public String genre;

    public Book(int id, String title, String author, String yearOfPublication, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }
}
