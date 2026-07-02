package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point that loads the Spring IoC container and verifies
 * that Dependency Injection wired BookRepository into BookService
 * correctly (i.e. Spring, not our code, created and connected the beans).
 */
public class LibraryManagementApplication {

    public static void main(String[] args) {
        // 1. Spring reads applicationContext.xml and builds the IoC container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. Ask the container for the bean - Spring returns it already wired
        BookService bookService = (BookService) context.getBean("bookService");

        // 3. Prove the injection worked: if bookRepository were null inside
        //    BookService, these calls would throw a NullPointerException.
        System.out.println("--- Testing Dependency Injection ---");
        bookService.getBookDetails(101);
        bookService.addBook("Effective Java");

        System.out.println("\nSUCCESS: BookRepository was injected into BookService by Spring.");
        System.out.println("No 'new BookRepository()' was ever called in application code.");
    }
}
