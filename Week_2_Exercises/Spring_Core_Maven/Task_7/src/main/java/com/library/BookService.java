package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Constructor for Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Methods and logic for BookService
}
