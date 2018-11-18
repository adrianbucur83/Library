
/*    Create a small application that mimics a library catalog. It needs to be able to add books,
   delete books and list books. Books are of two kinds: novels and art albums. They both have names
   and number of pages. Novels have type (like mystery, sf, etc.) while albums have paper quality.

      Model these entities (book, novel, album) with different classes and inheritance.*/


package com.libraryapp.v2;

public class Main {

    public static void main(String[] args) {

        Library UBB = new Library();

        UBB.addBook("novel", "Moara de vant", 30, "scifi");
        UBB.addBook("artbook", "Desene rupestre", 550, "50");

        UBB.listBooks();
        UBB.deletebook("Moara de vant");


    }
}
