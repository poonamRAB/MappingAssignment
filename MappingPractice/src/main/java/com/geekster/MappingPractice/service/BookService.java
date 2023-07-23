package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book);
        return "Book added successfully!!";
    }

    public Book getBookById(String id) {
        return bookRepo.findById(id).get();
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updateBookById(String id, Book book) {
        bookRepo.save(book);
        return "Book updated successfully!!";
    }

    public String deleteBook(String id) {
        bookRepo.deleteById(id);
        return "book deleted successfully!!";
    }
}
