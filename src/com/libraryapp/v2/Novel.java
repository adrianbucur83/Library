package com.libraryapp.v2;

public class Novel extends Book {


    private String novelType;

    Novel(String bookName, int pagesCount, String novelType) {

        super(bookName, pagesCount);
        this.novelType = novelType;

    }

    @Override
    public String toString() {
        return super.toString() + "Novel{" +
                "novelType='" + novelType + '\'' +
                '}';
    }
}
