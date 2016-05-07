package hu.training.java8tutorial.domain;

import java.time.LocalDate;
import java.util.List;

public class Book {

    private final String title;
    private final List<Person> authors;

    private String isbn;
    private LocalDate dateOfPublication;

    public Book(String title, List<Person> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public List<Person> getAuthors() {
        return authors;
    }

}
