package org.karthikeyan.library.service;

import org.karthikeyan.library.repository.BookRepository;


public class BookService {
    BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void executeRepository(){
        bookRepository.execute();
    }
}
