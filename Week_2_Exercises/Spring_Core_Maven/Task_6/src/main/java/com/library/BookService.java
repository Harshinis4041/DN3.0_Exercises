package com.library;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    // Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Methods and logic for BookService
}
