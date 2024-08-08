// BookService.java
package com.library;

public class BookService {
    private BookRepository bookRepository;

    // Constructor for Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        bookRepository.addBook();
    }
}
