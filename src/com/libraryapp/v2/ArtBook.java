package com.libraryapp.v2;

public class ArtBook extends Book {
    private int paperQuality;

    ArtBook(String bookName, int pagesCount, String paperQuality) {

        super(bookName, pagesCount);
        this.paperQuality = Integer.parseInt(paperQuality);

    }

    public int getPaperQuality() {
        return paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() + "ArtBook{" +
                "paperQuality=" + paperQuality +
                '}';
    }
}
