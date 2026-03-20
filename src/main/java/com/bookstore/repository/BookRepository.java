package com.bookstore.repository;

import com.bookstore.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> getAllBooks() {
        return bookList;
    }
}