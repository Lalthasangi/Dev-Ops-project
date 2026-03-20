package com.bookstore.service;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository repository = new BookRepository();

    public void addBook(int id, String title, double price) {
        Book book = new Book(id, title, price);
        repository.addBook(book);
    }

    public List<Book> getBooks() {
        return repository.getAllBooks();
    }
}