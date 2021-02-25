package com.example.lab3Practice.controller;

import com.example.lab3Practice.Entity.Book;
import com.example.lab3Practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping (path = "/sample")
public class BookController {

    @Autowired
    private BookService bookService;

//    @GetMapping
//    public String getBooks(){
//
//        return "Hello World";
//    }

    @GetMapping
    public Collection<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
}
