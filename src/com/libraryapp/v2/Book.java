package com.libraryapp.v2;

public class Book {


    private String bookName;
    private int pagesCount;


    Book(String bookName, int pagesCount) {

        this.bookName = bookName;
        this.pagesCount = pagesCount;
    }

    Book() {
        this("undefined", 0);
    }

    String getBookName() {
        return bookName;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
