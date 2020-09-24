package com.exempel;

public class RomanceBook extends Book {

    private String romanceGenre;

    public RomanceBook(String bookId, String title, String author, String year, String genre, double price, String romanceGenre) {
        super(bookId, title, author, year, genre, price);
        this.romanceGenre = romanceGenre;
    }

    public String getRomanceGenre() {
        return romanceGenre;
    }

    public void setRomanceGenre(String romanceGenre) {
        this.romanceGenre = romanceGenre;
    }

    @Override
    public String toString(){
        return super.toString()+ " Romance Genre: " + romanceGenre;
    }
}