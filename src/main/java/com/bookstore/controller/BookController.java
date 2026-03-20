package com.bookstore.controller;

import com.bookstore.service.BookService;
import com.bookstore.model.Book;
import java.util.List;

public class BookController {

    private BookService service = new BookService();

    public void addSampleBooks() {
        service.addBook(1, "Java Basics", 299.0);
        service.addBook(2, "DevOps Guide", 399.0);
    }

    public void displayBooks() {
        List<Book> books = service.getBooks();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}