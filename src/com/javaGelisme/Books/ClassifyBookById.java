package com.javaGelisme.Books;

import java.util.Comparator;

public class ClassifyBookById implements Comparator<Book> {

    @Override
    public int compare(Book book, Book t1) {
        return book.getPageCount() - t1.getPageCount();
    }
}
