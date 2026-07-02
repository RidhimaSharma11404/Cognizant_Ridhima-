package com.library.service;

import com.library.repository.BookRepository;

/**
 * Service layer - contains business logic and delegates
 * data access to BookRepository (injected by Spring).
 */
public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService: instance created.");
    }

    // Setter used by Spring for dependency injection (see applicationContext.xml)
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void getBookDetails(int id) {
        String book = bookRepository.findBookById(id);
        System.out.println("BookService: Retrieved -> " + book);
    }

    public void addBook(String title) {
        bookRepository.save(title);
    }
}
