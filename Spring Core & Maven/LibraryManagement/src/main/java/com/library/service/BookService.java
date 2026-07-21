package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    //setter injection
    public void setBookRepository(BookRepository brepo){
        this.bookRepository=brepo;
    }

    //constructor injection
    public void BookRepository(BookRepository brepo){
        this.bookRepository=brepo;
    }

    public void displayService(){
        System.out.println("BookService is working...");
        bookRepository.displayRepository();
    }
}
