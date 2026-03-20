package com.bookstore.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.bookstore.model.Book;

public class BookServiceTest {

    @Test
    public void testAddBook() {
        BookService service = new BookService();

        service.addBook(1, "Test Book", 100.0);
        List<Book> books = service.getBooks();

        assertEquals(1, books.size());
        assertEquals("Test Book", books.get(0).getTitle());
    }
}