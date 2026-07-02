package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point - loads the Spring ApplicationContext from
 * applicationContext.xml and exercises the BookService bean.
 */
public class Main {

    public static void main(String[] args) {
        // Load the Spring container using the XML configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the fully wired BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test that dependency injection worked
        bookService.getBookDetails(101);
        bookService.addBook("Effective Java");

        System.out.println("\nSpring context loaded and beans wired successfully!");
    }
}
