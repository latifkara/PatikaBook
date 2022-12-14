package com.javaGelisme.Books;

import java.util.Comparator;

public class ClassifyBooks implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        return book.getName().compareTo(t1.getName());
    }
}
