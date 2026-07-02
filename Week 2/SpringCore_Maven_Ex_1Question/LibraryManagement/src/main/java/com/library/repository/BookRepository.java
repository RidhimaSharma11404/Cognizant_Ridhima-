package com.library.repository;

/**
 * Repository layer - simulates data access for books.
 * In a real application, this would talk to a database.
 */
public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository: instance created.");
    }

    public String findBookById(int id) {
        // Simulated lookup - normally this would query a database
        return "Book #" + id + " - 'The Pragmatic Programmer'";
    }

    public void save(String bookTitle) {
        System.out.println("BookRepository: Saved book -> " + bookTitle);
    }
}
