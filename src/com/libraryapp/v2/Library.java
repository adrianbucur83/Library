package com.libraryapp.v2;

import java.util.ArrayList;

class Library {


    private ArrayList<Book> catalog = new ArrayList<>();


    void addBook(String type, String bookName, int pagesCount, String extraInfo) {

        if (type.equalsIgnoreCase("Novel")) {
            catalog.add(new Novel(bookName, pagesCount, extraInfo));

        } else if (type.equalsIgnoreCase("artbook")) {
            catalog.add(new ArtBook(bookName, pagesCount, extraInfo));
        } else {
            System.err.println("Unknown book type");
        }

    }


//    deleteBook(String bookname);

    void listBooks() {


        for (Book c : catalog
        ) {
            System.out.println(c.toString());

        }


    }

    void deletebook(String bookName) {

        for (Book c : catalog
        ) {
            if (c.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("Removing book number " + catalog.indexOf(c) + " book name " + c.getBookName());
                catalog.remove(c);
            }

        }


    }


}
