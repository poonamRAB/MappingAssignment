package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable String id){
        return bookService.getBookById(id);
    }

    @GetMapping("book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("book/{id}")
    public String updateBookById(@PathVariable String id,@RequestBody Book book){
        return bookService.updateBookById(id,book);
    }

    @DeleteMapping("/book")
    public String deleteBook(@PathVariable String id){
        return bookService.deleteBook(id);
    }
}
