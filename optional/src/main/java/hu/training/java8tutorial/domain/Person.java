package hu.training.java8tutorial.domain;

import java.awt.print.Book;
import java.util.List;

public class Person {

    private final String firstName;
    private final String lastName;
    private Book theMostFavouriteBook;
    private List<Book> bookWritten;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Book getTheMostFavouriteBook() {
        return theMostFavouriteBook;
    }

    public void setTheMostFavouriteBook(Book theMostFavouriteBook) {
        this.theMostFavouriteBook = theMostFavouriteBook;
    }

    public List<Book> getBookWritten() {
        return bookWritten;
    }

    public void setBookWritten(List<Book> bookWritten) {
        this.bookWritten = bookWritten;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

}
