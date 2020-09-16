package com.exempel;

public class Romance extends Books{

    private String romanceGenre;

    public Romance(String bookId, String title, String author, String year, String genre, double price, String romanceGenre) {
        super(bookId, title, author, year, genre, price);
        this.romanceGenre = romanceGenre;
    }

    public String getRomanceGenre() {
        return romanceGenre;
    }

    public void setRomanceGenre(String romanceGenre) {
        this.romanceGenre = romanceGenre;
    }
}
