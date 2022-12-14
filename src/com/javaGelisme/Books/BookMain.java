package com.javaGelisme.Books;

import java.util.TreeSet;

public class BookMain {

    public static void classifyByNameID(TreeSet<Book> hashSet, Object classifyBooks){
        hashSet.add(new Book("The King", 102, "Ahmet", "10/01/2001"));
        hashSet.add(new Book("Alone", 132, "Hasan", "01/11/2010"));
        hashSet.add(new Book("Silent", 178, "Yavuz", "16/05/2012"));
        hashSet.add(new Book("The bitch", 122, "Selim", "12/05/2020"));
        hashSet.add(new Book("Harry botter", 204, "Ali", "10/01/2011"));

        for (Book book: hashSet){
            System.out.println(book.getName());
        }
    }
    public static void main(String[] args) {
        ClassifyBooks classifyBooks = new ClassifyBooks();
        TreeSet<Book> hashSet = new TreeSet<>(classifyBooks);

        ClassifyBookById classifyBookById = new ClassifyBookById();
        TreeSet<Book> treeSet = new TreeSet<>(classifyBookById);

        classifyByNameID(hashSet, classifyBooks);
        System.out.println("--------------------");
        classifyByNameID(treeSet, classifyBookById);
    }
}
