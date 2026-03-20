package com.bookstore;

import com.bookstore.controller.BookController;

public class MainApp {
    public static void main(String[] args) {

        BookController controller = new BookController();

        controller.addSampleBooks();
        controller.displayBooks();
    }
}